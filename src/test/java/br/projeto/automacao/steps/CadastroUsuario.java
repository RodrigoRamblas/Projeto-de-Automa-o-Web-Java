package br.projeto.automacao.steps;

import br.projeto.automacao.driver.Driver;
import br.projeto.automacao.page.SigupLogin;
import com.github.javafaker.Faker;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class CadastroUsuario extends Driver {
	Driver driver = new Driver();
	Faker faker = new Faker();
	SigupLogin sigupLogin = new SigupLogin();
	private Random random;
	private String url;
	private String primeiroNome = faker.name().firstName();
	private String ultimoNome = faker.name().lastName();

	private String nomeCompleto = faker.name().fullName();

	@Dado("^que o usuário acessa o site \"([^\"]*)\"$")
	public void que_o_usuário_acessa_o_site(String url) throws Throwable {
		this.url = url;
		driver.acessarAUrl(url);
		driver.maximizeNavegador();
	}

	@Quando("^clica em \"([^\"]*)\"$")
	public void clica_em(String botao) throws Exception {
		try {
			driver.clicarPorXpathAContains(botao);
		} catch(Exception ex){
			System.out.printf("Não encontrou o botão %s Mensagem: %s",botao, ex.getMessage());
			driver.acessarUrlPeloCaminho(url + "/login");
		}
	}

	@Quando("^preenche o \"([^\"]*)\" e \"([^\"]*)\" e clica no botão \"([^\"]*)\"$")
	public void preenche_o_Nome_e_e_clica_no_botão(String name, String email, String signup) throws Throwable {
		driver.preencerPorXpath(sigupLogin.Name(), primeiroNome);
		driver.preencerPorXpath(sigupLogin.Email(), primeiroNome + "_." + ultimoNome + email);
		driver.clicarPorXpathButtonContains(signup);
	}

	@Quando("^preencher o \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void preencher_o(String titulo, String password, String data_de_aniversario, String arg4, String arg5) throws Throwable {
		switch(titulo)
		{
			case "Mr.":
				driver.clicarPorId(sigupLogin.Mr());
				break;
			case "Mrs.":
				driver.clicarPorId(sigupLogin.Mrs());
				break;
			default:
				System.out.println("Não existe o botão: " + titulo);
		}
		driver.preencherPorId(sigupLogin.Password(), password, true);
		String data = data_de_aniversario;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.parse(data, format);
		String diaDaSemana = String.valueOf(localDate.getDayOfMonth());
		driver.preencherPorId(sigupLogin.Dia(), diaDaSemana, false);

	}

	@Quando("^preencher os dados pessoais$")
	public void preencher_os_dados_pessoais() throws Throwable {
	}

	@Então("^deve criar a conta$")
	public void deve_criar_a_conta() throws Throwable {
	}

	@After
	public void fecharBrowser() {
		driver.fecharOSite();
	}
}
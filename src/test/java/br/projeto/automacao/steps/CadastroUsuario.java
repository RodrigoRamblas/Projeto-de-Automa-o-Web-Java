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
	private String empresa = faker.company().name();
	private String endereco = faker.address().streetName();
	private String endereco2 = faker.address().streetAddress();
	private String estado = faker.address().state();
	private String cidade = faker.address().city();
	private String cep = faker.address().zipCode();
	private String numero = faker.phoneNumber().cellPhone();



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
	public void preencher_o(String titulo, String password, String data_de_aniversario, String inscreva_se_para_nossas_novidades, String receba_ofertas_especiais_de_nossos_parceiros) throws Throwable {
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

		driver.preencherComboValor(sigupLogin.Mes(), String.valueOf(localDate.getMonthValue()));

		String anoEscolhido = String.valueOf(localDate.getYear());
		driver.preencherPorId(sigupLogin.Ano(), anoEscolhido, false);


		if(inscreva_se_para_nossas_novidades.equals("Sim"))
		{
			driver.clicarPorId(sigupLogin.InscrevaSeParaNossasNovidades());
		}

		if(receba_ofertas_especiais_de_nossos_parceiros.equals("Sim"))
		{
			driver.clicarPorId(sigupLogin.RecebaOfertasEspeciaisDeNossosParceiros());
		}
	}

	@Quando("^preencher os dados pessoais$")
	public void preencher_os_dados_pessoais() throws Throwable {
		driver.preencherPorId(sigupLogin.PrimeiroNome(), primeiroNome, true);
        driver.preencherPorId(sigupLogin.UltimoNome(), ultimoNome, true);
		driver.preencherPorId(sigupLogin.Empresa(), empresa, true);
		driver.preencherPorId(sigupLogin.Endereco(), endereco, true);
		driver.preencherPorId(sigupLogin.Endereco2(), endereco2, true);
		driver.preencherComboValor(sigupLogin.Pais(), "1");
		driver.preencherPorId(sigupLogin.Estado(), estado, true);
		driver.preencherPorId(sigupLogin.Cidade(), cidade, true);
		driver.preencherPorId(sigupLogin.CEP(), cep, true);
		driver.preencherPorId(sigupLogin.Numero(), numero, true);
	}

	@Então("^deve criar a conta$")
	public void deve_criar_a_conta() throws Throwable {
		driver.clicarPorXpathButtonContains("Create Account");
	}

	@After
	public void fecharBrowser() {
		driver.fecharOSite();
	}
}
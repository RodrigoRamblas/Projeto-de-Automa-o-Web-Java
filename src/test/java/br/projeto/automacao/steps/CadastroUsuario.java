package br.projeto.automacao.steps;
import br.projeto.automacao.driver.Driver;
import br.projeto.automacao.page.ComprasItens;
import br.projeto.automacao.page.SigupLogin;
import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
//alteracao
public class CadastroUsuario extends Driver {
	Driver driver = new Driver();
	Faker faker = new Faker();
	SigupLogin sigupLogin = new SigupLogin();
	ComprasItens comprar = new ComprasItens();

	private String nomeCartao = faker.name().fullName();
	private String numeroCartao = faker.finance().creditCard();
	private String cvc = faker.numerify("###");
	private String mesExpiracao = String.valueOf(faker.number().numberBetween(1, 12));
	private String anoExpiracao = String.valueOf(faker.number().numberBetween(2023, 2039));
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
	public void que_o_usuario_acessa_o_site(String url) throws Throwable {
		try {
			this.url = url;
			driver.acessarAUrl(url);
			driver.maximizeNavegador();
		} catch (Exception ex) {
			ex.getMessage();
		}
	}

	@Quando("^clica em \"([^\"]*)\"$")
	public void clica_em(String botao) throws Exception {
		try {
			driver.clicarPorXpathAContains(botao);
		} catch (Exception ex) {
			System.out.printf("Não encontrou o botão %s Mensagem: %s", botao, ex.getMessage());
			driver.acessarUrlPeloCaminho(url + "/login");
		}
	}

	@Quando("preenche o {string} e {string} e clica no botão {string}")
	public void preenche_o_e_e_clica_no_botão(String name, String email, String signup) {
		driver.preencherPorXpath(sigupLogin.Name(), primeiroNome, true);
		driver.preencherPorXpath(sigupLogin.Email(), primeiroNome + "_." + ultimoNome + email, true);
		driver.clicarPorXpathButtonContains(signup);
	}

	@Quando("^preencher o \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void preencher_o(String titulo, String password, String data_de_aniversario, String inscreva_se_para_nossas_novidades, String receba_ofertas_especiais_de_nossos_parceiros) throws Throwable {
		switch (titulo) {
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


		if (inscreva_se_para_nossas_novidades.equals("Sim")) {
			driver.clicarPorId(sigupLogin.InscrevaSeParaNossasNovidades());
		}

		if (receba_ofertas_especiais_de_nossos_parceiros.equals("Sim")) {
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
		driver.preencherComboValor(sigupLogin.Pais(), "Canada");
		driver.preencherPorId(sigupLogin.Estado(), estado, true);
		driver.preencherPorId(sigupLogin.Cidade(), cidade, true);
		driver.preencherPorId(sigupLogin.CEP(), cep, true);
		driver.preencherPorId(sigupLogin.Numero(), numero, true);
	}

	@Então("^deve criar a conta$")
	public void deve_criar_a_conta() throws Throwable {
		driver.clicarPorXpathButtonContains("Create Account");
		String texto = driver.pegarTextoPorXpath(sigupLogin.ContaCriadaComSucesso());
		Assert.assertEquals("ACCOUNT CREATED!", texto);
		driver.clicarPorXpath(sigupLogin.BotaoContinuar());

	}

	@Quando("^Eu quero fazer a compra de ao menos três produtos$")
	public void eu_quero_fazer_a_compra_de_ao_menos_três_produtos() throws Throwable {
		driver.pageDown(0);
		driver.clicarPorXpath(sigupLogin.ViewStylishDress());
		driver.preencherPorXpath(sigupLogin.Quantidade(), "3", true);
		driver.clicarPorXpath(sigupLogin.AddToCart());
		driver.clicarPorXpathButtonContains(sigupLogin.ContinueShopping());
		driver.clicarPorXpath(sigupLogin.Products());
		driver.pageDown(7);
		driver.clicarPorXpath(sigupLogin.ViewBeautifulPeacockBlueCottonLinenSaree());
		driver.preencherPorXpath(sigupLogin.Quantidade(), "2", true);
		driver.clicarPorXpath(sigupLogin.AddToCart());
		driver.clicarPorXpathButtonContains(sigupLogin.ContinueShopping());
		driver.clicarPorXpath(sigupLogin.Products());
		driver.pageDown(0);
		driver.clicarPorXpath(sigupLogin.ViewMenTshirt());
		driver.preencherPorXpath(sigupLogin.Quantidade(), "1", true);
		driver.clicarPorXpath(sigupLogin.AddToCart());
		driver.clicarPorXpathButtonContains(sigupLogin.ContinueShopping());
	}

	@Então("^Para que eu possa estar bem vestida$")
	public void para_que_eu_possa_estar_bem_vestida() throws Throwable {
		driver.clicarPorXpath(sigupLogin.Cart());
		driver.clicarPorXpath(sigupLogin.ProceedtoCheckout());
		driver.pageDown(0);
		driver.clicarPorXpath(sigupLogin.PlaceOrder());
		driver.preencherPorXpath(sigupLogin.NomeCartao(), nomeCartao, true);
		driver.preencherPorXpath(sigupLogin.NumeroCartao(), numeroCartao, true);
		driver.preencherPorXpath(sigupLogin.CVC(), cvc, true);
		driver.preencherPorXpath(sigupLogin.MesExpiracao(), mesExpiracao, true);
		driver.preencherPorXpath(sigupLogin.AnoExpiracao(), anoExpiracao, true);
		driver.clicarPorXpath(sigupLogin.Submit());
		Assert.assertEquals("ORDER PLACED!", driver.pegarTextoPorXpath(sigupLogin.OrdemCriada()));
		driver.clicarPorXpath(sigupLogin.Continuar());
	}

	@After
	public void tearDown() {
		driver.fecharBrowser();
	}

}
package br.projeto.automacao.steps;
import br.projeto.automacao.driver.Driver;
import br.projeto.automacao.page.ComprasItens;
import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.pt.*;
import java.util.Random;

public class RealizarCompra extends Driver {
	Driver driver = new Driver();
    Faker faker = new Faker();
    ComprasItens comprar = new ComprasItens();
    private Random random;
    private String url;
    private String nomeCartao = faker.name().fullName();
    private String numeroCartao = faker.finance().creditCard();
    private String cvc = faker.numerify("###");
    private String mesExpiracao = String.valueOf(faker.number().numberBetween(1,12));
    private String anoExpiracao = String.valueOf(faker.number().numberBetween(2023,2039));


    @Dado("^que busco pelo site \"([^\"]*)\"$ no navegador")
    public void que_busco_pelo_site_no_navegador(String url) throws Throwable {
        try{
            this.url = url;
            driver.acessarAUrl(url);
            driver.maximizeNavegador();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    @E("^devo ir para a tela principal da Automation Exercise")
    public void devo_ir_para_a_tela_principal_da_Automation_Exercise() throws Throwable{
        driver.clicarPorXpath(comprar.Home());
    }



    @After
    public void tearDown() {

    }
}
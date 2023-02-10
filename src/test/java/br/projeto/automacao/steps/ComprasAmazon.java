package br.projeto.automacao.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import junit.framework.Assert;
/*
public class ComprasAmazon {
	
	private WebDriver driver;
	
	@Before
	public void configurarBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Dado("^que busco pelo site \"([^\"]*)\" no navegador$")
	public void que_busco_pelo_site_no_navegador(String url) throws Throwable {
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	@Dado("^Como um cliente cadastrado no \"([^\"]*)\"$")
	public void como_um_cliente_cadastrado_no(String url) throws Throwable {
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	@Então("^devo ir para a tela principal da Amazon$")
	public void devo_ir_para_a_tela_principal_da_Amazon() throws Throwable {
	    Assert.assertEquals("https://www.amazon.com.br/", driver.getCurrentUrl());
	    Assert.assertEquals("Amazon.com.br | Compre livros, Kindle, Echo, Fire Tv e mais.", driver.getTitle());
	}
	
	@Quando("^clico no botão \"([^\"]*)\"$")
	public void clico_no_botão(String botao) throws Throwable {
        switch(botao)
        {
            case "Faça seu login":
                driver.findElement(By.cssSelector("#nav-signin-tooltip .nav-action-inner")).click();
                break;
            case "Continuar":
            	driver.findElement(By.id("continue")).click();
                break;
            case "Fazer login":
            	driver.findElement(By.id("signInSubmit")).click();
            	break;
            case "Adicionar endereço":
            	driver.findElement(By.id("a-button-input")).click();
            	break;
            default:
                System.out.println("Não existe o botão: " + botao);
        }
	}

	@Então("^devo ir para a tela \"([^\"]*)\"$")
	public void devo_ir_para_a_tela(String fazerLogin) throws Throwable {
		Assert.assertEquals(fazerLogin, driver.findElement(By.cssSelector(".a-spacing-small:nth-child(1)")).getText());
	}

	@Quando("^digito o meu \"([^\"]*)\"$")
	public void digito_o_meu(String emailOuNumeroDeTelefoneCelular) throws Throwable {
	    driver.findElement(By.id("ap_email")).sendKeys(emailOuNumeroDeTelefoneCelular);
	}

	@Quando("^digito a minha \"([^\"]*)\"$")
	public void digito_a_minha(String senha) throws Throwable {
	    driver.findElement(By.id("ap_password")).sendKeys(senha);
	}

	@Então("^devo me logar$")
	public void devo_me_logar() throws Throwable {
		Assert.assertEquals("https://www.amazon.com.br/ap/signin", driver.getCurrentUrl());
		Assert.assertEquals("Amazon.com.br | Compre livros, Kindle, Echo, Fire Tv e mais.", driver.getTitle());
	}
	
	@After
	public void fecharBrowser() {
		driver.quit();
	}
}

 */
package br.projeto.automacao.steps;

import com.github.javafaker.Faker;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;

public class AutomationExercise {
	
	private WebDriver driver;
	
	@Before
	public void configurarBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Dado("^Como um cliente cadastrado no \"([^\"]*)\"$")
	public void como_um_cliente_cadastrado_no_https_automationexercise_com(String url) throws Throwable {
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	@Então("^devo ir para a tela principal da Amazon$")
	public void devo_ir_para_a_tela_principal_da_Amazon() throws Throwable {
		Assert.assertEquals("https://automationexercise.com/", driver.getCurrentUrl());
		Assert.assertEquals("Automation Exercise", driver.getTitle());
		Faker faker = new Faker();
		faker.name();
	}

	@Quando("^Eu quero fazer a compra de ao menos três produtos$")
	public void eu_quero_fazer_a_compra_de_ao_menos_três_produtos() throws Throwable {

	}

	@Então("^Para que eu possa estar bem vestida$")
	public void para_que_eu_possa_estar_bem_vestida() throws Throwable {

	}
	
	@After
	public void fecharBrowser() {
		driver.quit();
	}
}
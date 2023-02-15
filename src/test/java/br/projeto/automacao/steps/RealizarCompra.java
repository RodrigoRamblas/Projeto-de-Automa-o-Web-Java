package br.projeto.automacao.steps;

import br.projeto.automacao.driver.Driver;
import br.projeto.automacao.page.ComprasItens;
import br.projeto.automacao.page.SigupLogin;
import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.pt.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class RealizarCompra extends Driver {
	Driver driver = new Driver();
    ComprasItens comprar = new ComprasItens();

    @Quando("^Eu quero fazer a compra de ao menos três produtos$")
    public void eu_quero_fazer_a_compra_de_ao_menos_três_produtos() throws Throwable {
        driver.clicarPorXpat(comprar.BlueTop());
        driver.clicarPorXpathButtonContains(comprar.ContinueShopping());
        driver.clicarPorXpat(comprar.MenTshirt());
        driver.clicarPorXpathButtonContains(comprar.ContinueShopping());
        driver.clicarPorXpat(comprar.SleevelessDress());
        driver.clicarPorXpathButtonContains(comprar.ContinueShopping());
    }

    @Então("^Para que eu possa estar bem vestida$")
    public void para_que_eu_possa_estar_bem_vestida() throws Throwable {

    }

	@After
	public void fecharBrowser() {
		//driver.fecharOSite();
	}
}
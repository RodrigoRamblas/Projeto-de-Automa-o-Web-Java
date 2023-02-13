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

public class RealizarCompra extends Driver {
	Driver driver = new Driver();

    @Quando("^Eu quero fazer a compra de ao menos três produtos$")
    public void eu_quero_fazer_a_compra_de_ao_menos_três_produtos() throws Throwable {

    }

    @Então("^Para que eu possa estar bem vestida$")
    public void para_que_eu_possa_estar_bem_vestida() throws Throwable {

    }

	@After
	public void fecharBrowser() {
		driver.fecharOSite();
	}
}
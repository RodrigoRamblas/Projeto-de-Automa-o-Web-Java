package br.projeto.automacao.web.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/compra_de_menos_tres_produtos.feature",
		glue = "br.projeto.automacao.steps",
		tags = "@compraDeTresProdutos",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.UNDERSCORE,
		dryRun = false,
		strict = false
		)
public class RunnerTest {

}

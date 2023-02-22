package br.projeto.automacao.web.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.UNDERSCORE;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/compra_de_menos_tres_produtos.feature",
		glue = "br.projeto.automacao.steps",
		tags = "@realizarOCadastroDoCliente",
		plugin = {"pretty", "html:target/report.html", "json:target/report.json"},
		monochrome = true,
		snippets = UNDERSCORE,
		dryRun = false
		)
public class RunnerTest {

}
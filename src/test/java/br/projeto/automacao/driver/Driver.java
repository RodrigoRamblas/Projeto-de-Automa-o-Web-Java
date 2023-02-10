package br.projeto.automacao.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private WebDriver driver;

    public WebDriver iniciarDiver() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
    public void acessarAUrl(String url) {
        iniciarDiver();
        driver.get(url);
    }
    public void acessarUrlPeloCaminho(String url){
        driver.get(url);
    }
    public void maximizeNavegador(){driver.manage().window().maximize();}
    public void fecharOSite(){driver.quit();}

    //Métodos clicar
    public void clicarPorlinkText(String texto){
        driver.findElement(By.linkText(texto)).click();
    }
    public void clicarPorXpathAContains(String texto){
        texto = "//a[contains(text(),'" + texto + "')]";
        driver.findElement(By.xpath(texto)).click();
    }
    public void clicarPorXpathInputName(String texto){
        texto = "//input[@name='" + texto + "')]";
        driver.findElement(By.xpath(texto)).click();
    }

    public void clicarPorXpathButtonContains(String texto){
        texto =  "//button[contains(.,'" + texto + "')]";
        driver.findElement(By.xpath(texto)).click();
    }
    public void clicarPorId(String id){
        driver.findElement(By.id(id)).click();
    }

    //Métodos preencher
    public void preencherPorId(String id, String texto, Boolean comClick){
        if(comClick){
            driver.findElement(By.id(id)).click();
            driver.findElement(By.id(id)).sendKeys(texto);
        }
        driver.findElement(By.id(id)).sendKeys(texto);
    }

    public void preencerPorXpath(String xpath, String texto){
        driver.findElement(By.xpath(xpath)).click();
        driver.findElement(By.xpath(xpath)).sendKeys(texto);
    }
    public void preencherPorXpathInputName(String campo, String texto){
        String input = "//input[@name='" + campo + "')]";
        driver.findElement(By.xpath(input)).click();
        driver.findElement(By.xpath(input)).sendKeys(texto);
    }
}

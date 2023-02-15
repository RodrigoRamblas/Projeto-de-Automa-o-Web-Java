package br.projeto.automacao.driver;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver {
    private WebDriver driver;
    //private String chromeDriver = "C:\\Users\\gqsga\\Downloads\\Chrome driver\\chromedriver.exe";
    private String chromeDriver = "C:\\Drivers\\chromedriver.exe";

    public WebDriver iniciarDriver() {
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        return driver;
    }
    public void acessarAUrl(String url) {
        iniciarDriver();
        driver.get(url);
    }
    public void acessarUrlPeloCaminho(String url){
        driver.get(url);
    }
    public void maximizeNavegador(){driver.manage().window().maximize();}
    //public void fecharOSite(){driver.quit();}

    //Métodos clicar
    public void clicarPorlinkText(String texto){
        driver.findElement(By.linkText(texto)).click();
    }
    public void clicarPorXpathAContains(String texto){
        texto = "//a[contains(text(),'" + texto + "')]";
        driver.findElement(By.xpath(texto)).click();
    }
    public void clicarPorXpath(String texto){
        driver.findElement(By.xpath(texto)).click();
    }
    public void clicarPorXpat(String texto){
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

    public void preencherComboValor(String Id, String value) {
        Select selectBox = new Select(driver.findElement(By.id(Id)));
        selectBox.selectByValue(value);
    }

        //Métodos preencher
    public void preencherPorId(String id, String texto, @NotNull Boolean comClick) throws InterruptedException {
        try {
            if(comClick){
                driver.findElement(By.id(id)).click();
                driver.findElement(By.id(id)).sendKeys(texto);
            }else {
                driver.findElement(By.id(id)).sendKeys(texto);
            }
        }catch (Exception ex){
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,250)");
            if(comClick){
                driver.findElement(By.id(id)).click();
                driver.findElement(By.id(id)).sendKeys(texto);
            }else {
                driver.findElement(By.id(id)).sendKeys(texto);
            }
            ex.getMessage();

        }

    }

    public void preencherPorXpath(String xpath, String texto, boolean b){
        driver.findElement(By.xpath(xpath)).click();
        driver.findElement(By.xpath(xpath)).sendKeys(texto);
    }
    public void preencherPorXpathInputName(String campo, String texto){
        String input = "//input[@name='" + campo + "')]";
        driver.findElement(By.xpath(input)).click();
        driver.findElement(By.xpath(input)).sendKeys(texto);
    }

    public String pegarTextoPorXpath(String xpath){
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public void fecharBrowser(){
        driver.quit();
    }
}

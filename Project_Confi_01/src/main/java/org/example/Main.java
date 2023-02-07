package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ivan\\IdeaProjects\\Project_Confi_01\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        //Definimos un objeto Javascrip para poder manipular codigo Javascrip
        JavascriptExecutor js = (JavascriptExecutor)driver;


        //Test Automation Register

        //Definimos el # de variables a ingresar
        String search = "Linkin Park";


        //Definimos el # de locators
        WebElement SearchInput = driver.findElement(By.className("gLFyf"));
        WebElement Buttoninput = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));


        //Accionamos
        SearchInput.sendKeys(search);
        Buttoninput.click();
        //Ejecutamos  codigo Javascrip sobre el scroll de pantalla
        js.executeScript("window.scroll(0,1000)");

    }
}
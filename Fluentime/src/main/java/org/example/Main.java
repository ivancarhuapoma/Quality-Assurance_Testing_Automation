package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ivan\\IdeaProjects\\Fluentime\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        //ESTA FORMA NO FUNCIONA
        /*//Declara e inicializa la espera fluida
        FluentWait wait = new FluentWait(driver);
        //Se especifica el tiempo maximo a esperar
        wait.withTimeout(Duration.ofSeconds(5000));
        //Se especifica cada cuanto se hará la verificacion
        wait.pollingEvery(Duration.ofMillis(250));
        //Se especifican las excepciones a ignorar
        wait.ignoring(NoSuchElementException.class);

        //Se especifica la condicion a esperar
        wait.until(ExpectedConditions.alertIsPresent());*/

        //ESTA ES LA FORMA SIMPLE DEL CODIGO
        //Declara e inicializa la espera fluida
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))      //Se especifica el tiempo maximo a esperar
                .pollingEvery(Duration.ofMillis(200))     //Se especifica cada cuanto se hará la verificacion
                .ignoring(NoSuchElementException.class);  //Se especifican las excepciones a ignorar

        WebElement button = wait.until(new Function<WebDriver,WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.id("visibleAfter"));}});

        button.click();
        System.out.println("Click hecho");


        //ESTA ES LA MEJOR FORMA DE HACERLO
        /*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);

        try {
            WebElement button = wait.until(new Function<WebDriver,WebElement>(){
                public WebElement apply(WebDriver driver){
                    return driver.findElement(By.id("visibleAfter"));}});

            button.click();
            System.out.println("Click hecho");

        }catch (Exception e){
            System.out.println(e);
        }*/
    }
}
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

//El explicitwait no espera el tiempo total q lo determinamos, con solo aparecer el objeto lo presiona
//El explicit wait tiene un pooling time de 250 ml (Cada 250 ml envia un request al dome(verifica si esta visible el boton))
public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ivan\\IdeaProjects\\Tipo_Espera_ExplicitWait\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        //Creamos otro objeto para manipular la espera
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
            driver.findElement(By.id("visibleAfter")).click();
            System.out.println("boton clickeado");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
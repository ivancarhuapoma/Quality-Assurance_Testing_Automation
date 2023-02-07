package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

//Nota: No recomenbable el implicitlyWait porque retrasada todos los elementos el tiempo q establecemos

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ivan\\IdeaProjects\\Tipos_de_espera\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/dynamic-properties");

        try {
            WebElement button = driver.findElement(By.id("visibleAfter"));
            button.click();
            System.out.println("Boton Clikeado");}
        catch(Exception e) {
            System.out.println(e);

        }

    }
}
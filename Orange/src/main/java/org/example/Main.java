package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.ui.Select;
import java.lang.Thread;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ivan\\IdeaProjects\\Orange\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com");
        driver.manage().window().maximize();

        //Definimos las variables de los campos a ingresar
        String fullname = "Ivan Santos Carhuapoma Mezarina";
        String email = "ivan@gmail.com";
        String number = "987356130";


        //Definimos un objeto Javascrip para poder manipular codigo Javascrip
        JavascriptExecutor js = (JavascriptExecutor)driver;


        //Busco boton Boock a Free demo
        WebElement buttoninput = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[1]/a/button"));
        buttoninput.click();
        //Ejecutamos  codigo Javascrip sobre el scroll de pantalla
        js.executeScript("window.scroll(0,800)");



        try {
            Thread.sleep(1000);}
        catch (InterruptedException r){
            System.out.println(r);
        }

        //Nombre
        try {
            WebElement fullnameinput = driver.findElement(By.xpath("//*[@id=\"Form_getForm_FullName\"]"));
            fullnameinput.sendKeys(fullname);
            System.out.println("Nombre ingresado");
        }catch (Exception e){
            System.out.println(e);
        }

        //Email
        try {
            WebElement emailinput = driver.findElement(By.xpath("//*[@id=\"Form_getForm_Email\"]"));
            emailinput.sendKeys(email);
            System.out.println("Email ingresado");
        }catch (Exception e){
            System.out.println(e);
        }

        //Numero
        try {
            WebElement numberinput = driver.findElement(By.xpath("//*[@id=\"Form_getForm_Contact\"]"));
            numberinput.sendKeys(number);
            System.out.println("Numero ingresado");
        }catch (Exception e){
            System.out.println(e);
        }

        //Seleccion Pais
        try {
            Select drpCountry = new Select(driver.findElement(By.xpath("//*[@id=\"Form_getForm_Country\"]")));
            drpCountry.selectByValue("Peru");
            System.out.println("Selecciono el pais");
        }catch (Exception e){
            System.out.println(e);
        }



    }
}
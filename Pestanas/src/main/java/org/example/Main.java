package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Main {
    public static void main(String[] args) {

        System.setProperty("chromedriver.selenium.drivers", "C:\\Users\\Ivan\\IdeaProjects\\Pestanas\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver drive = new ChromeDriver();
        drive.get("https://demoqa.com/text-box");
        drive.manage().window().maximize();

        String name = "Ivan";
        String email = "ivan@gmail.com";
        String currimail = "ivan@gmail.com";
        String perrmail = "gino@gmail.com";

        WebElement fullnameinput = drive.findElement(By.id("userName"));
        WebElement emailinput = drive.findElement(By.id("userEmail"));
        WebElement curretemailinput = drive.findElement(By.id("currentAddress"));
        WebElement permanemailinput = drive.findElement(By.id("permanentAddress"));
        WebElement button = drive.findElement(By.id("submit"));

        fullnameinput.sendKeys(name);
        emailinput.sendKeys(email);
        curretemailinput.sendKeys(currimail);
        permanemailinput.sendKeys(perrmail);
        button.click();

        //WebElement refullnameinput = drive.findElement(By.xpath("//*[@id=\"name\"]"));
        //WebElement reemailinput = drive.findElement(By.xpath("//*[@id=\"email\"]"));
        //WebElement recurretemailinput = drive.findElement(By.xpath("//p[@id=\"currentAddress\"]"));
        //WebElement repermanemainput = drive.findElement(By.id("//p[@id=\"permanentAddress\"]"));

        //Thread.sleep(700);
        //Creamos otro objeto para manipular la espera
        WebDriverWait wait = new WebDriverWait(drive, Duration.ofSeconds(10));
        try {

            if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"name\"]"))).getText().contains(name)){
                System.out.println("Si funciona , calidacion correcta.........");

            }else {
                System.out.println("ERROR en refullnameinput......");
            }

            if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]"))).getText().contains(email)){
                System.out.println("Si funciona , calidacion correcta.........");

            }else {
                System.out.println("ERROR en reemailinput......");
            }

            if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id=\"currentAddress\"]"))).getText().contains(currimail)){
                System.out.println("Si funciona , calidacion correcta.........");

            }else {
                System.out.println("ERROR en recurretemailinput......");
            }

            if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id=\"permanentAddress\"]"))).getText().contains(currimail)){
                System.out.println("Si funciona , calidacion correcta.........");

            }else {
                System.out.println("ERROR en repermanemainput......");
            }

        }catch (Exception e){
            System.out.println(e);

        }



        /*drive.close();
        drive.quit();*/
    }
}
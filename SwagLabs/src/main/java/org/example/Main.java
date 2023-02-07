package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;
public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ivan\\IdeaProjects\\SwagLabs\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        //Definimos las varibles de acceso
        String user = "standard_user";
        String password = "secret_sauce";

        //Identificamos y accedemos
        WebElement userinput = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        userinput.sendKeys(user);
        WebElement passwordinput = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordinput.sendKeys(password);
        WebElement buttonLogin = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        buttonLogin.click();


        try {
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println("No se ejecuto el sleep");
        }


        //Ecogemos los productos
        WebElement item1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        item1.click();
        try {
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println("No se ejecuto el sleep");
        }
        WebElement item2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
        item2.click();
        try {
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println("No se ejecuto el sleep");
        }
        WebElement item3 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
        item3.click();
        try {
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println("No se ejecuto el sleep");
        }
        WebElement item4 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
        item4.click();

        //Carrito de compras
        WebElement carrito = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        carrito.click();
    }
}
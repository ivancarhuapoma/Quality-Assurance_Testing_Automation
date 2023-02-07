package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ivan\\IdeaProjects\\Droppable\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver drive = new ChromeDriver();
        drive.get("https://demoqa.com/droppable");
        drive.manage().window().maximize();

        //Aplicando droppablw
        //Instanciamos la accion class
        Actions action = new Actions(drive);

        //Definimos el from and to
        WebElement from = drive.findElement(By.id("draggable"));
        WebElement to = drive.findElement(By.id("droppable"));

        //User el metodo dragAndDrop
        action.dragAndDrop(from,to).build().perform();
    }
}
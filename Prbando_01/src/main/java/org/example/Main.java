package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ivan\\IdeaProjects\\Prbando_01\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        }
}










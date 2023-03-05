
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.ArrayList;

public class Test_Main {
    WebDriver driver;

    public static void Esperar(int psecods){
        try {
            Thread.sleep(psecods);
        }catch (Exception e){
            System.out.println("El programa fallo en la espera");
        }
    }

    @BeforeMethod
    public void Antes(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ivan\\IdeaProjects\\problems_gaa\\src\\main\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void Despues(){
        driver.quit();
    }

    @Test
    public void TesOne(){
        driver.get("https://www.upn.edu.pe/carreras-gente-que-trabaja/carreras?&utm_campaignid=1751807949&utm_campaignname=WA%20-%20AO%20-%20SEARCH%20-%20WA%20-%20BRAND&utm_source=search&utm_medium=cpc&gclid=Cj0KCQiA9YugBhCZARIsAACXxeIbdxneBqEQf-MNa8TGpofU-PXy3OI5wdTt5llydIvSBrcW6mAq9UEaArfiEALw_wcB");
        driver.manage().window().maximize();
        Esperar(4000);

        List<WebElement> Listadeetiuetaa;
        Listadeetiuetaa = driver.findElements(By.tagName("a"));

        List<String> links = new ArrayList<>();

        //Recorremos la lista para extraer los links
        for (WebElement var : Listadeetiuetaa) {
            String rf = var.getAttribute("href");
            if (rf.startsWith("https")){
                links.add(rf);
            }

        }

        for (String y : links){
            System.out.println(y);
        }

        Esperar(3000);
    }

}

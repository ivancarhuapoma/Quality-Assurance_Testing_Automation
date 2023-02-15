package TestMiercoles;

//import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;
//import org.junit.Before;
//import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import static org.junit.Assert.assertEquals;

public class Pruebas {

    WebDriver driver;

    public static void espera(int secod){
        try {
            Thread.sleep(secod);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @BeforeMethod
    public void Salida(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ivan\\IdeaProjects\\SwagLabs\\src\\main\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void Despues(){
        driver.quit();
    }

    @Test
    public void Test1() {
        String entrda = "Messi";
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement entradainput = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        entradainput.sendKeys(entrda);
        entradainput.submit();
        /*WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
        button.click();*/
        espera(3000);
    }

}

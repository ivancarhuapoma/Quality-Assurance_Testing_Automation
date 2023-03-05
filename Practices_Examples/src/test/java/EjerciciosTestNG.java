import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class EjerciciosTestNG {

    //Funcion de espera
    public static void Espera(int pseconds){
        try {
            Thread.sleep(pseconds);
            System.out.println("Si funciona...");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    //Inicializamos variables
    String name = "Ivan Santos Carhuapoma";
    String number = "950180159";
    String email = "ivan@gmail.com";

    WebDriver driver;
    JavascriptExecutor js;
    @BeforeMethod
    public void Antes(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ivan\\IdeaProjects\\Practices_Examples\\src\\main\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor)driver;


    }

    @AfterMethod
    public void Despues(){
        driver.quit();
    }

    @Test
    public void Test(){
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        Espera(2000);

        //Escribimos el producto q deseamos
        WebElement barrasearch = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        barrasearch.sendKeys("macbook pro");
        WebElement boton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        boton.click();


    }

}

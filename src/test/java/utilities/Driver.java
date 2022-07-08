package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    /*
    POM'de Driver icin TestBase Class'ina extends etmek yerine
    Driver Class'indan static method'lar kullanarak
    Driver olusuturup, ilgili ayarlarin yapilmasi
    ve en sonda Driver'in kapatilmasi tercih edilmistir.
    POM'de Driver Class'indaki getDriver()'nun obje olusturularak kullanilmasini engellemek
    icin Singleton pattern kullanimi benimsenmistir.
    Singleton Pattern : Tekli kullanim demek. Bir Class'in farkli class'lardan ,
    obje olusuturlarak kullanimini engellemek icin kullanilir.
   Bunu saglamak icin yapilmasi gereken sey oldukca basit obje olusturmak icin kullanilan
   constructor'i private yaptiginizda baska classlarda Driver class'indan obje olusuturulmasi
   mumkun olamaz.
     */
    private Driver(){

    }

   static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver!=null) {  // driver'a deger atanmissa
            driver.close();
            driver=null;
        }

    }

    public static void quitDriver() {
        if (driver!=null) {
            driver.quit();
            driver=null;
        }

    }

}

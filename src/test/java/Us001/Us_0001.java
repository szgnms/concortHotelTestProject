package Us001;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

public class Us_0001 {
    static WebDriver driver;
  static  ChromeOptions options;

    @BeforeClass
    public static void before() throws AWTException {

        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();
        options.addExtensions(new File("C:\\Program Files\\Google\\Chrome\\Application\\101.0.4951.67\\XPath-Plugin.crx"));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://qa-environment.concorthotel.com");
        driver.findElement(By.xpath("//*[@id='details-button']")).click();
        driver.findElement(By.xpath("//*[@id='proceed-link']")).click();

    }
    @AfterClass
    public static void tearDown(){
       // driver.close();
    }
    @Test
    public void test1() {
        WebElement homePage = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
        Assert.assertTrue(homePage.isDisplayed());
        WebElement rooms = driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Rooms']"));
        Assert.assertTrue(rooms.isDisplayed());
        WebElement rest = driver.findElement(By.xpath("//a[normalize-space()='Restaurant']"));
        Assert.assertTrue(rest.isDisplayed());
        WebElement about = driver.findElement(By.xpath("//a[normalize-space()='About']"));
        Assert.assertTrue(about.isDisplayed());
        WebElement blog = driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Blog']"));
        Assert.assertTrue(blog.isDisplayed());
        WebElement contac = driver.findElement(By.xpath("//a[normalize-space()='Contact']"));
        Assert.assertTrue(contac.isDisplayed());
        WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        Assert.assertTrue(login.isDisplayed());
    }
       @Test
        public void test2() {

            driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
            driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Rooms']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Restaurant']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='About']")).click();
            driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Blog']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
        }
    @Test
    public void test3() {
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
        driver.findElement(By.xpath("//input[@id='checkin_date']")).click();
        driver.findElement(By.xpath("//input[@id='checkin_date']")).clear();
        driver.findElement(By.xpath("//input[@id='checkin_date']")).sendKeys("08/09/2022");

        driver.findElement(By.xpath("//input[@id='checkout_date']")).click();
        driver.findElement(By.xpath("//input[@id='checkout_date']")).clear();
        driver.findElement(By.xpath("//input[@id='checkout_date']")).sendKeys("08/19/2022");

        driver.findElement(By.xpath("//select[@id='IDRoomType']")).click();
        driver.findElement(By.xpath("//select[@id='IDRoomType']")).sendKeys("King");

        driver.findElement(By.xpath("//select[@id='AdultCount']")).click();
        driver.findElement(By.xpath("//select[@id='AdultCount']")).sendKeys("2");

        driver.findElement(By.xpath("//input[@value='Check Availability']")).click();

    }
    @Test
    public void test5() throws AWTException, InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
        Robot rbt =new Robot();
        rbt.mouseWheel(7);
        Thread.sleep(2000);
        WebElement welcome= driver.findElement(By.xpath("//h2[normalize-space()='Welcome To Our Hotel']"));
        Assert.assertTrue(welcome.isDisplayed());

    }
    @Test
    public void test6() throws AWTException, InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
        Robot rbt =new Robot();
        rbt.mouseWheel(17);
        Thread.sleep(5000);
        WebElement ourRoom= driver.findElement(By.xpath("/html/body/section[5]/div/div[1]/div/h2"));
        Assert.assertTrue(ourRoom.isDisplayed());

        WebElement el1 =driver.findElement(By.xpath("(//a[@class='btn-custom'])[1]"));
        Assert.assertTrue(el1.isDisplayed());
        driver.findElement(By.xpath("(//a[@class='btn-custom'])[1]")).click();
        driver.navigate().back();

        WebElement el2 = driver.findElement(By.xpath("(//a[@class='btn-custom'])[2]"));
        Assert.assertTrue(el2.isDisplayed());
        driver.findElement(By.xpath("(//a[@class='btn-custom'])[2]")).click();
        driver.navigate().back();

        WebElement el3=driver.findElement(By.xpath("(//a[@class='btn-custom'])[3]"));
        Assert.assertTrue(el3.isDisplayed());
        driver.findElement(By.xpath("(//a[@class='btn-custom'])[3]")).click();
        driver.navigate().back();

        WebElement el4= driver.findElement(By.xpath("(//a[@class='btn-custom'])[4]"));
        Assert.assertTrue(el4.isDisplayed());
        driver.findElement(By.xpath("(//a[@class='btn-custom'])[4]")).click();
        driver.navigate().back();

        WebElement el5 = driver.findElement(By.xpath("(//a[@class='btn-custom'])[5]"));
        Assert.assertTrue(el5.isDisplayed());
        driver.findElement(By.xpath("(//a[@class='btn-custom'])[5]")).click();
        driver.navigate().back();

        WebElement el6 =driver.findElement(By.xpath("(//a[@class='btn-custom'])[6]"));
        Assert.assertTrue(el6.isDisplayed());
        driver.findElement(By.xpath("(//a[@class='btn-custom'])[6]")).click();
        driver.navigate().back();

    }
    @Test
    public void test7() throws AWTException, InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
        Robot rbt =new Robot();
        rbt.mouseWheel(30);
        Thread.sleep(5000);
        WebElement consumer = driver.findElement(By.xpath("(//div[@class='owl-stage-outer'])[2]"));
        Assert.assertTrue(consumer.isDisplayed());
        driver.findElement(By.xpath("//div[@class='owl-dots']//button[1]")).click();
        driver.findElement(By.xpath("//div[@class='owl-dots']//button[2]")).click();
        driver.findElement(By.xpath("//div[@class='owl-dots']//button[3]")).click();
        driver.findElement(By.xpath("//div[@class='owl-dots']//button[4]")).click();
        driver.findElement(By.xpath("//div[@class='owl-dots']//button[5]")).click();

    }

@Test
    public void test8() throws AWTException, InterruptedException {
    driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
    Robot rbt =new Robot();
    rbt.mouseWheel(37);
    Thread.sleep(5000);
    driver.findElement(By.xpath("(//div[@class='text mt-3 d-block'])[1]")).click();
    driver.navigate().back();
    driver.findElement(By.xpath("(//div[@class='text mt-3 d-block'])[1]")).click();
    driver.navigate().back();
    driver.findElement(By.xpath("(//div[@class='text mt-3 d-block'])[1]")).click();
    driver.navigate().back();
    driver.findElement(By.xpath("(//div[@class='text mt-3 d-block'])[1]")).click();
    driver.navigate().back();

}
    @Test
    public void test9() throws AWTException, InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
        Robot rbt =new Robot();
        rbt.mouseWheel(44);
        Thread.sleep(2000);
        WebElement instagram=driver.findElement(By.xpath("//span[normalize-space()='Instagram']"));
        Assert.assertTrue(instagram.isDisplayed());

        driver.findElement(By.xpath("(//div[@class='col-sm-12 col-md ftco-animate fadeInUp ftco-animated'])[1]")).click();
        driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).click();
        driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).click();
        driver.findElement(By.xpath("//button[@title='Close (Esc)']")).click();

        driver.findElement(By.xpath("(//div[@class='col-sm-12 col-md ftco-animate fadeInUp ftco-animated'])[2]")).click();
        driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).click();
        driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).click();
        driver.findElement(By.xpath("//button[@title='Close (Esc)']")).click();

        driver.findElement(By.xpath("(//div[@class='col-sm-12 col-md ftco-animate fadeInUp ftco-animated'])[3]")).click();
        driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).click();
        driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).click();
        driver.findElement(By.xpath("//button[@title='Close (Esc)']")).click();

        driver.findElement(By.xpath("(//div[@class='col-sm-12 col-md ftco-animate fadeInUp ftco-animated'])[4]")).click();
        driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).click();
        driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).click();
        driver.findElement(By.xpath("//button[@title='Close (Esc)']")).click();

}
    @Test
    public void test10() throws AWTException, InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
        Robot rbt =new Robot();
        rbt.keyPress(KeyEvent.VK_END);
        Thread.sleep(2000);
        WebElement conHot= driver.findElement(By.xpath("//h2[normalize-space()='Concort Hotel']"));
        Assert.assertTrue(conHot.isDisplayed());
        WebElement useLink= driver.findElement(By.xpath("//h2[normalize-space()='Useful Links']"));
        Assert.assertTrue(useLink.isDisplayed());
        WebElement privacy= driver.findElement(By.xpath("//h2[normalize-space()='Privacy']"));
        Assert.assertTrue(privacy.isDisplayed());
        WebElement quest= driver.findElement(By.xpath("//h2[normalize-space()='Have a Questions?']"));
        Assert.assertTrue(quest.isDisplayed());






    }

}
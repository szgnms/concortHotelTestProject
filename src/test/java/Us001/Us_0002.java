package Us001;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Us_0002 extends TestBase {

    @Test
    public void test01() {
        driver.get("https://qa-environment.concorthotel.com");
        WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        Assert.assertTrue(login.isDisplayed());
        login.click();
    }

    @Test
    public void test02() {
        driver.get("https://qa-environment.concorthotel.com");
        WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        Assert.assertTrue(login.isDisplayed());
        login.click();
        WebElement userName=driver.findElement(By.xpath("//input[@id='UserName']"));
        Assert.assertTrue(userName.isDisplayed());
        userName.sendKeys("Admin");
    }

    @Test
    public void test03() {
        driver.get("https://qa-environment.concorthotel.com");
        WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        Assert.assertTrue(login.isDisplayed());
        login.click();
        WebElement userName=driver.findElement(By.xpath("//input[@id='UserName']"));
        Assert.assertTrue(userName.isDisplayed());
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        Assert.assertTrue(password.isDisplayed());
        password.sendKeys("Admin");
    }

    @Test
    public void test04() {
        driver.get("https://qa-environment.concorthotel.com");
        WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        Assert.assertTrue(login.isDisplayed());
        login.click();
        WebElement userName=driver.findElement(By.xpath("//input[@id='UserName']"));
        Assert.assertTrue(userName.isDisplayed());
        userName.sendKeys("Manager");
        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        Assert.assertTrue(password.isDisplayed());
        password.sendKeys("manager1!");
        driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
        WebElement userName1 =driver.findElement(By.xpath("//span[@class='username username-hide-on-mobile']"));
        actions.moveToElement(userName1).perform();
        driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();





    }

    @Test
    public void test05() {
        driver.get("https://qa-environment.concorthotel.com");
        WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        Assert.assertTrue(login.isDisplayed());
        login.click();
        WebElement userName=driver.findElement(By.xpath("//input[@id='UserName']"));
        Assert.assertTrue(userName.isDisplayed());
        userName.sendKeys("Manager");
        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        Assert.assertTrue(password.isDisplayed());
        password.sendKeys("manager1!");
        driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
        WebElement users =driver.findElement(By.xpath("//span[@class='caption-subject font-green-sharp bold uppercase']"));
        Assert.assertTrue(users.isDisplayed());


    }
}

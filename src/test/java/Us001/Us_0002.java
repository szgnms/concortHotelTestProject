package Us001;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Us_0002 extends TestBase {
    @Test
    public void test01(){
        driver.get("https://qa-environment.concorthotel.com");
        WebElement loginIn= driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        Assert.assertTrue(loginIn.isDisplayed());
        loginIn.click();

    }
    @Test
    public void test02(){
        driver.get("https://qa-environment.concorthotel.com");
        WebElement loginIn= driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        Assert.assertTrue(loginIn.isDisplayed());
        loginIn.click();
        WebElement usernameTextBox= driver.findElement(By.xpath("//input[@id='UserName']"));
        Assert.assertTrue(usernameTextBox.isDisplayed());
        usernameTextBox.sendKeys("Manager");


    }
    @Test
    public void test03(){
        driver.get("https://qa-environment.concorthotel.com");
        WebElement loginIn= driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        Assert.assertTrue(loginIn.isDisplayed());
        loginIn.click();
        WebElement usernameTextBox= driver.findElement(By.xpath("//input[@id='UserName']"));
        Assert.assertTrue(usernameTextBox.isDisplayed());
        usernameTextBox.sendKeys("Manager");

        WebElement passwordTextBox= driver.findElement(By.xpath("//input[@id='Password']"));
        Assert.assertTrue(passwordTextBox.isDisplayed());
        passwordTextBox.sendKeys("Manager1!");

    }
    @Test
    public void test04(){
        driver.get("https://qa-environment.concorthotel.com");
        WebElement loginIn= driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        Assert.assertTrue(loginIn.isDisplayed());
        loginIn.click();

        WebElement usernameTextBox= driver.findElement(By.xpath("//input[@id='UserName']"));
        Assert.assertTrue(usernameTextBox.isDisplayed());
        usernameTextBox.sendKeys("Manager");

        WebElement passwordTextBox= driver.findElement(By.xpath("//input[@id='Password']"));
        Assert.assertTrue(passwordTextBox.isDisplayed());
        passwordTextBox.sendKeys("Manager1!");

        WebElement login= driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        Assert.assertTrue(login.isDisplayed());
        login.click();
        WebElement manager= driver.findElement(By.xpath("//span[@class='username username-hide-on-mobile']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(manager).perform();
        driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();



    }
    @Test
    public void test05(){
        driver.get("https://qa-environment.concorthotel.com");
        WebElement loginIn= driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        Assert.assertTrue(loginIn.isDisplayed());
        loginIn.click();

        WebElement usernameTextBox= driver.findElement(By.xpath("//input[@id='UserName']"));
        Assert.assertTrue(usernameTextBox.isDisplayed());
        usernameTextBox.sendKeys("Manager");

        WebElement passwordTextBox= driver.findElement(By.xpath("//input[@id='Password']"));
        Assert.assertTrue(passwordTextBox.isDisplayed());
        passwordTextBox.sendKeys("Manager1!");

        WebElement login= driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        Assert.assertTrue(login.isDisplayed());
        login.click();
        WebElement listOfUsers= driver.findElement(By.xpath("//span[@class='caption-subject font-green-sharp bold uppercase']"));
        Assert.assertTrue(listOfUsers.isDisplayed());


    }


}

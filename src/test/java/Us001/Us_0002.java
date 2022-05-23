package Us001;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Us_0002 extends TestBase {

    @Test
    public void test01() {
        //1-https://qa-environment.concorthotel.com/ sayfasına gidin
        driver.get("https://qa-environment.concorthotel.com/");
        //2-"Log in" linki görünülüğünü kontrol edin
        WebElement logInButtonu = driver.findElement(By.xpath("(//*[@class='nav-link'])[7]"));
        Assert.assertTrue(logInButtonu.isDisplayed());
        //3-"Log in" linkine tıklayın
        driver.findElement(By.xpath("(//*[@class='nav-link'])[7]")).click();
    }
    @Test
    public void test02() {
        //1-https://qa-environment.concorthotel.com/ sayfasına gidin
        driver.get("https://qa-environment.concorthotel.com/");
        //2-"Log in" linki görünülüğünü kontrol edin
        WebElement logInButtonu = driver.findElement(By.xpath("(//*[@class='nav-link'])[7]"));
        Assert.assertTrue(logInButtonu.isDisplayed());
        //3-"Log in" linkine tıklayın
        driver.findElement(By.xpath("(//*[@class='nav-link'])[7]")).click();
        //4-Username textbox görünürlüğünü kontrol edin
        actions.sendKeys(Keys.PAGE_DOWN);
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='UserName']"));
        Assert.assertTrue(userNameTextBox.isDisplayed());
        //5-Username textbox'a Admin username girilmeli
        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Admin");
    }

    @Test
    public void test03() throws InterruptedException {
        //1-https://qa-environment.concorthotel.com/ sayfasına gidin
        driver.get("https://qa-environment.concorthotel.com/");
        //2-"Log in" linki görünülüğünü kontrol edin
        WebElement logInButtonu = driver.findElement(By.xpath("(//*[@class='nav-link'])[7]"));
        Assert.assertTrue(logInButtonu.isDisplayed());
        //3-"Log in" linkine tıklayın
        driver.findElement(By.xpath("(//*[@class='nav-link'])[7]")).click();
        Thread.sleep(3000);
        //4-Username textbox görünürlüğünü kontrol edin
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN);
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='UserName']"));
        Assert.assertTrue(userNameTextBox.isDisplayed());
        //5-Username textbox'a Admin username girilmeli
        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Admin");
        //6-Password textbox görünürlüğünü kontrol edin
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='Password']"));
        Assert.assertTrue(passwordTextBox.isDisplayed());
        //7-Password textbox'a Admin password girilmeli
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Admin");
    }
    @Test
    public void test04() throws InterruptedException {
        //1-https://qa-environment.concorthotel.com/ sayfasına gidin
        driver.get("https://qa-environment.concorthotel.com/");
        //2-"Log in" linki görünülüğünü kontrol edin
        WebElement logInButtonu = driver.findElement(By.xpath("(//*[@class='nav-link'])[7]"));
        Assert.assertTrue(logInButtonu.isDisplayed());
        //3-"Log in" linkine tıklayın
        driver.findElement(By.xpath("(//*[@class='nav-link'])[7]")).click();
        Thread.sleep(3000);
        //4-Username textbox görünürlüğünü kontrol edin
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN);
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='UserName']"));
        Assert.assertTrue(userNameTextBox.isDisplayed());
        //5-Username textbox'a Admin username girilmeli
        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Manager");
        //6-Password textbox görünürlüğünü kontrol edin
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='Password']"));
        Assert.assertTrue(passwordTextBox.isDisplayed());
        //7-Password textbox'a Admin password girilmeli
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Manager1!");
        //8-Login butonunun görünürlüğünü kontrol edin
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        Assert.assertTrue(loginButton.isDisplayed());
        //9-Login butonuna tıklayın
        driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
        WebElement manager = driver.findElement(By.xpath("//span[@class='username username-hide-on-mobile']"));
        actions.moveToElement(manager).perform();
        driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
    }
    @Test
    public void test05() throws InterruptedException {
        //1-https://qa-environment.concorthotel.com/ sayfasına gidin
        driver.get("https://qa-environment.concorthotel.com/");
        //2-"Log in" linki görünülüğünü kontrol edin
        WebElement logInButtonu = driver.findElement(By.xpath("(//*[@class='nav-link'])[7]"));
        Assert.assertTrue(logInButtonu.isDisplayed());
        //3-"Log in" linkine tıklayın
        driver.findElement(By.xpath("(//*[@class='nav-link'])[7]")).click();
        Thread.sleep(3000);
        //4-Username textbox görünürlüğünü kontrol edin
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='UserName']"));
        Assert.assertTrue(userNameTextBox.isDisplayed());
        //5-Username textbox'a Admin username girilmeli
        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Manager");
        //6-Password textbox görünürlüğünü kontrol edin
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='Password']"));
        Assert.assertTrue(passwordTextBox.isDisplayed());
        //7-Password textbox'a Admin password girilmeli
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Manager1!");
        //8-Login butonunun görünürlüğünü kontrol edin
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
        Assert.assertTrue(loginButton.isDisplayed());
        //9-Login butonuna tıklayın
        driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
        //10-" ListOfUsers " yazısının görünürlüğünü kontrol edin
        WebElement listOfUsersYazisi = driver.findElement(By.xpath("//span[@class='caption-subject font-green-sharp bold uppercase']"));
         Assert.assertTrue(listOfUsersYazisi.isDisplayed());
    }
}
package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {



    public static String  Username_xpath = "//input[@id='usr']";
    public static String  Password_xpath = "//input[@id='pwd']";

    public static String Login_xpath = "//input[@value='Login']";

    public static String NewUser_Registration_xpath = "//button[@id='NewRegistration']";


    // Creating Methods

    public static void SendUsernames() throws InterruptedException {
        driver.findElement(By.xpath(Username_xpath)).sendKeys("Scott.gale@gmail.com");

    }

    public static void SendPassword() throws InterruptedException {
        driver.findElement(By.xpath(Password_xpath)).sendKeys("P@sword!");
    }

    public static void ClickLoginButton() throws InterruptedException {
        driver.findElement(By.xpath(Login_xpath)).click();
    }

    public static void ClickNewUserRegistration() throws InterruptedException {
       driver.findElement(By.xpath(NewUser_Registration_xpath)).click();
   }


}

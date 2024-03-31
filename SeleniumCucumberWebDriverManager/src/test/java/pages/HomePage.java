package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {


   public static String  hamburger_menu_xpath = "//Input[@type='checkbox']";
   public static String  SignIn_link_xpath = "//li[text()='Sign In Portal']";

   public static String  OnlineProduct_Page_xpath = "//li[text()='Online Products']";


   // Creating Methods

   public static void Click_hamburger_menu() throws InterruptedException {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
      Thread.sleep(2000);
      driver.findElement(By.xpath(hamburger_menu_xpath)).click();

   }

   public static void Click_SignIn_Link() throws InterruptedException {
      Thread.sleep(2000);
      driver.findElement(By.xpath(SignIn_link_xpath)).click();
   }

   public static void Click_Online_Products_Link() throws InterruptedException {
      Thread.sleep(2000);
      driver.findElement(By.xpath(OnlineProduct_Page_xpath)).click();
   }
}

package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {


    public static String prd_formal_shoes_xpath = "//h3[text()='Formal Shoes']";

    public static String prd_Sports_xpath = "//h3[text()='Sports']";

    public static String prd_Sneakers_xpath = " //h3[text()='Sneakers']";


    public  static  void verifyformalshoes()throws InterruptedException
    {
        String formalshoesprd = driver.findElement(By.xpath(prd_formal_shoes_xpath)).getText();
        assertEquals(formalshoesprd , "Formal Shoes");


    }

    public  static  void verifysports()throws InterruptedException
    {
        String sportsprd = driver.findElement(By.xpath(prd_Sports_xpath)).getText();
        assertEquals(sportsprd , "Sports");

    }

    public  static  void verifySneakers()throws InterruptedException
    {
        String sneakersprd = driver.findElement(By.xpath(prd_Sneakers_xpath)).getText();
        assertEquals(sneakersprd , "Sneakers");

    }
}

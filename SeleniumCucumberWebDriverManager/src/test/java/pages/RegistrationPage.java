package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {


    public static String Registration_page_txt_xpath = "//h1[text()='User Registration Page']";

public static String Solutions_xpath = "//Select[@id='Salutation']";

public static String FirstName_xpath = "//input[@id='firstname']";

public static String LastName_xpath = "//input[@id='lastname']";

public static String Email_Id_xpath = "//input[@id='emailId']";


public static String Contact_Number_xpath = "//input[@id='contactNumber']";

public static String UserName_xpath = "//input[@id='usr']";

public static String Pwd_xpath = "//input[@id='pwd']";

public static String Submit_xpath = "//input[@value='Submit']";


// create Methods


    public static void visibilityReUser_Registration_Page() throws InterruptedException
    {
        String regusertxt = driver.findElement(By.xpath(Registration_page_txt_xpath)).getText();
        assertEquals(regusertxt , "User Registration Page");
    }













//    public static void ClickSolutiondropdwon()
//    {
//        driver.findElement(By.xpath(Solutions_xpath)).click();
//        Select select new Select();
//        select.selectByVisibleText("Mr");
//    }
//
//    public static void Send_FirstName()
//    {
//        driver.findElement(By.xpath(FirstName_xpath)).sendKeys("Rohit");
//
//    }
//
//    public static void Send_LastName()
//    {
//        driver.findElement(By.xpath(LastName_xpath)).sendKeys("Kamble");
//
//    }
//
//    public static void Send_Email_id()
//    {
//        driver.findElement(By.xpath(Email_Id_xpath)).sendKeys("rohit.kamble@gmail.com");
//
//    }
//
//    public static void Send_Contact_number()
//    {
//        driver.findElement(By.xpath(Contact_Number_xpath)).sendKeys("9881675986");
//
//    }
//
//    public static void Send_UserName()
//    {
//        driver.findElement(By.xpath(UserName_xpath)).sendKeys("Rohit Kamble");
//
//    }
//
//    public static void Send_Password()
//    {
//        driver.findElement(By.xpath(Pwd_xpath)).sendKeys("Rohit5541@");
//
//    }
//
//    public static void Click_Submit_btn()
//    {
//        driver.findElement(By.xpath(Submit_xpath)).click();
//
//    }







}

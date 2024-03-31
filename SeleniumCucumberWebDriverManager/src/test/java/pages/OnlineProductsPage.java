package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class OnlineProductsPage extends BrowserDriver {

    public static String formalshoesdropdown_xpath = "//i[@class='fa fa-angle-double-down formalshoedropdown']";

    public static String formalshoes_Webtable_xpath = "//table[@class='table table-striped thead-dark formalshoetable']";

    public static String formalshoes_Webtable_tr = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void clickformalshoesdropdown() throws InterruptedException {
        driver.findElement(By.xpath(formalshoesdropdown_xpath)).click();


    }

    public static String get_Text_Formal_Shoes_First_value() throws InterruptedException {
        String formalshoesText = driver.findElement(By.xpath(formalshoes_Webtable_tr)).getText();
        return formalshoesText;


    }


}
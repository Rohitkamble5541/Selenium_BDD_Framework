package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.OnlineProductsPage.*;

public class OnlineProductsPage {


    @When("User clicks on Formal Shoes drop down")
    public void User_clicks_on_Formal_Shoes_drop_down() throws InterruptedException
    {
        clickformalshoesdropdown();

    }



    @Then("User should be able to view the Products")
    public void User_should_be_able_to_view_the_Products() throws InterruptedException

    {
        get_Text_Formal_Shoes_First_value();
        assertEquals("   Classic Cheltenham" , get_Text_Formal_Shoes_First_value());




    }
}

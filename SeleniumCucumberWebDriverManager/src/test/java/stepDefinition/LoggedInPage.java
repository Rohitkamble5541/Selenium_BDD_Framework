package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.LoggedInPage.*;

public class LoggedInPage {
    @Then("User should be able to view the product category page")
    public void User_should_be_able_to_view_the_product_category_page() throws InterruptedException {
        verifyformalshoes();
        verifysports();
        verifySneakers();
    }
}

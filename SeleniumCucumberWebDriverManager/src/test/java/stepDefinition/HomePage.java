package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class HomePage {

    @Given("User navigates to the Login Page")
    public void User_navigates_to_the_Login_Page() throws InterruptedException {
        Click_hamburger_menu();
        Click_SignIn_Link();

    }

    @Given("User navigates to the Online Products Page")
    public void User_navigates_to_the_Online_Products_Page() throws InterruptedException
    {
        Click_hamburger_menu();
        Click_Online_Products_Link();

    }
}

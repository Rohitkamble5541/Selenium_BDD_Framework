package stepDefinition;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {
    @When("User successfully enters the log in details")
    public void User_successfully_enters_the_log_in_details() throws InterruptedException {
        SendUsernames();
        SendPassword();
        ClickLoginButton();

    }

    @When("User clicks on new Registration button")

    public void User_clicks_on_new_Registration_button() throws InterruptedException {
        ClickNewUserRegistration();
    }
}

package stepDefinition;

import java.io.IOException;

import base.testBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;



public class SignUpAndSignIn extends testBase {

    static BasePage basePage = new BasePage();
    static HomePage homePage = new HomePage();
    static SignUpPage signUpPage = new SignUpPage();
    static SignInPage signInPage = new SignInPage();

    @When("User chooses create a new account option")
    public static void clickCreateAnAccount() {
        basePage.createAccountButton.click();
        System.out.println("Create a New Account Clicked, navigating to signup...");
    }

    @Then("User enters First Name as {string} and Last Name as {string}")
    public static void enterFirstAndLastName(String firstName, String lastName) {

        signUpPage.firstNameInputBox.sendKeys(firstName);
        System.out.println("First name entered..");

        signUpPage.lastNameInputBox.sendKeys(lastName);
        System.out.println("Last name entered..");
    }

    @Then("User enters Email as {string} and Password as {string} and clicks create account button")
    public static void enterEmailPasswordAndClickCreateAccount(String email, String password) {

        signUpPage.emailInputBox.sendKeys(email);
        System.out.println("Email entered...");

        signUpPage.passwordInputBox.sendKeys(password);
        System.out.println("Password entered...");

        signUpPage.confirmPasswordInputBox.sendKeys(password);
        System.out.println("Confirm Password entered...");

        signUpPage.createAccountButton.click();
        System.out.println("Create Account Button clicked...");
    }

    @Then("User signs out of the application")
    public static void signOutFromApplication() throws InterruptedException {
        Thread.sleep(2000);
        homePage.profileDropdown.click();
        System.out.println("Profile Dropdown clicked...");

        homePage.signOutButton.click();
        System.out.println("Sign Out Button clicked...");

    }

    @Then("User signs into the application with Email as {string} and Password as {string}")
    public static void signInToTheApplication(String email, String password) throws InterruptedException {

        basePage.signInButton.click();
        System.out.println("Sign In Button clicked...");

        signInPage.emailInputBox.sendKeys(email);
        System.out.println("Email entered...");

        signInPage.passwordInputBox.sendKeys(password);
        System.out.println("Password entered...");

        signInPage.signInButton.click();
        System.out.println("Sign In Button clicked...");

        signOutFromApplication();

    }

}

package StepDef;

import io.cucumber.java.en.*;
import pageobjects.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserRegistrationAuthenticationStepDefinitions {

    WebDriver driver;
    RegistrationPage registrationPage;

    public UserRegistrationAuthenticationStepDefinitions() {
        driver = new ChromeDriver();
        registrationPage = new RegistrationPage(driver);
    }

    @Given("the customer is on the registration page")
    public void theCustomerIsOnTheRegistrationPage() {
        driver.get("https://example.com/registration");
    }

    @When("the customer enters a valid email address")
    public void theCustomerEntersAValidEmailAddress() {
        registrationPage.enterEmail("test@example.com");
    }

    @When("the customer enters a valid password that meets security rules")
    public void theCustomerEntersAValidPasswordThatMeetsSecurityRules() {
        registrationPage.enterPassword("StrongPassword123!");
    }

    @When("the customer clicks the {string} button")
    public void theCustomerClicksTheButton(String button) {
        registrationPage.clickButton(button);
    }

    @Then("the customer should receive an OTP/email confirmation for account activation")
    public void theCustomerShouldReceiveAnOTPEmailConfirmationForAccountActivation() {
        registrationPage.verifyOTPEmailSent();
    }

    @Then("the customer should be prompted to enter the OTP/email confirmation")
    public void theCustomerShouldBePromptedToEnterTheOTPEmailConfirmation() {
        registrationPage.verifyOTPInputDisplayed();
    }

    @When("the customer enters the correct OTP/email confirmation")
    public void theCustomerEntersTheCorrectOTPEmailConfirmation() {
        registrationPage.enterOTP("123456");
    }

    @Then("the customer should see a message stating {string}")
    public void theCustomerShouldSeeAMessageStating(String message) {
        registrationPage.verifyMessageDisplayed(message);
    }

    @Then("the customer should be redirected to the login page")
    public void theCustomerShouldBeRedirectedToTheLoginPage() {
        registrationPage.verifyRedirectionToLoginPage();
        driver.quit();
    }
}
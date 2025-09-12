package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class UserRegistrationSteps {
    WebDriver driver;

    @Given("the customer is on the registration page")
    public void theCustomerIsOnTheRegistrationPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com/registration");
    }

    @When("the customer enters a valid email address")
    public void theCustomerEntersAValidEmailAddress() {
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("valid.email@example.com");
    }

    @When("the customer enters a valid password that meets security rules")
    public void theCustomerEntersAValidPasswordThatMeetsSecurityRules() {
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("StrongPassword123!");
    }

    @When("the customer clicks the {string} button")
    public void theCustomerClicksTheButton(String buttonName) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonName + "']"));
        button.click();
    }

    @Then("the customer should receive an OTP/email confirmation for account activation")
    public void theCustomerShouldReceiveAnOtpEmailConfirmationForAccountActivation() {
        System.out.println("Simulating OTP/email confirmation sent.");
    }

    @Then("the customer should be prompted to enter the OTP/email confirmation")
    public void theCustomerShouldBePromptedToEnterTheOtpEmailConfirmation() {
        WebElement otpField = driver.findElement(By.id("otp"));
        assert otpField.isDisplayed();
    }

    @When("the customer enters the correct OTP/email confirmation")
    public void theCustomerEntersTheCorrectOtpEmailConfirmation() {
        WebElement otpField = driver.findElement(By.id("otp"));
        otpField.sendKeys("123456");
        WebElement activateButton = driver.findElement(By.id("activate"));
        activateButton.click();
    }

    @Then("the customer should see a message stating {string}")
    public void theCustomerShouldSeeAMessageStating(String message) {
        WebElement messageElement = driver.findElement(By.xpath("//*[contains(text(),'" + message + "')]"));
        assert messageElement.isDisplayed();
    }

    @Then("the customer should be redirected to the login page")
    public void theCustomerShouldBeRedirectedToTheLoginPage() {
        assert driver.getCurrentUrl().contains("/login");
        driver.quit();
    }
}
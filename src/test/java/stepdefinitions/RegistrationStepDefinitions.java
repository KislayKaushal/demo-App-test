package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class RegistrationStepDefinitions {
    WebDriver driver;

    @Given("the customer is on the registration page")
    public void theCustomerIsOnTheRegistrationPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com/registration"); // Replace with actual URL
    }

    @When("the customer enters a valid email address")
    public void theCustomerEntersAValidEmailAddress() {
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("test@example.com");
    }

    @When("the customer enters a valid password that meets security rules")
    public void theCustomerEntersAValidPassword() {
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SecurePassword123!");
    }

    @When("the customer clicks the {string} button")
    public void theCustomerClicksTheButton(String button) {
        WebElement buttonElement = driver.findElement(By.xpath("//button[text()='" + button + "']"));
        buttonElement.click();
    }

    @Then("the customer should receive an OTP/email confirmation for account activation")
    public void theCustomerShouldReceiveAnOTPEmailConfirmation() {
        // Placeholder for OTP/email confirmation verification
        System.out.println("OTP/email confirmation sent.");
    }

    @Then("the customer should be prompted to enter the OTP/email confirmation")
    public void theCustomerShouldBePromptedToEnterOTP() {
        WebElement otpField = driver.findElement(By.id("otp"));
        assert otpField.isDisplayed();
    }

    @When("the customer enters the correct OTP/email confirmation")
    public void theCustomerEntersCorrectOTP() {
        WebElement otpField = driver.findElement(By.id("otp"));
        otpField.sendKeys("123456"); // Replace with dynamic OTP
    }

    @Then("the customer should see a message stating {string}")
    public void theCustomerShouldSeeMessage(String message) {
        WebElement messageElement = driver.findElement(By.xpath("//*[contains(text(),'" + message + "')]"));
        assert messageElement.isDisplayed();
    }

    @Then("the customer should be redirected to the login page")
    public void theCustomerShouldBeRedirectedToLoginPage() {
        String currentUrl = driver.getCurrentUrl();
        assert currentUrl.contains("login");
        driver.quit();
    }
}
package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickButton(String buttonName) {
        driver.findElement(By.id(buttonName)).click();
    }

    public void verifyOTPEmailSent() {
        // Logic to verify OTP/email confirmation was sent
    }

    public void verifyOTPInputDisplayed() {
        // Logic to verify OTP input field is displayed
    }

    public void enterOTP(String otp) {
        driver.findElement(By.id("otp")).sendKeys(otp);
    }

    public void verifyMessageDisplayed(String message) {
        boolean isDisplayed = driver.findElement(By.xpath("//*[contains(text(),'" + message + "')]")).isDisplayed();
        if (!isDisplayed) throw new AssertionError("Message not found: " + message);
    }

    public void verifyRedirectionToLoginPage() {
        String currentUrl = driver.getCurrentUrl();
        if (!currentUrl.contains("login")) throw new AssertionError("Not redirected to login page");
    }
}
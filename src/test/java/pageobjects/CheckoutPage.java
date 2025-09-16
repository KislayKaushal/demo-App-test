package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectPaymentMethod() {
        // Code to select a payment method (e.g., click on a radio button or dropdown)
        driver.findElement(By.id("payment-method")).click();
    }

    public void verifyPaymentMethodHighlighted() {
        // Code to verify the selected payment method is highlighted
        boolean isHighlighted = driver.findElement(By.id("payment-method-highlight")).isDisplayed();
        if (!isHighlighted) throw new AssertionError("Payment method is not highlighted");
    }

    public void enterPaymentInformation() {
        // Code to enter payment information
        driver.findElement(By.id("payment-info")).sendKeys("Valid Payment Info");
    }

    public void clickSavePaymentInformation() {
        // Code to click the save payment information button
        driver.findElement(By.id("save-payment-info")).click();
    }

    public void verifyPaymentInformationSaved() {
        // Code to verify payment information is saved securely
        boolean isSaved = driver.findElement(By.id("payment-info-saved")).isDisplayed();
        if (!isSaved) throw new AssertionError("Payment information is not saved securely");
    }

    public void verifyConfirmationMessage(String message) {
        // Code to verify confirmation message
        boolean isDisplayed = driver.findElement(By.xpath("//*[contains(text(),'" + message + "')]")).isDisplayed();
        if (!isDisplayed) throw new AssertionError("Confirmation message not found: " + message);
    }

    public void enterDeliveryAddress() {
        // Code to enter delivery address
        driver.findElement(By.id("delivery-address")).sendKeys("Valid Address");
    }

    public void clickSaveDeliveryAddress() {
        // Code to click the save delivery address button
        driver.findElement(By.id("save-delivery-address")).click();
    }

    public void verifyDeliveryAddressSaved() {
        // Code to verify delivery address is saved
        boolean isSaved = driver.findElement(By.id("delivery-address-saved")).isDisplayed();
        if (!isSaved) throw new AssertionError("Delivery address is not saved");
    }

    public void editDeliveryAddress() {
        // Code to edit the delivery address
        driver.findElement(By.id("delivery-address")).clear();
        driver.findElement(By.id("delivery-address")).sendKeys("Updated Address");
    }

    public void clickPlaceOrder() {
        // Code to click the place order button
        driver.findElement(By.id("place-order")).click();
    }

    public void validateEnteredInformation() {
        // Code to validate payment and delivery information
        boolean isValid = driver.findElement(By.id("validation-success")).isDisplayed();
        if (!isValid) throw new AssertionError("Entered information is invalid");
    }

    public void verifyErrorMessage(String message) {
        // Code to verify error message
        boolean isDisplayed = driver.findElement(By.xpath("//*[contains(text(),'" + message + "')]")).isDisplayed();
        if (!isDisplayed) throw new AssertionError("Error message not found: " + message);
    }

    public void processPayment() {
        // Code to process the payment
        boolean isProcessed = driver.findElement(By.id("payment-success")).isDisplayed();
        if (!isProcessed) throw new AssertionError("Payment was not processed successfully");
    }

    public void verifyResponsiveLayout(String deviceType) {
        // Code to verify responsive layout based on device type
        boolean isResponsive = driver.findElement(By.id(deviceType + "-responsive")).isDisplayed();
        if (!isResponsive) throw new AssertionError("Responsive layout not displayed correctly for: " + deviceType);
    }

    public void verifyResponsiveLayoutDisplayedCorrectly() {
        // Code to verify layout is displayed correctly
        boolean isDisplayed = driver.findElement(By.id("responsive-layout")).isDisplayed();
        if (!isDisplayed) throw new AssertionError("Responsive layout is not displayed correctly");
    }

    public void clickReviewOrder() {
        // Code to click the review order button
        driver.findElement(By.id("review-order")).click();
    }

    public void verifyOrderSummary() {
        // Code to verify order summary
        boolean isDisplayed = driver.findElement(By.id("order-summary")).isDisplayed();
        if (!isDisplayed) throw new AssertionError("Order summary is not displayed");
    }

    public void finalizePurchase() {
        // Code to finalize the purchase
        driver.findElement(By.id("finalize-purchase")).click();
    }

    public void leavePaymentInformationEmpty() {
        // Code to leave payment information fields empty
        driver.findElement(By.id("payment-info")).clear();
    }

    public void leaveDeliveryAddressEmpty() {
        // Code to leave delivery address fields empty
        driver.findElement(By.id("delivery-address")).clear();
    }

    public void enterInvalidPaymentInformation() {
        // Code to enter invalid payment information
        driver.findElement(By.id("payment-info")).sendKeys("Invalid Payment Info");
    }

    public void enterInvalidDeliveryAddress() {
        // Code to enter invalid delivery address
        driver.findElement(By.id("delivery-address")).sendKeys("Invalid Address");
    }
}
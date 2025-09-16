package StepDef;

import pageobjects.CheckoutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class CheckoutStepDefinitions {
    WebDriver driver;
    CheckoutPage checkoutPage;

    public CheckoutStepDefinitions() {
        driver = new ChromeDriver();
        checkoutPage = new CheckoutPage(driver);
    }

    @Given("the user is on the checkout page")
    public void theUserIsOnTheCheckoutPage() {
        driver.get("https://example.com/checkout");
    }

    @When("the user selects a payment method \(e.g., credit card, PayPal\)")
    public void theUserSelectsAPaymentMethod() {
        checkoutPage.selectPaymentMethod();
    }

    @Then("the selected payment method should be highlighted")
    public void theSelectedPaymentMethodShouldBeHighlighted() {
        checkoutPage.verifyPaymentMethodHighlighted();
    }

    @When("the user enters valid payment information")
    public void theUserEntersValidPaymentInformation() {
        checkoutPage.enterPaymentInformation();
    }

    @When("clicks the \"Save Payment Information\" button")
    public void clicksTheSavePaymentInformationButton() {
        checkoutPage.clickSavePaymentInformation();
    }

    @Then("the payment information should be saved securely")
    public void thePaymentInformationShouldBeSavedSecurely() {
        checkoutPage.verifyPaymentInformationSaved();
    }

    @Then("the user should see a confirmation message stating \"Payment information saved securely\"")
    public void theUserShouldSeeAConfirmationMessageStatingPaymentInformationSavedSecurely() {
        checkoutPage.verifyConfirmationMessage("Payment information saved securely");
    }

    @When("the user enters a valid delivery address")
    public void theUserEntersAValidDeliveryAddress() {
        checkoutPage.enterDeliveryAddress();
    }

    @When("clicks the \"Save Delivery Address\" button")
    public void clicksTheSaveDeliveryAddressButton() {
        checkoutPage.clickSaveDeliveryAddress();
    }

    @Then("the delivery address should be saved")
    public void theDeliveryAddressShouldBeSaved() {
        checkoutPage.verifyDeliveryAddressSaved();
    }

    @Then("the user should see a confirmation message stating \"Delivery address saved\"")
    public void theUserShouldSeeAConfirmationMessageStatingDeliveryAddressSaved() {
        checkoutPage.verifyConfirmationMessage("Delivery address saved");
    }

    @When("the user edits the delivery address")
    public void theUserEditsTheDeliveryAddress() {
        checkoutPage.editDeliveryAddress();
    }

    @Then("the updated delivery address should be saved")
    public void theUpdatedDeliveryAddressShouldBeSaved() {
        checkoutPage.verifyDeliveryAddressSaved();
    }

    @Then("the user should see a confirmation message stating \"Delivery address updated\"")
    public void theUserShouldSeeAConfirmationMessageStatingDeliveryAddressUpdated() {
        checkoutPage.verifyConfirmationMessage("Delivery address updated");
    }

    @When("the user enters payment information and delivery address")
    public void theUserEntersPaymentInformationAndDeliveryAddress() {
        checkoutPage.enterPaymentInformation();
        checkoutPage.enterDeliveryAddress();
    }

    @When("clicks the \"Place Order\" button")
    public void clicksThePlaceOrderButton() {
        checkoutPage.clickPlaceOrder();
    }

    @Then("the system should validate the entered payment information and delivery address")
    public void theSystemShouldValidateTheEnteredPaymentInformationAndDeliveryAddress() {
        checkoutPage.validateEnteredInformation();
    }

    @Then("the user should see an error message indicating the invalid fields")
    public void theUserShouldSeeAnErrorMessageIndicatingTheInvalidFields() {
        checkoutPage.verifyErrorMessage();
    }

    @Then("the system should process the payment")
    public void theSystemShouldProcessThePayment() {
        checkoutPage.processPayment();
    }

    @Then("the user should see a confirmation message stating \"Payment successful, order placed\"")
    public void theUserShouldSeeAConfirmationMessageStatingPaymentSuccessfulOrderPlaced() {
        checkoutPage.verifyConfirmationMessage("Payment successful, order placed");
    }

    @When("the user accesses the checkout page on a desktop device")
    public void theUserAccessesTheCheckoutPageOnADesktopDevice() {
        checkoutPage.verifyResponsiveLayout("desktop");
    }

    @Then("the checkout process should be responsive and display correctly")
    public void theCheckoutProcessShouldBeResponsiveAndDisplayCorrectly() {
        checkoutPage.verifyResponsiveLayoutDisplayedCorrectly();
    }

    @When("the user accesses the checkout page on a mobile device")
    public void theUserAccessesTheCheckoutPageOnAMobileDevice() {
        checkoutPage.verifyResponsiveLayout("mobile");
    }

    @When("the user clicks the \"Review Order\" button")
    public void theUserClicksTheReviewOrderButton() {
        checkoutPage.clickReviewOrder();
    }

    @Then("the user should see an order summary with all selected items, payment method, and delivery address")
    public void theUserShouldSeeAnOrderSummaryWithAllSelectedItemsPaymentMethodAndDeliveryAddress() {
        checkoutPage.verifyOrderSummary();
    }

    @Then("the user should be able to finalize the purchase from the order summary page")
    public void theUserShouldBeAbleToFinalizeThePurchaseFromTheOrderSummaryPage() {
        checkoutPage.finalizePurchase();
    }

    @When("the user leaves the payment information fields empty")
    public void theUserLeavesThePaymentInformationFieldsEmpty() {
        checkoutPage.leavePaymentInformationEmpty();
    }

    @Then("the user should see an error message stating \"Payment information is required\"")
    public void theUserShouldSeeAnErrorMessageStatingPaymentInformationIsRequired() {
        checkoutPage.verifyErrorMessage("Payment information is required");
    }

    @When("the user leaves the delivery address fields empty")
    public void theUserLeavesTheDeliveryAddressFieldsEmpty() {
        checkoutPage.leaveDeliveryAddressEmpty();
    }

    @Then("the user should see an error message stating \"Delivery address is required\"")
    public void theUserShouldSeeAnErrorMessageStatingDeliveryAddressIsRequired() {
        checkoutPage.verifyErrorMessage("Delivery address is required");
    }

    @When("the user enters invalid payment information format")
    public void theUserEntersInvalidPaymentInformationFormat() {
        checkoutPage.enterInvalidPaymentInformation();
    }

    @Then("the user should see an error message stating \"Invalid payment information format\"")
    public void theUserShouldSeeAnErrorMessageStatingInvalidPaymentInformationFormat() {
        checkoutPage.verifyErrorMessage("Invalid payment information format");
    }

    @When("the user enters invalid delivery address format")
    public void theUserEntersInvalidDeliveryAddressFormat() {
        checkoutPage.enterInvalidDeliveryAddress();
    }

    @Then("the user should see an error message stating \"Invalid delivery address format\"")
    public void theUserShouldSeeAnErrorMessageStatingInvalidDeliveryAddressFormat() {
        checkoutPage.verifyErrorMessage("Invalid delivery address format");
    }
}
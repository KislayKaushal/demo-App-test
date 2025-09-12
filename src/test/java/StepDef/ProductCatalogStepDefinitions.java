package StepDef;

import pageobjects.ProductCatalogPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class ProductCatalogStepDefinitions {
    WebDriver driver;
    ProductCatalogPage productCatalogPage;

    public ProductCatalogStepDefinitions() {
        driver = new ChromeDriver();
        productCatalogPage = new ProductCatalogPage(driver);
    }

    @Given("the customer is on the product catalog page")
    public void theCustomerIsOnTheProductCatalogPage() {
        driver.get("https://example.com/product-catalog");
    }

    @When("the page loads")
    public void thePageLoads() {
        productCatalogPage.waitForPageLoad();
    }

    @Then("the system should display a list of product categories")
    public void theSystemShouldDisplayAListOfProductCategories() {
        productCatalogPage.verifyProductCategoriesDisplayed();
    }

    @When("the customer selects a category")
    public void theCustomerSelectsACategory() {
        productCatalogPage.selectCategory("CategoryName");
    }

    @Then("the product listing should update to show products in the selected category")
    public void theProductListingShouldUpdateToShowProductsInTheSelectedCategory() {
        productCatalogPage.verifyProductsInCategory("CategoryName");
    }

    @When("the customer selects multiple categories")
    public void theCustomerSelectsMultipleCategories() {
        productCatalogPage.selectMultipleCategories(new String[]{"Category1", "Category2"});
    }

    @Then("the product listing should update to show products in the selected categories")
    public void theProductListingShouldUpdateToShowProductsInTheSelectedCategories() {
        productCatalogPage.verifyProductsInCategories(new String[]{"Category1", "Category2"});
    }

    @When("the customer deselects a category")
    public void theCustomerDeselectsACategory() {
        productCatalogPage.deselectCategory("CategoryName");
    }

    @Then("the product listing should update to show products in the remaining selected categories")
    public void theProductListingShouldUpdateToShowProductsInTheRemainingSelectedCategories() {
        productCatalogPage.verifyProductsInCategories(new String[]{"RemainingCategory1", "RemainingCategory2"});
    }

    @When("the customer selects the sort option {string}")
    public void theCustomerSelectsTheSortOption(String sortOption) {
        productCatalogPage.sortProducts(sortOption);
    }

    @Then("the product listing should update to show products sorted by {string}")
    public void theProductListingShouldUpdateToShowProductsSortedBy(String sortOption) {
        productCatalogPage.verifyProductsSortedBy(sortOption);
    }

    @Then("the user interface should be intuitive and responsive")
    public void theUserInterfaceShouldBeIntuitiveAndResponsive() {
        productCatalogPage.verifyResponsiveUI();
    }

    @Then("the system should display a message stating {string}")
    public void theSystemShouldDisplayAMessageStating(String message) {
        productCatalogPage.verifyMessageDisplayed(message);
    }

    @Then("the product listing should not update")
    public void theProductListingShouldNotUpdate() {
        productCatalogPage.verifyProductListingUnchanged();
    }
}
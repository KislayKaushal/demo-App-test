package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductCatalogPage {
    WebDriver driver;

    public ProductCatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForPageLoad() {
        // Implement logic to wait for the page to load
    }

    public void verifyProductCategoriesDisplayed() {
        // Implement logic to verify product categories are displayed
    }

    public void selectCategory(String categoryName) {
        driver.findElement(By.xpath("//button[text()='" + categoryName + "']")).click();
    }

    public void verifyProductsInCategory(String categoryName) {
        // Implement logic to verify products in the selected category
    }

    public void selectMultipleCategories(String[] categoryNames) {
        for (String category : categoryNames) {
            selectCategory(category);
        }
    }

    public void verifyProductsInCategories(String[] categoryNames) {
        // Implement logic to verify products in the selected categories
    }

    public void deselectCategory(String categoryName) {
        driver.findElement(By.xpath("//button[text()='" + categoryName + "']")).click();
    }

    public void sortProducts(String sortOption) {
        driver.findElement(By.xpath("//button[text()='" + sortOption + "']")).click();
    }

    public void verifyProductsSortedBy(String sortOption) {
        // Implement logic to verify products are sorted by the given option
    }

    public void verifyResponsiveUI() {
        // Implement logic to verify the UI is responsive
    }

    public void verifyMessageDisplayed(String message) {
        boolean isDisplayed = driver.findElement(By.xpath("//*[contains(text(),'" + message + "')]")).isDisplayed();
        if (!isDisplayed) throw new AssertionError("Message not found: " + message);
    }

    public void verifyProductListingUnchanged() {
        // Implement logic to verify the product listing remains unchanged
    }
}
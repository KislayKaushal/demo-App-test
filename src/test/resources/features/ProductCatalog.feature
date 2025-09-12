Feature: Product Catalog

  Scenario: Display list of product categories
    Given the customer is on the product catalog page
    When the page loads
    Then the system should display a list of product categories

  Scenario: Filter products by selecting a single category
    Given the customer is on the product catalog page
    And the list of product categories is displayed
    When the customer selects a category
    Then the product listing should update to show products in the selected category

  Scenario: Filter products by selecting multiple categories
    Given the customer is on the product catalog page
    And the list of product categories is displayed
    When the customer selects multiple categories
    Then the product listing should update to show products in the selected categories

  Scenario: Deselect a category to update product listing
    Given the customer has selected multiple categories
    When the customer deselects a category
    Then the product listing should update to show products in the remaining selected categories

  Scenario: Sort filtered products by price
    Given the customer has filtered products by selecting one or more categories
    When the customer selects the sort option "Price"
    Then the product listing should update to show products sorted by price

  Scenario: Sort filtered products by popularity
    Given the customer has filtered products by selecting one or more categories
    When the customer selects the sort option "Popularity"
    Then the product listing should update to show products sorted by popularity

  Scenario: Sort filtered products by relevance
    Given the customer has filtered products by selecting one or more categories
    When the customer selects the sort option "Relevance"
    Then the product listing should update to show products sorted by relevance

  Scenario: Intuitive and responsive user interface on desktop
    Given the customer is using a desktop device
    When the customer navigates between categories and filters products
    Then the user interface should be intuitive and responsive

  Scenario: Intuitive and responsive user interface on mobile
    Given the customer is using a mobile device
    When the customer navigates between categories and filters products
    Then the user interface should be intuitive and responsive

  Scenario: Edge case - No products in selected category
    Given the customer selects a category with no products
    When the product listing updates
    Then the system should display a message stating "No products found in this category"

  Scenario: Edge case - Network downtime during filtering
    Given the customer is filtering products
    When there is network downtime
    Then the system should display an error message stating "Network error, please try again later"
    And the product listing should not update

  Scenario: Edge case - Empty input for category selection
    Given the customer is on the product catalog page
    When the customer does not select any category
    Then the product listing should display all available products
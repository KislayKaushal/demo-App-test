Feature: Checkout & Payment

  Scenario: Selecting a payment method
    Given the user is on the checkout page
    When the user selects a payment method (e.g., credit card, PayPal)
    Then the selected payment method should be highlighted

  Scenario: Entering and saving payment information securely
    Given the user is on the checkout page
    When the user enters valid payment information
    And clicks the "Save Payment Information" button
    Then the payment information should be saved securely
    And the user should see a confirmation message stating "Payment information saved securely"

  Scenario: Entering and editing delivery address
    Given the user is on the checkout page
    When the user enters a valid delivery address
    And clicks the "Save Delivery Address" button
    Then the delivery address should be saved
    And the user should see a confirmation message stating "Delivery address saved"
    
    Given the user has saved a delivery address
    When the user edits the delivery address
    And clicks the "Save Delivery Address" button
    Then the updated delivery address should be saved
    And the user should see a confirmation message stating "Delivery address updated"

  Scenario: Validating entered information before processing payment
    Given the user is on the checkout page
    When the user enters payment information and delivery address
    And clicks the "Place Order" button
    Then the system should validate the entered payment information and delivery address
    And if any information is invalid, the user should see an error message indicating the invalid fields

  Scenario: Successful payment and order placement
    Given the user is on the checkout page
    When the user enters valid payment information and delivery address
    And clicks the "Place Order" button
    Then the system should process the payment
    And the user should see a confirmation message stating "Payment successful, order placed"

  Scenario: Responsive checkout process on desktop and mobile devices
    Given the user is on the checkout page
    When the user accesses the checkout page on a desktop device
    Then the checkout process should be responsive and display correctly
    
    Given the user is on the checkout page
    When the user accesses the checkout page on a mobile device
    Then the checkout process should be responsive and display correctly

  Scenario: Reviewing order summary before finalizing the purchase
    Given the user is on the checkout page
    When the user clicks the "Review Order" button
    Then the user should see an order summary with all selected items, payment method, and delivery address
    And the user should be able to finalize the purchase from the order summary page

  Scenario: Edge case - Empty payment information
    Given the user is on the checkout page
    When the user leaves the payment information fields empty
    And clicks the "Place Order" button
    Then the user should see an error message stating "Payment information is required"

  Scenario: Edge case - Empty delivery address
    Given the user is on the checkout page
    When the user leaves the delivery address fields empty
    And clicks the "Place Order" button
    Then the user should see an error message stating "Delivery address is required"

  Scenario: Edge case - Invalid payment information format
    Given the user is on the checkout page
    When the user enters invalid payment information format
    And clicks the "Save Payment Information" button
    Then the user should see an error message stating "Invalid payment information format"

  Scenario: Edge case - Invalid delivery address format
    Given the user is on the checkout page
    When the user enters invalid delivery address format
    And clicks the "Save Delivery Address" button
    Then the user should see an error message stating "Invalid delivery address format"

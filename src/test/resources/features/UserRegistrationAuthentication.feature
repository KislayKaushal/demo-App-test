Feature: User Registration & Authentication

  Scenario: Successful registration using email
    Given the customer is on the registration page
    When the customer enters a valid email address
    And the customer enters a valid password that meets security rules
    And the customer clicks the "Register" button
    Then the customer should receive an OTP/email confirmation for account activation
    And the customer should be prompted to enter the OTP/email confirmation
    When the customer enters the correct OTP/email confirmation
    Then the customer should see a message stating "Account successfully activated"
    And the customer should be redirected to the login page

  Scenario: Successful registration using mobile
    Given the customer is on the registration page
    When the customer enters a valid mobile number
    And the customer enters a valid password that meets security rules
    And the customer clicks the "Register" button
    Then the customer should receive an OTP for account activation
    And the customer should be prompted to enter the OTP
    When the customer enters the correct OTP
    Then the customer should see a message stating "Account successfully activated"
    And the customer should be redirected to the login page

  Scenario: Successful registration using Google account
    Given the customer is on the registration page
    When the customer clicks the "Register with Google" button
    And the customer completes the Google authentication process
    Then the customer should see a message stating "Account successfully activated"
    And the customer should be redirected to the login page

  Scenario: Successful registration using Facebook account
    Given the customer is on the registration page
    When the customer clicks the "Register with Facebook" button
    And the customer completes the Facebook authentication process
    Then the customer should see a message stating "Account successfully activated"
    And the customer should be redirected to the login page

  Scenario: Registration fails due to invalid email format
    Given the customer is on the registration page
    When the customer enters an invalid email address
    And the customer enters a valid password that meets security rules
    And the customer clicks the "Register" button
    Then the customer should see an error message stating "Invalid email format"

  Scenario: Registration fails due to invalid mobile number format
    Given the customer is on the registration page
    When the customer enters an invalid mobile number
    And the customer enters a valid password that    meets the customer should see security rules
    And the customer clicks the "Register" button
 Then an error message stating "Invalid mobile number format"

  Scenario: Registration fails due to weak password
    Given the customer is on the registration page
    When the customer enters a valid email address or mobile number
    And the customer enters a password that does not meet security rules
    And the customer clicks the "Register" button
    Then the customer should see an error message stating "Password does not meet security requirements"

  Scenario: Registration fails due to incorrect OTP/email confirmation
    Given the customer has received an OTP/email confirmation for account activation
    When the customer enters an incorrect OTP/email confirmation
    Then the customer should see an error message stating "Invalid OTP/email confirmation"

  Scenario: Registration fails due to missing OTP/email confirmation
    Given the customer has received an OTP/email confirmation for account activation
    When the customer does not enter the OTP/email confirmation
    And the customer clicks the "Activate" button
    Then the customer should see an error message stating "OTP/email confirmation required"
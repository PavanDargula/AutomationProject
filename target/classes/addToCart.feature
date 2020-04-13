Feature: Add product to cart

  Scenario: Add product to cart and validate the basket
    Given User navigates to the webpage
    When User clicks and adds product to cart
    Then Product is visible in the basket



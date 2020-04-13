Feature: E2E Scenario
  Scenario Outline: E2E Scenario to add multiple dresses into basket and complete the checkout
    Given User logs into website
    When User searches for the dress with search word "<Search>"
    Then Completes the checkout

    Examples:
    |Search|
    |Dress |
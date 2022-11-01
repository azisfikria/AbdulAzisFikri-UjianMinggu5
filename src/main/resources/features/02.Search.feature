Feature: User search

  Scenario: User search first product
    When User click button search
    And User enter first product name
    And User choose product jeans
    And User pick colour size jeans
    Then User click add to cart

  Scenario: User search second product
    When User click button search
    And User enter second product name
    And User choose product coat
    And User pick colour size coat
    Then User click add to cart
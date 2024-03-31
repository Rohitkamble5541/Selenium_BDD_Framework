Feature: General user view
  Scenario: Validate general user is able to view products without logging in
    Given User navigates to the Online Products Page
    When User clicks on Formal Shoes drop down
    Then User should be able to view the Products

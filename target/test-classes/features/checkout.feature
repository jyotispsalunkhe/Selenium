
Feature: place the order of the product

@regression
Scenario Outline:Search experience in both home and offer page with multipletest data
Given User is on greenkart landing page
When User searched with short name <Name> and extracted actual name of product
And user added 3 items of the selected product to the cart
Then user proceed to checkout and validate the <Name> items in checkout page
And  verify user has ability to enter promo code and place the order

Examples:
|Name|
|Tom|

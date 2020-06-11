Feature: Placing order

  Scenario: Create an order as a billing address different shipping method as 2nd day air
    Given user is in home page
    When he added an item to the cart
    And go to cart
    And checkout from the cart
    And login to the application with email  "anushaemani@test.com"
    And with password  "testing"
    And set  billing address
    And set shipping method as 2nd day air
    And set default payment method
    And continue in payment
    And confirm the order
    Then the order confirmation screen with message is shown "Your order has been successfully processed!"




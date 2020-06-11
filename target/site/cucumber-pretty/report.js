$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/PlacingOrder.feature");
formatter.feature({
  "name": "Placing order",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create an order as a billing address different shipping method as 2nd day air",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_is_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he added an item to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.he_added_an_item_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.go_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "checkout from the cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.checkout_from_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login to the application with email  \"anushaemani@test.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.loginToTheApplicationWithEmail(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "with password  \"testing\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.withPassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "set  billing address",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.set_billing_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "set shipping method as 2nd day air",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.set_shipping_method_as_2nd_day_air()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "set default payment method",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.set_default_payment_method()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "continue in payment",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.continue_in_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirm the order",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.confirm_the_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the order confirmation screen with message is shown \"Your order has been successfully processed!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.the_order_confirmation_screen_with_message_is_shown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "testing Hotel Booking Functionality on adactin application",
  "description": "",
  "id": "testing-hotel-booking-functionality-on-adactin-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5492193563,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to the landing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 208418241834,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 35513838,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "User checking the Select Booking Details Functionality by checking the valid Hotel Booking Page",
  "description": "",
  "id": "testing-hotel-booking-functionality-on-adactin-application;user-checking-the-select-booking-details-functionality-by-checking-the-valid-hotel-booking-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "the page is already partially autopopulated the rest is dropdown",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "User enter valid first name \"karthick\" the First name field",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User enter valid last name \"keyan\" the Last name field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User enter valid address \"dubai kurruku theruu\"  the Billing address field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User enter  the valid credi card number \"1234567891456789\"  on Credit Card Number field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User select Credit Card Type in the Credit Card field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User selects  the card in the Expiry Date field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User selects the card expiry year  field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User enters  valid ccv number \"345\" on the CVV Number field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Click the Book Now Button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Click the Logout Button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User is logged out and navigated back to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_page_is_already_partially_autopopulated_the_rest_is_dropdown()"
});
formatter.result({
  "duration": 528908692,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "karthick",
      "offset": 29
    }
  ],
  "location": "StepDefinition.user_enter_the_First_name_field(String)"
});
formatter.result({
  "duration": 84550301252,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "keyan",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_enter_the_Last_name_field(String)"
});
formatter.result({
  "duration": 10013784057,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dubai kurruku theruu",
      "offset": 26
    }
  ],
  "location": "StepDefinition.user_enter_the_Billing_address_field(String)"
});
formatter.result({
  "duration": 20345217708,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567891456789",
      "offset": 41
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_Credit_Card_Number_field(String)"
});
formatter.result({
  "duration": 2441261365,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_Credit_Card_Type_in_the_Credit_Card_field()"
});
formatter.result({
  "duration": 3169497374,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_card_in_the_Expiry_Date_field()"
});
formatter.result({
  "duration": 2142815810,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_card_expiry_year_field()"
});
formatter.result({
  "duration": 2302935978,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "345",
      "offset": 31
    }
  ],
  "location": "StepDefinition.user_enters_in_the_CVV_Number_field(String)"
});
formatter.result({
  "duration": 2158385187,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_the_Book_Now_Button()"
});
formatter.result({
  "duration": 2175435407,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_the_Logout_Button()"
});
formatter.result({
  "duration": 3909730164,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_logged_out_and_navigated_back_to_login_page()"
});
formatter.result({
  "duration": 3479409930,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]\u003e but was:\u003c[  ]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.adactin.stepdefinition.StepDefinition.user_is_logged_out_and_navigated_back_to_login_page(StepDefinition.java:208)\r\n\tat ✽.Then User is logged out and navigated back to login page(src/test/java/com/adactin/feature/Adactin.feature:48)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 8802650074,
  "status": "passed"
});
});
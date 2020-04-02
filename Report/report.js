$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "testing Hotel Booking Functionality on adactin application",
  "description": "",
  "id": "testing-hotel-booking-functionality-on-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User checking the login function using valid username and password",
  "description": "",
  "id": "testing-hotel-booking-functionality-on-adactin-application;user-checking-the-login-function-using-valid-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User check the username \"\u003cusername\u003e\"  in the username field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User check the password  \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User navigates to Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "testing-hotel-booking-functionality-on-adactin-application;user-checking-the-login-function-using-valid-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "testing-hotel-booking-functionality-on-adactin-application;user-checking-the-login-function-using-valid-username-and-password;;1"
    },
    {
      "cells": [
        "aaaaaa",
        "12345678"
      ],
      "line": 17,
      "id": "testing-hotel-booking-functionality-on-adactin-application;user-checking-the-login-function-using-valid-username-and-password;;2"
    },
    {
      "cells": [
        "karthicksekar2011",
        "rssugk98"
      ],
      "line": 18,
      "id": "testing-hotel-booking-functionality-on-adactin-application;user-checking-the-login-function-using-valid-username-and-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4416993136,
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
  "duration": 50186051046,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 97257,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User checking the login function using valid username and password",
  "description": "",
  "id": "testing-hotel-booking-functionality-on-adactin-application;user-checking-the-login-function-using-valid-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User check the username \"aaaaaa\"  in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User check the password  \"12345678\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User navigates to Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 62727205771,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aaaaaa",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_check_the_username_in_the_username_field(String)"
});
formatter.result({
  "duration": 11148758242,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 26
    }
  ],
  "location": "StepDefinition.user_check_the_password_in_the_password_field(String)"
});
formatter.result({
  "duration": 2404590222,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 19527990374,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_Search_Hotel_Page()"
});
formatter.result({
  "duration": 151994,
  "status": "passed"
});
formatter.after({
  "duration": 3708016882,
  "status": "passed"
});
formatter.before({
  "duration": 1880728613,
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
  "duration": 83572,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 50339,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User checking the login function using valid username and password",
  "description": "",
  "id": "testing-hotel-booking-functionality-on-adactin-application;user-checking-the-login-function-using-valid-username-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User check the username \"karthicksekar2011\"  in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User check the password  \"rssugk98\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User navigates to Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 7173228804,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "karthicksekar2011",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_check_the_username_in_the_username_field(String)"
});
formatter.result({
  "duration": 3365416307,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rssugk98",
      "offset": 26
    }
  ],
  "location": "StepDefinition.user_check_the_password_in_the_password_field(String)"
});
formatter.result({
  "duration": 2234585550,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 9633599885,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_Search_Hotel_Page()"
});
formatter.result({
  "duration": 64512,
  "status": "passed"
});
formatter.after({
  "duration": 1635029411,
  "status": "passed"
});
formatter.before({
  "duration": 1842122111,
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
  "duration": 106053,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 51805,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User checking the Search Hotel functionality by selecting the valid Hotel details",
  "description": "",
  "id": "testing-hotel-booking-functionality-on-adactin-application;user-checking-the-search-hotel-functionality-by-selecting-the-valid-hotel-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "User already logged in the booking page.",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User selects the  location from the location field",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User selects the  Hotels from the Hotels field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User selects the  Roomtype from the Roomtype field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User selects the  Number of Rooms from the Number of roomstype field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User selects the  Adults per Room from the Adults per Room type field",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User selects the  Children per Room from the Children per Room type field",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User confirms that the search is carried out succesfully",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User click on radio button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user confirms the confirmation is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_already_logged_in_the_booking_page()"
});
formatter.result({
  "duration": 564480,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_location_from_the_location_field()"
});
formatter.result({
  "duration": 2815442992,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_Hotels_from_the_Hotels_field()"
});
formatter.result({
  "duration": 2274847371,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_Roomtype_from_the_Roomtype_field()"
});
formatter.result({
  "duration": 2298340967,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_Number_of_Rooms_from_the_Number_of_roomstype_field()"
});
formatter.result({
  "duration": 2217788491,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_Adults_per_Room_from_the_Adults_per_Room_type_field()"
});
formatter.result({
  "duration": 2150123257,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_Children_per_Room_from_the_Children_per_Room_type_field()"
});
formatter.result({
  "duration": 2172827071,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_submit_button()"
});
formatter.result({
  "duration": 4883357476,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirms_that_the_search_is_carried_out_succesfully()"
});
formatter.result({
  "duration": 92370,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_radio_button()"
});
formatter.result({
  "duration": 2425357210,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_continue_button()"
});
formatter.result({
  "duration": 5073159014,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirms_the_confirmation_is_successful()"
});
formatter.result({
  "duration": 102632,
  "status": "passed"
});
formatter.after({
  "duration": 1206072727,
  "status": "passed"
});
formatter.before({
  "duration": 1272545955,
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
  "duration": 92370,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_the_landing_page()"
});
formatter.result({
  "duration": 53760,
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
  "duration": 150528,
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
  "duration": 3070286277,
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
  "duration": 2245562847,
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
  "duration": 2489241163,
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
  "duration": 2671038819,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_Credit_Card_Type_in_the_Credit_Card_field()"
});
formatter.result({
  "duration": 2357389454,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_card_in_the_Expiry_Date_field()"
});
formatter.result({
  "duration": 2148366772,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_card_expiry_year_field()"
});
formatter.result({
  "duration": 2223810585,
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
  "duration": 2240158993,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_the_Book_Now_Button()"
});
formatter.result({
  "duration": 2219179897,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_the_Logout_Button()"
});
formatter.result({
  "duration": 4624808664,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_logged_out_and_navigated_back_to_login_page()"
});
formatter.result({
  "duration": 81129,
  "status": "passed"
});
formatter.after({
  "duration": 1284367773,
  "status": "passed"
});
});
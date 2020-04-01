Feature: testing Hotel Booking Functionality on adactin application

Background:
Given the user is logged in
And  goes to the landing page

@login
Scenario Outline: User checking the login function using valid username and password 
	Given user launch the application 
	And User check the username "<username>"  in the username field 
	And  User check the password  "<password>" in the password field 
	And User click on the login button 
	Then User navigates to Search Hotel Page 
	
	Examples: 
	|username|password|
	|aaaaaa|12345678|
	|karthicksekar2011|rssugk98|
	
	
	
Scenario: User checking the Search Hotel functionality by selecting the valid Hotel details 
	Given User already logged in the booking page. 
	When User selects the  location from the location field 
	And User selects the  Hotels from the Hotels field 
	And User selects the  Roomtype from the Roomtype field 
	And User selects the  Number of Rooms from the Number of roomstype field 
	And User selects the  Adults per Room from the Adults per Room type field 
	And User selects the  Children per Room from the Children per Room type field 
	And User click on submit button 
	Then User confirms that the search is carried out succesfully 
	When User click on radio button 
	And click on continue button 
	Then user confirms the confirmation is successful
		
Scenario: User checking the Select Booking Details Functionality by checking the valid Hotel Booking Page 
	Given the page is already partially autopopulated the rest is dropdown 
	When User enter valid first name "karthick" the First name field 
	And User enter valid last name "keyan" the Last name field 
	And User enter valid address "dubai kurruku theruu"  the Billing address field 
	And User enter  the valid credi card number "1234567891456789"  on Credit Card Number field 
	And User select Credit Card Type in the Credit Card field 
	And User selects  the card in the Expiry Date field 
	And User selects the card expiry year  field 
	And User enters  valid ccv number "345" on the CVV Number field 
	And Click the Book Now Button 
	And Click the Logout Button 
	Then User is logged out and navigated back to login page 
	
	

package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {
    public static WebDriver driver=browserLaunch("chrome");
	//public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	    
	@Given("^the user is logged in$")
	public void the_user_is_logged_in() throws Throwable {
	    
	}

	@Given("^goes to the landing page$")
	public void goes_to_the_landing_page() throws Throwable {
	    
	}

	@When("^user to login to the application$")
	public void user_to_login_to_the_application() throws Throwable {
		System.out.println(" login repeats when user nagivated to next page");

	}

	@Given("^user launch the application$")
	public void user_launch_the_application() throws InterruptedException, IOException {
		  String url = FileReaderManager.getInstance().CrInstance().geturl();
		  getUrl(url); 
		  Thread.sleep(5000);
	}

	

	@Given("^User check the username \\\"([^\\\"]*)\\\"  in the username field$")
	public void user_check_the_username_in_the_username_field(String username) throws InterruptedException {
		inputValueElement(pom.getLp().getUsername(), username);
		Thread.sleep(3000);
	}

	@Given("^User check the password  \\\"([^\\\"]*)\\\" in the password field$")
	public void user_check_the_password_in_the_password_field(String password) throws InterruptedException {
		inputValueElement(pom.getLp().getPassword(), password);
		Thread.sleep(2000);
	}

	@Given("^User click on the login button$")
	public void user_click_on_the_login_button() throws InterruptedException {
		clickOnElement(pom.getLp().getLogin());
		Thread.sleep(5000);
	}
                                                                                                              
	@Then("^User navigates to Search Hotel Page$")
	public void user_navigates_to_Search_Hotel_Page() {
	}

	@Given("^User already logged in the booking page\\.$")
	public void user_already_logged_in_the_booking_page() throws InterruptedException {
		System.out.println("user logged into booking page");
		
		
	}

	@When("^User selects the  location from the location field$")
	public void user_selects_the_location_from_the_location_field() throws InterruptedException {
		inputValueElement(pom.getsh().getLocation(),"sydney");
		Thread.sleep(2000);

	}

	@When("^User selects the  Hotels from the Hotels field$")
	public void user_selects_the_Hotels_from_the_Hotels_field() throws InterruptedException {
		inputValueElement(pom.getsh().getHotels(), "Hotel Creek");
		Thread.sleep(2000);

	}

	@When("^User selects the  Roomtype from the Roomtype field$")
	public void user_selects_the_Roomtype_from_the_Roomtype_field() throws InterruptedException {
		inputValueElement(pom.getsh().getRoomType(), "standard");
		Thread.sleep(2000);
	}

	@When("^User selects the  Number of Rooms from the Number of roomstype field$")
	public void user_selects_the_Number_of_Rooms_from_the_Number_of_roomstype_field() throws InterruptedException {
		inputValueElement(pom.getsh().getNoofrooms(), "one");
		Thread.sleep(2000);
	}

	@When("^User selects the  Adults per Room from the Adults per Room type field$")
	public void user_selects_the_Adults_per_Room_from_the_Adults_per_Room_type_field() throws InterruptedException {
		inputValueElement(pom.getsh().getAdultperroom(), "1");
		Thread.sleep(2000);
	}

	@When("^User selects the  Children per Room from the Children per Room type field$")
	public void user_selects_the_Children_per_Room_from_the_Children_per_Room_type_field() throws InterruptedException {
		inputValueElement(pom.getsh().getChildrroom(), "1");
		Thread.sleep(2000);
	}

	@When("^User click on submit button$")
	public void user_click_on_submit_button() throws InterruptedException {
		clickOnElement(pom.getsh().getSearch());
		Thread.sleep(2000);
	}

	@Then("^User confirms that the search is carried out succesfully$")
	public void user_confirms_that_the_search_is_carried_out_succesfully() {
	}

	@When("^User click on radio button$")
	public void user_click_on_radio_button() throws InterruptedException {
		clickOnElement(pom.getsh1().getRadiobutton());
		Thread.sleep(2000);
	}

	@When("^click on continue button$")
	public void click_on_continue_button() throws InterruptedException {
		clickOnElement(pom.getsh1().getContinue());
		Thread.sleep(2000);
	}

	@Then("^user confirms the confirmation is successful$")
	public void user_confirms_the_confirmation_is_successful() {

	}

	@Given("^the page is already partially autopopulated the rest is dropdown$")
	public void the_page_is_already_partially_autopopulated_the_rest_is_dropdown() {
		System.out.println("page is already autopopulated");

	}

	@When("^User enter valid first name \\\"([^\\\"]*)\\\" the First name field$")
	public void user_enter_the_First_name_field(String firstname) throws InterruptedException {
		inputValueElement(pom.getbp().getFirstname(), firstname);
		Thread.sleep(2000);
	}

	@When("^User enter valid last name \\\"([^\\\"]*)\\\" the Last name field$")
	public void user_enter_the_Last_name_field(String lastname) throws InterruptedException {
		inputValueElement(pom.getbp().getLastname(), lastname);
		Thread.sleep(2000);
	}

	@When("^User enter valid address \\\"([^\\\"]*)\\\"  the Billing address field$")
	public void user_enter_the_Billing_address_field(String address) throws InterruptedException {
		inputValueElement(pom.getbp().getAddress(), address);
		Thread.sleep(2000);
	}

	@When("^User enter  the valid credi card number \\\"([^\\\"]*)\\\"  on Credit Card Number field$")
	public void user_enter_the_valid_Credit_Card_Number_field(String creditnumber) throws InterruptedException {
		inputValueElement(pom.getbp().getCvnumber(),creditnumber);
		Thread.sleep(2000);
	}

	@When("^User select Credit Card Type in the Credit Card field$")
	public void user_select_Credit_Card_Type_in_the_Credit_Card_field() throws InterruptedException {
		inputValueElement(pom.getbp().getCctype(), "master");
		Thread.sleep(2000);
	}

	@When("^User selects  the card in the Expiry Date field$")
	public void user_selects_the_card_in_the_Expiry_Date_field() throws InterruptedException {
		inputValueElement(pom.getbp().getMonth(),"5");
		Thread.sleep(2000);
	}

	@When("^User selects the card expiry year  field$")
	public void user_selects_the_card_expiry_year_field() throws InterruptedException {
		inputValueElement(pom.getbp().getYear(),"2020");
		Thread.sleep(2000);
	}

	@When("^User enters  valid ccv number \\\"([^\\\"]*)\\\" on the CVV Number field$")
	public void user_enters_in_the_CVV_Number_field(String cvv) throws InterruptedException {
		inputValueElement(pom.getbp().getCvv(), cvv);
		Thread.sleep(2000);
	}

	@When("^Click the Book Now Button$")
	public void click_the_Book_Now_Button() throws InterruptedException {
		clickOnElement(pom.getbp().getBooknow());
		Thread.sleep(2000);
	}

	@When("^Click the Logout Button$")
	public void click_the_Logout_Button() throws InterruptedException {
		clickOnElement(pom.getbp1().getLogout());
		Thread.sleep(2000);
	}

	@Then("^User is logged out and navigated back to login page$")
	public void user_is_logged_out_and_navigated_back_to_login_page() {

	}

}

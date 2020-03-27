package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
 public static WebDriver driver;
 
 @FindBy(id="location")
 private WebElement location;
 
 @FindBy(id="hotels")
 private WebElement hotels;
 
 @FindBy(id="room_type")
 private WebElement roomType;
 
 @FindBy(id="room_nos")
 private WebElement noofrooms;
 
 @FindBy(id="datepick_in")
 private WebElement checkindate;
 
 @FindBy(id="datepick_out")
 private WebElement checkoutdate;
 
 @FindBy(id="adult_room")
 private WebElement adultperroom;
 
 @FindBy(id="child_room")
 private WebElement childrroom;
 
 @FindBy(id="Submit")
 private WebElement search;
 
  public SearchHotel(WebDriver ldriver) {
	  this.driver=ldriver;
	  PageFactory.initElements(driver, this);
	  
  }


public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getNoofrooms() {
	return noofrooms;
}

public WebElement getCheckindate() {
	return checkindate;
}

public WebElement getCheckoutdate() {
	return checkoutdate;
}

public WebElement getAdultperroom() {
	return adultperroom;
}

public WebElement getChildrroom() {
	return childrroom;
}

public WebElement getSearch() {
	return search;

}	
}	


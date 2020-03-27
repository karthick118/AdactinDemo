package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
  	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement Continue;


	public SelectHotel(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
		
		
	}



	public WebElement getRadiobutton() {
		return radiobutton;
	}


	public WebElement getContinue() {
		return Continue;
	}
	
}

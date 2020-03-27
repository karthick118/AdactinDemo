package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationBookedPage {
	public static WebDriver driver;
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement logout;

	public ConfirmationBookedPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLogout() {
		return logout;
	}
}

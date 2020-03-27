package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.BookedPage;
import com.adactin.pom.ConfirmationBookedPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	public static WebDriver driver;

	public static LoginPage lp;
	public static SearchHotel sh;
	public static SelectHotel sh1;
	public static BookedPage bp;
	public static ConfirmationBookedPage bp1;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
		

	}

	public static LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;

	}

	public static SearchHotel getsh() {
		sh = new SearchHotel(driver);
		return sh;
	}

	public static SelectHotel getsh1() {
		sh1 = new SelectHotel(driver);
		return sh1;

	}

	public static BookedPage getbp() {
		bp = new BookedPage(driver);
		return bp;

	}

	public static ConfirmationBookedPage getbp1() {
		bp1 = new ConfirmationBookedPage(driver);
		return bp1;
	}
}

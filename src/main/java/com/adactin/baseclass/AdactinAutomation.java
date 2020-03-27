package com.adactin.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

    public class AdactinAutomation extends BaseClass {
    public static WebDriver driver; 
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","F:\\Users\\Karthick\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://adactin.com/HotelApp/");
		driver = browserLaunch("chrome");
		getUrl("https://adactin.com/HotelApp/");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		//username.sendKeys("karthicksekar2011");
		inputValueElement(username,"karthicksekar2011");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		//password.sendKeys("rssugk98");
		inputValueElement(password,"rssugk98");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		//login.click();
		clickOnElement(login);
		WebElement location = driver.findElement(By.id("location"));
		//Select l = new Select(location);
		//l.selectByValue("Sydney");
		dropDownSelection(location, "value", "Sydney");
		WebElement Hotels = driver.findElement(By.xpath("//*[@id=\"hotels\"]"));
        //Hotels.sendKeys("Hotel Creek");
        inputValueElement(Hotels,"Hotel Creek"); 	
        WebElement RoomType = driver.findElement(By.xpath("//*[@id=\"room_type\"]"));
        //RoomType.sendKeys("standard");
        inputValueElement(RoomType,"standard");
        WebElement noofrooms = driver.findElement(By.xpath("//*[@id=\"room_nos\"]"));
        //noofrooms.sendKeys("one");
        inputValueElement(noofrooms, "one");
        WebElement checkindate = driver.findElement(By.xpath("//*[@id=\"datepick_in\"]"));
        //checkindate.sendKeys("12/03/2015");
        inputValueElement(checkindate,"12/03/2015");
        WebElement checkoutdate = driver.findElement(By.xpath("//*[@id=\"datepick_out\"]"));
        //checkoutdate.sendKeys("13/03/2017");
        inputValueElement(checkoutdate, "13/03/2017");
        WebElement adultsperroom = driver.findElement(By.xpath("//*[@id=\"adult_room\"]"));
        //adultsperroom.sendKeys("1");
        inputValueElement(adultsperroom,"1");
        WebElement childrenperroom = driver.findElement(By.xpath("//*[@id=\"child_room\"]/option[2]"));
        //childrenperroom.click();
        //clickOnElement(childrenperroom);
        inputValueElement(childrenperroom, "1");
        WebElement search = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
        //search.click();
        clickOnElement(search);
        WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]"));
        //radiobutton.click();
        clickOnElement(radiobutton);
        WebElement Continue = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        //Continue.click();
        clickOnElement(Continue);
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
        //firstname.sendKeys("arvin");
        inputValueElement(firstname, "arvin"); 
        WebElement lastname = driver.findElement(By.id("last_name"));
        //lastname.sendKeys("dhan");
        inputValueElement(lastname, "vindhan");
        WebElement billingaddress = driver.findElement(By.xpath("//*[@id=\"address\"]"));
        //billingaddress.sendKeys("12345gnadhinagarstreetvellore");
        inputValueElement(billingaddress,"123gandhinagar" );
		WebElement CreditCardNo= driver.findElement(By.xpath("//*[@id=\"cc_num\"]"));
		//CreditCardNo.sendKeys("147897653541898989");
		inputValueElement(CreditCardNo, "1245686898714546123");
		WebElement CreditCardType = driver.findElement(By.xpath("//*[@id=\"cc_type\"]"));
		//CreditCardType.sendKeys("mastercard");
		inputValueElement(CreditCardType,"mastercard");
		WebElement ExpiryDate = driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]"));
		//Select d = new Select(ExpiryDate);
		//d.selectByValue("5");
		dropDownSelection(ExpiryDate, "value", "10");
		WebElement Expirydate = driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]"));
		//Select f = new Select(Expirydate);
		//f.selectByValue("2021");
		dropDownSelection(Expirydate, "value", "2022"); 
		WebElement Cvnumber = driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]"));
		//Cvnumber.sendKeys("246");
		inputValueElement(Cvnumber, "345");
		WebElement Booknow = driver.findElement(By.xpath("//*[@id=\"book_now\"]"));
		//Booknow.click();
		clickOnElement(Booknow); 
		WebElement logout = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]"));
		//logout.click();
		clickOnElement(logout);
	}
			
}
	


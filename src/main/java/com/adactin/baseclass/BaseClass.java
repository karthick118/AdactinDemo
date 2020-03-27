package com.adactin.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

public static WebDriver driver;
    
    //Browser Launch Baseclass
	public static WebDriver browserLaunch(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver","F:\\Users\\Karthick\\eclipse-workspace\\AdactinDemo\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+
					"Selenium Project\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+
						"F:\\Users\\Karthick\\eclipse-workspace\\Selenium Project\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("Invalide browsername");
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
    
	//GetUrl Baseclass
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Select (DropDown) Baseclass
     public static void dropDownSelection(WebElement element, String option, String input) {

		Select s = new Select(element);
		
		if (option.equals("index")) {
			int parseInt = Integer.parseInt(input);
			s.selectByIndex(parseInt);
			
		} else if (option.equals("value")) {
			s.selectByValue(input);
		}
		
		else if (option.equals("text")) {
			s.selectByVisibleText(input);
		}
	}

	//Driver(Browser Close) Close BaseClass
	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Driver (Browser Quit) Baseclass
	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
  
	//Inputvalue (SendKeys) Baseclass
	public static void inputValueElement(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	//Get Current Url BaseClass
     public static void getCurrentUrl() {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    //Get Title BaseClass
	 public static void getTitle() {

		try {
			driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	 
	 //Click Element Baseclass
	 public static void clickOnElement(WebElement element) {

			try {
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
     
	 //Navigate To Baseclass
	  public static void navigateTo(String url) {

			try {
				driver.navigate().to(url);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	  
	 //Navigate Back BaseClass
	  public static void navigateBack() {

			try {
				driver.navigate().back();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	  
	  //Navigate Forward Baseclass
	  public static void navigateForward() {

			try {
				driver.navigate().forward();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	  
	  //Navigate Refresh Baseclass
	  public static void refresh() {

			try {
				driver.navigate().refresh();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	  
	  //GetText Baseclass
	  public static void getText(WebElement element) {

			try {
				element.getText();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	  
	 //GetAttribute Baseclass
	  public static void getAttribute(WebElement element, String attributeName) {

			try {
				element.getAttribute(attributeName);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	  
	 //RadioButton BaseClass
	  public static void radioButtonClick(WebElement element) {

			try {
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	  
	 //Simple Alert BaseClass
	  public static void alertSimple() {

			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	  //Conform Alert BaseClass
		public static void alertConfirm(String confirmation) {

			try {
				if (confirmation.equalsIgnoreCase("ok")) {

					driver.switchTo().alert().accept();

				} else if (confirmation.equalsIgnoreCase("dismiss")) {

					driver.switchTo().alert().dismiss();
				} else {
					System.out.println("Invalid command");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
 
		//Prompt Alert Baseclass
		public static void alertPrompt(String confirmation, String message) {

			try {
				if (confirmation.equalsIgnoreCase("ok")) {

					driver.switchTo().alert().sendKeys(message);
					driver.switchTo().alert().accept();

				} else if (confirmation.equalsIgnoreCase("dismiss")) {

					driver.switchTo().alert().sendKeys(message);
					driver.switchTo().alert().dismiss();
				} else {
					System.out.println("Invalid command");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	  
		//Action Class BaseClass
		public static void actions(String type, WebElement element) {

			try {
				Actions ac = new Actions(driver);

				if (type.equalsIgnoreCase("doubleclick")) {
					ac.doubleClick(element).build().perform();
				} else if (type.equalsIgnoreCase("click")) {
					ac.click(element).build().perform();
				} else if (type.equalsIgnoreCase("clickandhold")) {
					ac.clickAndHold(element).build().perform();
				} else if (type.equalsIgnoreCase("contextclick")) {
					ac.contextClick(element).build().perform();
				} else {
					System.out.println("Invalid selection");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	   
		public static void Actionsa1(WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();

		}
		//DragandDrop BaseClass
		public static void dragAndDrop(WebElement source, WebElement target) {
			try {
				Actions ac = new Actions(driver);
				ac.dragAndDrop(source, target).build().perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	  //RobotClass BaseClass
	  
		public static void robot(WebElement source, WebElement target) throws Throwable {

			try {
				Robot r = new Robot();

				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);

				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
      
		//Frame BaseClass
		public static void frames(int i) {
			try {
				driver.switchTo().frame(i);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

		}
		
		//ImplicitWait BaseClass
		public static void implicitWait(int seconds) {

			try {
				driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
        //ExplicitWait BaseClass
		public static void explicitWait(int seconds, WebElement element) {

			try {
				WebDriverWait wait1 = new WebDriverWait(driver, seconds);
			    wait1.until(ExpectedConditions.visibilityOf(element));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
        
		//FluentWait Base Class
		@SuppressWarnings("deprecation")
		public static void fluentWait(int seconds, WebElement element, Wait<WebDriver> wait1) {

			try {
				wait1 = new FluentWait<WebDriver>(driver).withTimeout(seconds, TimeUnit.SECONDS)
						.pollingEvery(seconds, TimeUnit.SECONDS).ignoring(Exception.class);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
      
		//Element Display,Enable,Selected BaseClass
		public static void elementIsDisplayed(WebElement element, String type) {

			try {
				if (type.equalsIgnoreCase("isDisplayed")) {
					element.isDisplayed();
				} else if (type.equalsIgnoreCase("isEnabled")) {
					element.isEnabled();
				} else if (type.equalsIgnoreCase("isSelected")) {
					element.isSelected();
				} else {
					System.out.println("Invalid type");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		//Multiple CheckBox BaseClass
		public static void checkBox(List<WebElement> elements, String attributeName, String attributeValue) {

			try {
				for (WebElement element : elements) {
					if (element.getAttribute(attributeName).equals(attributeValue)
							|| element.getAttribute(attributeName).equals(attributeValue)) {
						element.click();

					} else {
						System.out.println("Out of Condition");
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		//Scroll BaseClass
		public static void scroll(WebElement element) {

			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		//ScreenShot BaseClass
		public static void screenshot(String filepath) throws Throwable {

			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dst = new File(filepath);
				FileUtils.copyFile(src, dst);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//WindowHandles BaseClass
		public static void windowHandles(String switchTitle) {

			try {
				Set<String> allID = driver.getWindowHandles();

				for (String id : allID) {

					System.out.println(id);
					String titles = driver.switchTo().window(id).getTitle();
					System.out.println(titles);

				}

				String switchString = switchTitle;

				for (String id : allID) {

					if (driver.switchTo().window(id).getTitle().equals(switchString)) {
						break;
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
        
		//Window Handle BaseClass
		public static void windowHandle(String id) {

			try {
				id = driver.getWindowHandle();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		



		

		
		
}
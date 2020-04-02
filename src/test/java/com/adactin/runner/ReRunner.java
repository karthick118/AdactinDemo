package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", 
        glue = "com\\adactin\\stepdefinition", 
        plugin = {"pretty", "html:Report", 
        		  "com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html"}, 		  
		monochrome = true, 
		dryRun = false,
		strict = true)

public class ReRunner {
	
	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {
		
		String browserlaunch = FileReaderManager.getInstance().CrInstance().getBrowserlaunch();
		System.out.println(browserlaunch);
		driver = BaseClass.browserLaunch(browserlaunch);
        
	}

	@AfterClass
	public static void teardown() {
	driver.close();
	
	}

}
	



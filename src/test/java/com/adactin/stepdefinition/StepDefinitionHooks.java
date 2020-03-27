package com.adactin.stepdefinition;

import com.adactin.baseclass.BaseClass;
                                                                      //hook -search context
                                                                      //Scenario -webdriver
                                                                      //scenar - remote webdriver
                                          //getname,getstatus,getid,getfailed etc..,/chrome/ie/firefox
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepDefinitionHooks {
	@Before
	public void beforeHooks(Scenario scenar) throws Throwable {
		System.out.println("beforeHooks");
		System.out.println("Scenario name is"+scenar.getName());
		if(scenar.getName().contentEquals(scenar.getName())) {
	    BaseClass.screenshot("F:\\Users\\Karthick\\eclipse-workspace\\SeleniumConcepts\\ScreenShot\\pic1.png");
	    BaseClass.screenshot("F:\\Users\\Karthick\\eclipse-workspace\\SeleniumConcepts\\ScreenShot\\pic2.png");
		}
	
	}
	@After
	public void afterHooks(Scenario scenar) throws Throwable {
		System.out.println("afterHooks");
		System.out.println(" status:"+scenar.getStatus());
		if(scenar.getStatus().equalsIgnoreCase("passed")) {
        BaseClass.screenshot("F:\\Users\\Karthick\\eclipse-workspace\\SeleniumConcepts\\ScreenShot\\pic.png");
        BaseClass.screenshot("F:\\Users\\Karthick\\eclipse-workspace\\SeleniumConcepts\\ScreenShot\\pic4.png");
		}else if (scenar.isFailed()) {
		BaseClass.screenshot("F:\\Users\\Karthick\\eclipse-workspace\\SeleniumConcepts\\ScreenShot\\pic3.png");	
			
		}

	}
	
}
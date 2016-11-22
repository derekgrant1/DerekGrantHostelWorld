package com.derekgrant.selenium.derekgrantest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {
	protected WebDriver driver;

	protected testBase() 
    {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
    }
	
    @Before
    public void setUp()throws Exception
	  {
    	
		  String baseUrl = "http://www.hostelworld.com";
		  System.out.println("Navigating to "+baseUrl);
		  driver.navigate().to(baseUrl);  
		  driver.manage().window().maximize();
	  }

    @After
    public void tearDown() {
        System.out.println("tearing down");
        driver.quit();
    }

}
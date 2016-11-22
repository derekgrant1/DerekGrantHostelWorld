package com.derekgrant.selenium.derekgrantest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	
	public void SearchFor(String search, WebDriver driver){
		System.out.println("Searching for "+ search);  
		  WebElement searchField = driver.findElement(By.id("home-search-keywords"));
		  searchField.sendKeys(search);
		  WebDriverWait wait = new WebDriverWait(driver,5);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".suggestion.needsclick")));
		  searchField.submit(); 
	}
}

package com.derekgrant.selenium.derekgrantest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class ResultsPage {
	
	public Boolean ConfirmAlphabetical(WebDriver driver)
	{
		ArrayList<String> obtainedList = new ArrayList<String>(); 
	  List<WebElement> elementList= driver.findElements(By.cssSelector("#fabResultsContainer .fabresult.rounded.clearfix.hwta-property"));
	  for(WebElement we:elementList){
	     obtainedList.add(we.getAttribute("data-name"));
	  }
	  
	  ArrayList<String> sortedList = new ArrayList<String>();   
	  for(String s:obtainedList){
	  sortedList.add(s);
	  }
	  Collections.sort(sortedList);
	  Assert.assertTrue(sortedList.equals(obtainedList));	
	  System.out.println("List is confirmed as being in alphabetical order");
	  return true;
	  }

	public void SortByName(WebDriver driver) {
		System.out.println("Sorting by name");
		WebDriverWait wait = new WebDriverWait(driver,5);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fabresult.rounded.clearfix.hwta-property")));
		WebElement sortButton = driver.findElement(By.cssSelector(".sub-nav.leftfilters.left .fa.fa-sort"));
		  sortButton.click();
		  WebElement sortList = driver.findElement(By.id("sortByName"));
		  sortList.isDisplayed();
		  sortList.click();		
	}

	public void SortByPrice(WebDriver driver) {
		System.out.println("Sorting by Price");
		WebDriverWait wait = new WebDriverWait(driver,5);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fabresult.rounded.clearfix.hwta-property")));
		WebElement sortButton = driver.findElement(By.cssSelector(".sub-nav.leftfilters.left .fa.fa-sort"));
		  sortButton.click();
		  WebElement sortList = driver.findElement(By.id("sortByPrice"));
		  sortList.isDisplayed();
		  sortList.click();		
	}
	
	public Boolean ConfirmPrice(WebDriver driver)
	{
		ArrayList<String> obtainedList = new ArrayList<String>(); 
	  List<WebElement> elementList= driver.findElements(By.cssSelector(".price .dormroom"));
	  for(WebElement we:elementList){
	     obtainedList.add(we.getAttribute("innerHTML"));
	  }
	  
	  ArrayList<String> sortedList = new ArrayList<String>();   
	  for(String s:obtainedList){
	  sortedList.add(s);
	  }
	  Collections.sort(sortedList);
	  Assert.assertTrue(sortedList.equals(obtainedList));	
	  System.out.println("List is confirmed as being in alphabetical order");
	  return true;
	  }
}

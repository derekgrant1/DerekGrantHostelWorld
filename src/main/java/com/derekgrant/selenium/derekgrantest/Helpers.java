package com.derekgrant.selenium.derekgrantest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Helpers 
{
	public String GetList(WebDriver driver)
	{
	List<WebElement> search = driver.findElements(By.className("result-type-city ui-menu-item"));
	for(WebElement s : search)
		{
		  String some = s.getAttribute("Title");
		  if(some.contains("Dublin"));
		  return some;
		}
	return null;
	}
}

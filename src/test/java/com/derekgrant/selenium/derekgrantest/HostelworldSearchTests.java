package com.derekgrant.selenium.derekgrantest;

import org.junit.Test;
import junit.framework.Assert;

public class HostelworldSearchTests extends testBase{
	 	
@Test
  public void testHostelSearchOne_test() throws Exception
  {	  
	  SearchPage search = new SearchPage();
	  search.SearchFor("Dublin, Ireland", driver);
	  
	  ResultsPage results = new ResultsPage();
	  results.SortByName(driver);
	  Assert.assertTrue(results.ConfirmAlphabetical(driver));	  
  } 

@Test
public void testHostelSearchTwo_test() throws Exception
{	  
	  SearchPage search = new SearchPage();
	  search.SearchFor("Dublin, Ireland", driver);
	  
	  ResultsPage results = new ResultsPage();
	  results.SortByPrice(driver);
	  Assert.assertTrue(results.ConfirmPrice(driver)); 
}
}
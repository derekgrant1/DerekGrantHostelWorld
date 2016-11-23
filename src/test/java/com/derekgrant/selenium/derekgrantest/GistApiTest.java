package com.derekgrant.selenium.derekgrantest;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpResponse;
import org.eclipse.egit.github.core.Gist;
import org.junit.Assert;
import org.junit.Test;

public class GistApiTest {
	private String login = "derekgrant1";
	private String password = "The1ihad4t1";
	
	
	@Test
	public void testApi_TestOne() throws IOException{
		GistBase api = new GistBase();
		String id = RandomStringUtils.randomNumeric(2);
		Gist create = api.CreateGist(login,password);
		Gist get = api.GetGist(login, password, id);
		
		Assert.assertEquals(create, get);
		
	}
	@Test
	public void testApi_CreateGist() throws Exception{
		ApiSetup api =  new ApiSetup();
		System.out.println("Create a new public Gist and confirm it returns 201 code");
		HttpResponse result = api.sendPost();
		Assert.assertTrue(result.getStatusLine().getStatusCode() == 201);		
	}
	
	@Test
	public void testApi_DeleteGist() throws Exception{
		ApiSetup api =  new ApiSetup();
		System.out.println("Delete a new public Gist and confirm it returns 204 code");
		HttpResponse result = api.DeleteGist();
		Assert.assertTrue(result.getStatusLine().getStatusCode() == 204);		
	}
}

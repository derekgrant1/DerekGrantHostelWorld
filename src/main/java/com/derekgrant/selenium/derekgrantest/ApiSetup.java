package com.derekgrant.selenium.derekgrantest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;



public class ApiSetup {

	public static void main(String[] args) throws Exception {}

	public String url = "https://api.github.com/";
		
	// HTTP GET request
	public boolean sendGet() throws Exception {

		String urlSend = url+"users/derekgrant1/gists";

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(urlSend);

		HttpResponse response = client.execute(request);

		int code = response.getStatusLine().getStatusCode();

		BufferedReader rd = new BufferedReader( new InputStreamReader(response.getEntity().getContent()));
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		System.out.println(result.toString());
		
		if(code == 200){
			 return true;}
		
		return false;
	}

	// HTTP POST request
	public HttpResponse sendPost() throws Exception {

		String urlSend = url+"gists";
		
	 	JSONObject  json = new JSONObject();
	 	JSONObject  fileJson = new JSONObject();
	 	JSONObject  fileSome = new JSONObject();
	 	
	 	json.put("description", "DEREK TEST HOSTELWORLD");
	 	json.put("public", "true");
	 	fileSome.put("content", "some info");
	 	fileJson.put("file1.txt", fileSome);
	 	json.put("files", fileJson);
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(urlSend);

		post.addHeader(HTTP.CONTENT_TYPE, "application/json");
		StringEntity params = new StringEntity(json.toString());
		
		post.addHeader("Accept","application/json");
		post.setEntity(params);		
		
		HttpResponse response = client.execute(post);
		
		return response;		
	}
	
	public HttpResponse DeleteGist() throws Exception {

		HttpResponse response = sendPost();
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null)
		{result.append(line);}
		String resultString =result.toString();
		        
        String[] details = resultString.split(",");
       	
        String[] id = details[3].split(":");
		String urlDelete = url+"gists/"+id[1].replace("\"", "");
		HttpClient client = HttpClientBuilder.create().build();
		HttpDelete delete = new HttpDelete(urlDelete);
		
		return client.execute(delete);
}}
	
	
	

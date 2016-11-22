package com.derekgrant.selenium.derekgrantest;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

public class GistBase {
	public void gist(){
		
	}
	GitHubClient client = new GitHubClient().setCredentials("user", "p4ssw0rd");
	Gist gist = new Gist().setDescription("Prints a string to standard out");
	GistFile file = new GistFile().setContent("System.out.println(\"Hello World\");");
	gist.setFiles(Collections.singletonMap("Hello.java", file));
	gist = new GistService(client).createGist(gist);
	
	

}

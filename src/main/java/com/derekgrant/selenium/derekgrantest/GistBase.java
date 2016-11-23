package com.derekgrant.selenium.derekgrantest;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.eclipse.egit.github.core.Gist;
import org.eclipse.egit.github.core.GistFile;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.GistService;

public class GistBase {
	
	public Gist CreateGist(String login,String password) throws IOException{
		GitHubClient client = new GitHubClient().setCredentials(login, password);			
		Gist gist = new Gist().setDescription(RandomStringUtils.randomAlphanumeric(20));
		
		GistFile file = new GistFile().setContent(RandomStringUtils.randomAlphabetic(20));
		gist.setFiles(Collections.singletonMap(RandomStringUtils.randomAlphabetic(5), file));
		return gist = new GistService(client).createGist(gist);	
		
	}
	
	public List<Gist> GetListOfGist(String login,String password) throws IOException{
		GitHubClient client = new GitHubClient().setCredentials(login, password);
	List<Gist> gist = new GistService(client).getGists(login);
	return gist;
	
	}
	
	public Gist GetGist(String login,String password,String id) throws IOException{
		GitHubClient client = new GitHubClient().setCredentials(login, password);
	Gist gist = new GistService(client).getGist(id);
	return gist;
	
	}

}
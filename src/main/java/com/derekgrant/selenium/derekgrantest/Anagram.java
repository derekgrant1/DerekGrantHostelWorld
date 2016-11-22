package com.derekgrant.selenium.derekgrantest;

import java.util.Arrays;

public class Anagram {

	
	public boolean isAnagram(String firstWord, String secondWord) {
		String firstWordLower = firstWord.toLowerCase().replaceAll("[!-+.^:,'? ]","");
		String secondWordLower = secondWord.toLowerCase().replaceAll("[!-+.^:,'? ]","");;
		
	    char[] word1 = firstWordLower.toCharArray();
	    char[] word2 = secondWordLower.toCharArray();
	    Arrays.sort(word1);
	    Arrays.sort(word2);
	    if(Arrays.equals(word1, word2)==true)
	    {
	    	System.out.println("'"+firstWord+"' is an Anagram of '"+secondWord+"'");
	    	return true;}
	    System.out.println("'"+firstWord+"' is not an Anagram of '"+secondWord+"'");
	    return false;
	    }
}

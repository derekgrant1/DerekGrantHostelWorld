package com.derekgrant.selenium.derekgrantest;

import org.junit.Test;

import junit.framework.Assert;

public class AnagramTest {
	@Test 
	public void testAnagrams_testOne(){
	Anagram anagram = new Anagram();
	String stringOne = "Punishment";
	String stringTwo = "Nine Thumps";
	System.out.print("Assert that '"+stringOne+"' is an anagram of '"+stringTwo+"'\n");
	Assert.assertTrue(anagram.isAnagram(stringOne,stringTwo));	
	}	
	
	@Test 
	public void testAnagrams_testTwo(){
	Anagram anagram = new Anagram();
	String stringOne = "The Morse code";
	String stringTwo = "Here come dots";
	System.out.print("Assert that '"+stringOne+"' is an anagram of '"+stringTwo+"'\n");
	Assert.assertTrue(anagram.isAnagram(stringOne,stringTwo));	
	}
	
	@Test 
	public void testAnagrams_testThree(){
	Anagram anagram = new Anagram();
	String stringOne = "Snooze alarms";
	String stringTwo = "Alas! No more Zs";
	System.out.print("Assert that '"+stringOne+"' is an anagram of '"+stringTwo+"'\n");
	Assert.assertTrue(anagram.isAnagram(stringOne,stringTwo));	
	}
	
	@Test 
	public void testAnagrams_testFour(){
	Anagram anagram = new Anagram();
	String stringOne = "Halley's Comet";
	String stringTwo = "Shall yet come";
	System.out.print("Assert that '"+stringOne+"' is an anagram of '"+stringTwo+"'\n");
	Assert.assertTrue(anagram.isAnagram(stringOne,stringTwo));	
	}
	
	@Test 
	public void testAnagrams_testFive(){
	Anagram anagram = new Anagram();
	String stringOne = "One good turn deserves another";
	String stringTwo = "Do rogues endorse that?No, never!";
	System.out.print("Assert that '"+stringOne+"' is an anagram of '"+stringTwo+"'\n");
	Assert.assertTrue(anagram.isAnagram(stringOne,stringTwo));	
	}
}

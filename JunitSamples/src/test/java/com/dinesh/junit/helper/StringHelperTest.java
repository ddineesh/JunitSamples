package com.dinesh.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {


	StringHelper helper=new StringHelper();
	//AABCD => BCD ABC => BC CEFG => CEFG CBAA => CBAA
	
	@Test
	public void testTruncateAInFirst2Positions_AinfirstTwoPostions() {
		
		assertEquals("BCD", helper.truncateAInFirst2Positions("AABCD"));

	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinlastTwoPostions() {
		assertEquals("CBAA", helper.truncateAInFirst2Positions("CBAA"));
		//AABCD => BCD ABC => BC CEFG => CEFG CBAA => CBAA
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinfirstPostion() {
		assertEquals("BC", helper.truncateAInFirst2Positions("ABC"));
		//AABCD => BCD ABC => BC CEFG => CEFG CBAA => CBAA
	}

	//AACAA => true, D => false, AB => true, ABCD => false
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_firstAndLastAreSame()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AACAA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_singleCharacterPassed()
	{
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("D"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_onlyTwoCharactersPassed()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_firstAndLastAreNotSame()
	{
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
}

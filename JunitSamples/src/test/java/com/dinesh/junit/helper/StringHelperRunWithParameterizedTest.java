package com.dinesh.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperRunWithParameterizedTest {

	StringHelper helper = new StringHelper();
	// AABCD => BCD ABC => BC CEFG => CEFG CBAA => CBAA

	private String input;
	private String expectedOutput;
	
	public StringHelperRunWithParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = { { "AABCD" , "BCD" }, { "CBAA" , "CBAA" }, { "ABC" , "BC" } };
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testTruncateAInFirst2Positions_AinfirstTwoPostions() {

		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));

	}

}

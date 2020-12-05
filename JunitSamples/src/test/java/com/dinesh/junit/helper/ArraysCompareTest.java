package com.dinesh.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraysSort_RandomArrays() {
		int[] numbers= {3,25,1,4};
		int[] expected= {1,3,4,25};
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray()
	{
		int[] numbers=null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout = 1000)
	public void testArray_Performance()
	{
		int[] arrays= {5,78,1};
		
		for(int i=0;i<1000000;i++)
		{
			arrays[0]=i;
			Arrays.sort(arrays);
		}
	}
	
}

package com.dinesh.junit.helper;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringHelper helper= new StringHelper();
		
		System.out.println(helper.truncateAInFirst2Positions("AAB"));
		System.out.println(helper.areFirstAndLastTwoCharactersTheSame("AABC"));
		}

}

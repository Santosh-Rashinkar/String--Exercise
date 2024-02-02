package com.string.program;

public class IndexOfSubstringInString {

	public static void main(String[] args) {
		
		String s = "Jay Shri Ram";
		
		String sub = "Jay";
		
		int result = occuranceOfSubString(s,sub);
		
		System.out.println("occurance of substring "+""+sub+""+" in string "+""+s+""+" at the index of "+result);
	}

	public static int occuranceOfSubString(String s, String sub) {
	
		return s.indexOf(sub);
	}
}

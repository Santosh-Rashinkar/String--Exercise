package com.string.program;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "REPLY";
		String str2 = "RPELY";
		
		if(isAnagram(str1,str2))
			System.out.println("given string is anagrams!!");
		else 
			System.out.println("given string are not anagrams!!");
	}
	
	public static boolean isAnagram(String str1, String str2) {
		
		str1 = str1.replaceAll(" ", "").toLowerCase();
		str2 = str2.replaceAll(" ", "").toLowerCase();
		
		if(str1.length() !=str2.length()) {
			return false;	
		}
		char[] array1 = str1.toCharArray();
		
		char[] array2 = str2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		return Arrays.equals(array1, array2);
	}

}
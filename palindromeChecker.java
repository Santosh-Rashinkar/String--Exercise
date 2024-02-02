package com.string.program;

public class palindromeChecker {

	public String checkPalindrome(String input) {

		String reversedString = "";

		System.out.println(reversedString);

		for (int i = input.length() - 1; i >= 0; i--) {

			reversedString = reversedString + input.charAt(i);
		}
		System.out.println(reversedString);

		if (input.equals(reversedString))

			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");

		return input;
	}

	public static void main(String[] args) {

		palindromeChecker obj1 = new palindromeChecker();

		obj1.checkPalindrome("RADAR");
	}
}
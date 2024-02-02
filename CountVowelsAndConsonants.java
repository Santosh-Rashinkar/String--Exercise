package com.string.program;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {

		String word = "I Love My India!!!";

		countingVowelsAndConsonants(word);
	}

	public static void countingVowelsAndConsonants(String input) {
		input = input.toLowerCase();
		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch))
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowels++;
				else
					consonants++;
		}
		System.out.println("Total vowels are: " + vowels);
		System.out.println("Total consonants are: " + consonants);
	}

}
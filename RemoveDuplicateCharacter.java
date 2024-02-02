package com.string.program;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {

		String input = "AABCB";

		String StringRemovedDuplicate = removeDuplicateChar(input);

		System.out.println("Original string : " + input);
		System.out.println("Output string is: " + StringRemovedDuplicate);
	}

	public static String removeDuplicateChar(String input) {

		StringBuilder res = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {

			char currentChar = input.charAt(i);

			if (!res.toString().contains(String.valueOf(currentChar))) {
				res.append(currentChar);
			}
		}

		return res.toString();
	}

}
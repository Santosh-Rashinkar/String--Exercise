package com.string.program;

public class ReverseString1 {

	public static String reverseMyString3(String myInput) {

		System.out.println("input string is: " + myInput);

		char[] data = myInput.toCharArray();

		int counter = 0;

		for (int i = myInput.length() - 1; i >= 0; i--) {

			data[counter++] = myInput.charAt(i);
		}
		return new String(data);
	}

	public static void main(String[] args) {

		System.out.println("Reverse String using char[] : " + ReverseString1.reverseMyString3("12345"));
	}

}
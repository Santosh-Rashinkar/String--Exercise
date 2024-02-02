package com.string.program;

public class ReverseString {

//Way :- 1
	public static String reverseMyString1(String input) {

		System.out.println("input string is: " + input);

		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		return new String(sb);
	}
//Way :- 2
	public static String reverseMyString2(String input) {

		System.out.println("input string is: " + input);

		StringBuffer sb = new StringBuffer();

		for (int i = input.length() - 1; i >= 0; i--) {

			sb.append(input.charAt(i));

		}
		return new String(sb);
	}
//Way :- 3
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
		
		System.out.println("Reverse String using StringBuffer : " + ReverseString.reverseMyString1("shree@77"));
		System.out.println("Reverse String using Buffer : " + ReverseString.reverseMyString2("shree"));
		System.out.println("Reverse String using char[] : " + ReverseString.reverseMyString3("12345"));
		
	}
}
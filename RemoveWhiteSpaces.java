package com.string.program;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str = "Hello Java Devlopers";
		String removedSpace = removedWhiteSpaces(str);

		System.out.println("original string :" + str);
		System.out.println("removedSpace:" + removedSpace);
	}

	public static String removedWhiteSpaces(String s) {
		return s.replaceAll(" ", "");

	}

}

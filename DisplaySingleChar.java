package com.string.program;

import java.util.Scanner;

public class DisplaySingleChar {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a single character: ");
		
		char userInput = scan.next().charAt(0);
		
		System.out.println("Enter character:" + userInput);
	
		scan.close();
	}
}
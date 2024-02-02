package com.string.program;

import java.util.Scanner;

public class DisplayMultipleChar {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String Inputstring = scan.nextLine();
		
		System.out.println("Display input String: " + Inputstring);
		
		scan.close();
		
	}

}
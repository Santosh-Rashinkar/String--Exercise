package com.string.program;

public class Test {

	public Test(String string) {

	}

	public static void main(String[] args) {

		String a = "Hello";

		String a1 = new String("Hello");
		System.out.println(a1);

		System.out.println(a == a1);

		System.out.println(a.equals(a1));

		a1 = a1.concat("world");
		System.out.println(a1);
	}
}
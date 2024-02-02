package com.string.program;

public class ReplaceCharacter {

	public static void main(String[] args) {

		String str = "Apple";
		char oldchar = 'p';
		char newchar = '@';
		String replace1 = replacechar1(str, oldchar, newchar);
//		String replaceVeriable = replacechar2(str, oldchar, newchar);

//		System.out.println("Original String: " + str);
//		System.out.println("String AfterReplaceChar: " + replaceVeriable);

		System.out.println("Original String: " + str);
		System.out.println("String AfterReplaceChar: " + replace1);
	}

	public static String replacechar1(String str, char oldchar, char newchar) {
		
		return str.replace(oldchar, newchar);

	}

//	public static String replacechar2(String str, char oldchar, char newchar) {
//
//		StringBuffer sb = new StringBuffer(str);
//
//		for (int i = 0; i < sb.length(); i++) {
//
//			if (sb.charAt(i) == oldchar) {
//
//				sb.setCharAt(i, newchar);
//			}
//
//		}
//		return new String(sb);
//
//	}
}
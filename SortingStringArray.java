package com.string.program;

public class SortingStringArray {

	public static void main(String[] args) {

		String[] str = { "Shree", "santosh", "Ram", "krushna", "Jay" };

		SortingStringArray.sortingArray(str);
	}

	public static void sortingArray(String[] str) {

		int min;
		String temp = "";

		for (int i = 0; i < str.length; i++) {

			min = i;
			for (int j = i + 1; j < str.length; j++) {

				if (str[j].compareTo(str[min]) < 0) {

					min = j;
				}

			}
			temp = str[i];
			str[i] = str[min];
			str[min] = temp;
		}
		for (String i : str) {

			System.out.print((i) + " ");
		}
	}

}
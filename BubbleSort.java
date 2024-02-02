package com.string.program;

public class BubbleSort {

	public static void main(String[] args) {

		String[] nums = {"santosh","sanjay","akshay","Ram","jay"};

		BubbleSort.printBubbleSort(nums);
	}

	public static void printBubbleSort(String[] nums) {

		String temp;

		for (int i = 0; i < nums.length; i++) {

			int flag = 0;

			for (int j = 0; j < nums.length - 1 - i; j++) {

				if (nums[j].compareTo(nums[j+1])>0) {

					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					flag = 1;

				}
			}

			if (flag == 0) {

				break;
			}
		}
		for (int i = 0; i < nums.length; i++) {

			System.out.print(nums[i] + " ");
		}
	}
}

package com.assignments;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 1, 5, 6 };

		System.out.println("Original Array:");
		printArray(array);

		Arrays.sort(array);

		System.out.println("\nSorted Array in Ascending Order:");
		printArray(array);
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}

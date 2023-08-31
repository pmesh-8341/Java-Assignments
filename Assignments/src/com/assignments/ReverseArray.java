package com.assignments;

public class ReverseArray {
	public static void main(String[] args) {
		int[] originalArray = { 1, 2, 3, 4, 5 };

		System.out.println("Original Array:");
		printArray(originalArray);

		int[] reversedArray = reverseArray(originalArray);

		System.out.println("\nReversed Array:");
		printArray(reversedArray);
	}

	public static int[] reverseArray(int[] arr) {
		int length = arr.length;
		int[] reversed = new int[length];

		for (int i = 0; i < length; i++) {
			reversed[i] = arr[length - 1 - i];
		}

		return reversed;
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}

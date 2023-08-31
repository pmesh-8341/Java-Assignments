package com.assignments;

public class Smaller {

	public static void main(String[] args) {
		int[] numbers = { 10, 5, 20, 8, 15 };

		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		System.out.println("The smallest number in the array is: " + smallest);
	}

}

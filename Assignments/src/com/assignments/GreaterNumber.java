package com.assignments;

public class GreaterNumber {

	public static void main(String[] args) {
		int[] numbers = { 10, 5, 20, 8, 15 };

		int greatest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > greatest) {
				greatest = numbers[i];
			}
		}

		System.out.println("The greatest number in the array is: " + greatest);
	}

}


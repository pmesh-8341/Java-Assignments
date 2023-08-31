package com.assignments;

public class LargeSecond {

	public static void main(String[] args) {
		int[] numbers = { 10, 5, 20, 8, 15 };

		int greatest = Integer.MIN_VALUE;
		int secondGreatest = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > greatest) {
				secondGreatest = greatest;
				greatest = numbers[i];
			} else if (numbers[i] > secondGreatest && numbers[i] != greatest) {
				secondGreatest = numbers[i];
			}
		}

		if (secondGreatest == Integer.MIN_VALUE) {
			System.out.println("There is no second greatest number in the array.");
		} else {
			System.out.println("The second greatest number in the array is: " + secondGreatest);
		}
	}

}

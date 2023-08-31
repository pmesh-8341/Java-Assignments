package com.assignments;

public class Sum {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int sum = 0;
		double average = 0.0;

		for (int digit : digits) {
			sum += digit;
		}

		if (digits.length > 0) {
			average = (double) sum / digits.length;
		}

		System.out.println("The sum of all digits is: " + sum);
		System.out.println("The average of all digits is: " + average);
	}
}

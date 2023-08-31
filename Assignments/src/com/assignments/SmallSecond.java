package com.assignments;

public class SmallSecond {

	public static void main(String[] args) {
		int[] numbers = { 10, 5, 20, 8, 15 };

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				secondSmallest = smallest;
				smallest = numbers[i];
			} else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
				secondSmallest = numbers[i];
			}
		}

		if (secondSmallest == Integer.MAX_VALUE) {
			System.out.println("There is no second smallest number in the array.");
		} else {
			System.out.println("The second smallest number in the array is: " + secondSmallest);
		}
	}

}

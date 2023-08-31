package com.assignments.scan;

import java.util.Scanner;

public class ArraySumAndAverage {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int number = scanner.nextInt();

		int[] numbers = new int[number];

		for (int i = 0; i < number; i++) {
			System.out.print("Enter element #" + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}

		double average = (double) sum / number;

		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);

		scanner.close();
	}

}

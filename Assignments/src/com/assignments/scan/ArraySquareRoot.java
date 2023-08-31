package com.assignments.scan;

import java.util.Scanner;

public class ArraySquareRoot {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int number = scanner.nextInt();

		int[] numbers = new int[number];

		for (int i = 0; i < number; i++) {
			System.out.print("Enter element #" + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
		}

		double[] squareRoots = new double[number];

		for (int i = 0; i < number; i++) {
			squareRoots[i] = Math.sqrt(numbers[i]);
		}

		System.out.println("Square Roots:");

		for (int i = 0; i < number; i++) {
			System.out.println("Element #" + (i + 1) + ": " + squareRoots[i]);
		}

		scanner.close();
	}

}

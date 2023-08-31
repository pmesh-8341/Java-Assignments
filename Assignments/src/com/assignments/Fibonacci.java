package com.assignments;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of terms in the Fibonacci series: ");

		int numTerms = scanner.nextInt();
		scanner.close();

		if (numTerms <= 0) {
			System.out.println("Please enter a positive number of terms.");
		} else {
			System.out.println("The Fibonacci series with " + numTerms + " terms is:");
			printFibonacciSeries(numTerms);
		}
	}

	public static void printFibonacciSeries(int numTerms) {
		int firstTerm = 0, secondTerm = 1;

		for (int i = 0; i < numTerms; i++) {
			System.out.print(firstTerm + " ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}

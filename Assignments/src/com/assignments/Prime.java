package com.assignments;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the maximum number to find prime numbers up to: ");

		int maxNumber = scanner.nextInt();
		scanner.close();

		System.out.println("Prime numbers up to " + maxNumber + ":");

		for (int num = 2; num <= maxNumber; num++) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}

package com.assignments;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int number = scanner.nextInt();
		scanner.close();

		if (isArmstrongNumber(number)) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}

	public static boolean isArmstrongNumber(int num) {
		int originalNumber = num;
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, 3);
			num /= 10;
		}

		return sum == originalNumber;
	}
}

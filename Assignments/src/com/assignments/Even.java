package com.assignments;

public class Even {

	public static void main(String[] args) {
		int count = 0;
		int number = 0;

		System.out.println("The first 20 even numbers are:");

		while (count < 20) {
			if (number % 2 == 0) {
				System.out.println(number);
				count++;
			}
			number++;
		}
	}

}


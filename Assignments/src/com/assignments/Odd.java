package com.assignments;

public class Odd {

	public static void main(String[] args) {
		int count = 0;
		int number = 1;

		System.out.println("The first 20 odd numbers are:");

		while (count < 20) {
			System.out.println(number);
			count++;
			number += 2;
		}
	}

}

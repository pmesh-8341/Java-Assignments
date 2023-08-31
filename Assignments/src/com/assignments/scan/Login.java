package com.assignments.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] usernames = new String[] { "user1", "user2", "user3", "user4" };

		System.out.print("Enter username to login: ");
		String inputName = scanner.nextLine();

		boolean isValid = false;

		for (String username : usernames) {
			if (username.equals(inputName)) {
				isValid = true;

			}
		}

		if (isValid) {
			System.out.println("You are logged in successfully.");
		} else {
			System.out.println("Invalid username.");
		}

		scanner.close();
	}

}

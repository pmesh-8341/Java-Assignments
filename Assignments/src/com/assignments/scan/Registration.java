package com.assignments.scan;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {

		
		        Scanner scanner = new Scanner(System.in);

		        String[] usernames = new String[]{"user1", "user2", "user3", "user4"};

		        System.out.print("Enter name to register: ");
		        String inputName = scanner.nextLine();

		        boolean isUnique = true;

		        for (String username : usernames) {
		            if (username.equals(inputName)) {
		                isUnique = false;
		                
		            }
		        }

		        if (isUnique) {
		            System.out.println("You are registered.");
		        } else {
		            System.out.println("Name is not unique.");
		        }

		        scanner.close();
		    }


	}



package com.assignments;
import java.util.Scanner;
public class Perfect {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        
        int number = scanner.nextInt();
        scanner.close();
        
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
    
    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false; 
        }
        
        int sumOfDivisors = 0;
        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        
        return sumOfDivisors == num;
    }

		

	}



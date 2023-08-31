package com.assignments;

public class PatternDiff {

	public static void main(String[] args) {
		int rowCount = 1;
        int currentNumber = 1;
        
        while (rowCount <= 4) {
            int colCount = 1;
            
            while (colCount <= rowCount) {
                System.out.print(currentNumber + " ");
                currentNumber++;
                colCount++;
            }
            
            System.out.println();
            rowCount++;
        }
    }
}
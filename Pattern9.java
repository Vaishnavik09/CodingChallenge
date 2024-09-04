package com.java;

public class Pattern9 {
	    public static void main(String[] args) {
	    	        int rows = 5; // You can change the number of rows here

	    	        for (int i = 1; i <= rows; i++) {
	    	            // Print spaces before the numbers
	    	            for (int j = 1; j <= rows - i; j++) {
	    	                System.out.print(" ");
	    	            }

	    	            // Print the numbers
	    	            for (int j = 1; j <= i; j++) {
	    	                System.out.print(j);
	    	            }

	    	            // Print the numbers in reverse (excluding the first number)
	    	            for (int j = i - 1; j >= 1; j--) {
	    	                System.out.print(j);
	    	            }

	    	            // Move to the next line
	    	            System.out.println();
	    	        }
	    	    }
	    	}
package com.java;

public class Alphabatepyramid {
	    public static void main(String[] args) {
	        int rows = 5; // You can change the number of rows here
	        char ch = 'A';

	        for (int i = 1; i <= rows; i++) {
	            // Print spaces before the letters
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print the letters
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(ch++);
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    }
	}


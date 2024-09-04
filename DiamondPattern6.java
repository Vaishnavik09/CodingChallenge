package com.java;

public class DiamondPattern6 {
	    public static void main(String[] args) {
	        int rows = 5; // You can change the number of rows here

	        // Print the top half of the diamond
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }

	        // Print the bottom half of the diamond (excluding the last row)
	        for (int i = rows - 1; i >= 1; i--) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }

	        // Print the last row
	        for (int j = 1; j <= rows - 1; j++) {
	            System.out.print(" ");
	        }
	        System.out.print(1);
	    }
	}


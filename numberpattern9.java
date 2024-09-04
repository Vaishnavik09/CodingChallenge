package com.java;

public class numberpattern9 {
	    	    public static void main(String[] args) {
	    	        int rows = 9; // You can change the number of rows here

	    	        for (int i = 1; i <= rows; i++) {
	    	            int number = 0;
	    	            for (int j = 1; j <= i; j++) {
	    	                number = number * 10 + j;
	    	            }
	    	            System.out.print(number + " x 8 + " + i + " = ");
	    	            System.out.println(number * 8 + i);
	    	        }
	    	    }
	    	}
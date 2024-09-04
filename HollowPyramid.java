package com.java;

import java.util.Scanner;

public class HollowPyramid {

	public static void main(String[] args) {
		        int rows = 5; // You can change the number of rows here

		        for (int i = 1; i <= rows; i++) {
		            // Print spaces before the stars
		            for (int j = 1; j <= rows - i; j++) {
		                System.out.print(" ");
		            }

		            // Print the first star
		            System.out.print("*");

		            // Print spaces between the stars
		            for (int j = 1; j <= 2 * i - 3; j++) {
		                System.out.print(" ");
		            }

		            // Print the second star
		            if (i > 1) {
		                System.out.print("*");
		            }

		            // Move to the next line
		            System.out.println();
		        }
		    }
		}
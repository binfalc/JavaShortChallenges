package com.codegym.lessons;

public class Solution {

	public static void main(String[] args) {
		//The main method calls the convertEurToUsd method twice with any arguments.
		System.out.println(convertEurToUsd(159, 1805));
        	System.out.println(convertEurToUsd(1300, 1805));
        
	}

	// The method convertEurToUsd takes the eur and exchaangerate values as attributes.
	public static double convertEurToUsd(int eur, double exchangerate ) {
		
		//USD value is calculated as euros * exchange.
		double result = eur * exchangerate;
		
		//Return the result from the method convertEurToUsd
		return result;
	}

}

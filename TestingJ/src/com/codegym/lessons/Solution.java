package com.codegym.lessons;

public class Solution {

	public static void main(String[] args) {
		System.out.println(convertEurToUsd(159, 1805));
        System.out.println(convertEurToUsd(1300, 1805));
        
	}
	
	public static double convertEurToUsd(int eur, double exchangerate ) {
		double result = eur * exchangerate;
		
		return result;
	}

}

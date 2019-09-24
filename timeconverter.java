package com.codegym.lessons;


public class timeconverter {
	
	public static int convertHourToSeconds(int hour) {
		int seconds = hour * 3600;
		
		return seconds;	
	}		
	
		
	public static int convertMinToSeconds(int Min) {
		int seconds = Min * 60;
			
		return seconds;
	}
	
	public static int convertDaysToSeconds(int days) {
		int seconds = days * 86400;
		
		return seconds;	
	}

	
	
	public static void main(String[] args) {
		System.out.println(convertHourToSeconds(9));
		System.out.println(convertMinToSeconds(9));
		System.out.println(convertDaysToSeconds(9));

	}

}

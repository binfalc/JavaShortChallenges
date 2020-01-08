package com.codegym.lessons;


public class timeconverter {
	
	public static int convertHourToSeconds(int hour) {
		int seconds = hour * 3600;
		
		return seconds;	
	}	
	
	public static int convertSecToHours(int Sec) {
		int hours = Sec/3600;
		
		return hours;	
	}	
	
		
	public static int convertMinToSeconds(int Min) {
		int seconds = Min * 60;
			
		return seconds;
	}
	
	public static int convertSecToMinutes(int sec) {
		int minutes = sec/60;
		
		return minutes;
	}
	
	public static int convertDaysToSeconds(int days) {
		int seconds = days * 86400;
		
		return seconds;	
	}
	
	public static int convertSecToDays(int sec) {
		int days = sec/86400;
		
		return days;
	}

	
	
	public static void main(String[] args) {
		System.out.println(convertHourToSeconds(9));
		System.out.println(convertSecToHours(18000));
		System.out.println(convertMinToSeconds(9));
		System.out.println(convertSecToMinutes(18000);
		System.out.println(convertDaysToSeconds(9));
		System.out.println(convertSecToDays(20000000);		   		  

	}

}

package com.prodigyInfotech.sd.one;

import java.util.Scanner;

public class TemparatureConverter {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Temparature in Celsius :");
		double celsius = scan.nextDouble();
		
		double fahrenheit = (celsius * 9/5) + 32;
		double kelvinScale = celsius  + 273.15;
		
		System.out.println("Entered Temparature in Celsius : "+celsius);
		System.out.println("Temparature in Fahrenheit : "+fahrenheit);
		System.out.println("Temparature in Kelvin Scale : "+kelvinScale);
	}
}

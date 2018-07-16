package com.jda.Algorithm.core;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter format that you want :F or C");
		String str = in.nextLine();
		if(str == "F" )
			System.out.println("The temperature in Celcius is " + ftoc(in.nextFloat()));
		else
			System.out.println("The temperature in farenheit is " +  ctof(in.nextFloat()));
	}
	public static float ftoc(float f){
		float c = (f-32)*5/9;
		return c;
	}
	public static float ctof(float c){
		float f = (9*c/5) + 32;
		return f;
	}

}

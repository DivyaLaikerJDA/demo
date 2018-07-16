package com.jda.Algorithm.core;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter P value");
		float P = s.nextFloat(); 
		System.out.println("enter Y value");
		float Y = s.nextFloat(); 
		System.out.println("enter R value");
		float R = s.nextFloat();
		System.out.println("the monthly payment to be made is " + payment(P, Y, R));

	}
	public static float payment(float P, float Y, float R){
		float n = 12*Y;
		float r = R/(12*100);
		float payment = P*r/(1 + (float)Math.pow(1+r, -1*n));
		return payment;
	}

}

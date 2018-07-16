package com.jda.Algorithm.core;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int m = in.nextInt(); int d = in.nextInt(); int y = in.nextInt();
		System.out.println(day(m, d, y));
	}
	
	public static int day(int m, int d, int y){
		int y0 = y - (14 - m)/12;
		int x = y0+y0/4-y0/100+y0/400;
		int m0 = m + 12*((14-m)/12)-2 ;
		int d0 = (d + x + 31*m0/12) % 7;
		return d0;
	}
}

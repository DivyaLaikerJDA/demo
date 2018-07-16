package com.jda.core;

import com.jda.utility.FunctionalUtil;

public class LeapYear {
	public static void main(String args[])
	{
		int year = FunctionalUtil.getFourDigitNumber();
		if((year%400==0) || (year%4==0 && year%100!=0))
				System.out.println("leap year");
		else
			System.out.println("not a leap Year");
		
	}

}

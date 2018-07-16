package com.jda.core;

import java.util.Random;

import com.jda.utility.FunctionalUtil;

public class CouponDunia
{
	public static void main(String args[])
	{
		int numberOfCoup = FunctionalUtil.getIntegerj();
		int coupon[];
		 coupon = new int[numberOfCoup];
		 for(int i=0;i<numberOfCoup;i++)
			 coupon[i]=0;
		
		for(int i=0;i<numberOfCoup;i++)
		{
			Random rand  = new Random();
			
			int num = rand.nextInt(100000);
			
			for(int j=0;j<=i;j++)
			{
				if(coupon[i]==num)
					break;
				else
					coupon[i]=num;
			}
		}
		for(int i=0;i<numberOfCoup;i++)
			System.out.println(coupon[i]);
	}
}

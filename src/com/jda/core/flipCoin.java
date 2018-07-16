package com.jda.core;

import com.jda.utility.FunctionalUtil;

public class flipCoin {
	
	public static void main(String args[])
	{
		
		int headCount=0;
		int tailcount=0;
		
		int noOfFlips;
		noOfFlips = FunctionalUtil.getIntegerj();
		for (int i=0;i<noOfFlips;i++)
		{
			double r = FunctionalUtil.randomNumberGenerator();
			if(r<0.5)
			 headCount++;
			else
				tailcount++;
				
			
		}
		double headper=headCount;
		headper =headper/noOfFlips;
		headper = headper*100;
		
		double tailper = tailcount;
		tailper = tailper/noOfFlips;
		tailper = tailper*100;
		System.out.println("head percentage = "+headper);
		System.out.println("tail percentage = "+tailper);
	}

}

package com.jda.core;

import com.jda.utility.FunctionalUtil;

public class primeFactors {

	public static void main(String args[])
	{
		int N = FunctionalUtil.getIntegerj();
		
		while(N%2==0)
		{
			System.out.println("2");
			N=N/2;
			
		}
		
		for (int i=3;i<Math.sqrt(N);i=i+2)
		{
			while(N%i==0)
			{
				System.out.println(i);
				N=N/i;
			}
		}
	if(N>2)
		System.out.println(N);
	}
}

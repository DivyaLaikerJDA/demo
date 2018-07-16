package com.jda.core;

import com.jda.utility.FunctionalUtil;

public class harmonicMean {

	public static void main(String args[])
	{
		int N = FunctionalUtil.getIntegerj();
		float sum =0;
		for (int i=1;i<=N;i++)
		{
			sum = (sum+((float)1/i));
		}
		System.out.println("sum = "+sum);
	}
}

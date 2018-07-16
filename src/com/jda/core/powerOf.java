package com.jda.core;

import com.jda.utility.FunctionalUtil;

public class powerOf {

	public static void main(String args[])
	{
		int N = FunctionalUtil.getIntegerj();
		System.out.println("table =");
		for (int i=2;i<Math.pow(2, N);i=i*2)
			System.out.println(i);
	}
}

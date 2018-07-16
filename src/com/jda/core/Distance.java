package com.jda.core;

import com.jda.utility.FunctionalUtil;

public class Distance {

	public static void main(String args[]) {
		System.out.println("enter X coordinate");
		int x = FunctionalUtil.getIntegerj();
		System.out.println("enter y coordinate");
		int y = FunctionalUtil.getIntegerj();
		double dis = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		System.out.println(dis);

	}
}

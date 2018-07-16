package com.jda.Algorithm.core;

import java.util.Scanner;

import com.jda.Algorithm.util.Utility;

public class InsertionSortStr {

	public static void main(String[] args)
	{
		System.out.println("enter a string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		long now = System.currentTimeMillis();
		int arr[] = Utility.toInt(str);
		arr = InsertionSort.insertion(arr, str.length());
		String str2 = "";
		for(int i=0; i<str.length(); i++)
			str2 += (char)((int)'A' + arr[i]);
		System.out.println("sorted string is");
		System.out.println(str2);
		System.out.println("The time elasped is " + (System.currentTimeMillis()-now)/1000.0);
	}

}

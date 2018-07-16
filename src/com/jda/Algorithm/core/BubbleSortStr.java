package com.jda.Algorithm.core;

import java.util.Scanner;

import com.jda.Algorithm.util.Utility;

public class BubbleSortStr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string values");
		String str = sc.nextLine();
		long now = System.currentTimeMillis();
		int arr[] = Utility.toInt(str);
		arr = BubbleSort.bubble(arr, str.length());
		String str2 = "";
		for(int i=0; i<str.length(); i++)
			str2 += (char)((int)'A' + arr[i]);
		System.out.println("the sorted string is");
		System.out.println(str2);
		System.out.println("The time elasped is " +  (System.currentTimeMillis()-now)/1000.0);
	}

}

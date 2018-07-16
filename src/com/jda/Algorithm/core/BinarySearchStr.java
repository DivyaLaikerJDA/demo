package com.jda.Algorithm.core;

import java.util.Scanner;

import com.jda.Algorithm.util.Utility;

public class BinarySearchStr {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter string value");
		String str = s.nextLine();
		System.out.println("enter key to be searched");
		char key[] = s.nextLine().toCharArray();
		long now = System.currentTimeMillis();
		int arr[] = Utility.toInt(str);
		int ans = BinarySearch.index(arr, (int)(key[0]-'A'), 0, str.length()-1);
		if(ans != -1)
			System.out.println("key is found at index"+ans+1);
		else 
			System.out.println("Not Found");
		System.out.println("The time elasped is " + (System.currentTimeMillis()-now)/1000.0);
	}

}

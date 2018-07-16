package com.jda.Algorithm.core;

import java.util.Scanner;

public class BinarySearchStrs {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		String[] strs = new String[N];
		for(int i=0; i<N; i++)
			strs[i] = in.nextLine();
		String str = in.nextLine();
		System.out.println(binarySearch(strs, str, 0, N-1)+1);

	}
	public static int binarySearch(String[] strs, String str, int i, int j){
		int min = i;
		int max = j;
		while(min <= max){
			if(strs[(max+min)/2].compareTo(str) == 0)
				return (max+min)/2;
			else if(strs[(max+min)/2].compareTo(str) > 0)
				return binarySearch(strs, str, i, (max+min)/2);
			else
				return binarySearch(strs, str, (max+min)/2+1, j);
		}
		return -1;
	}

}

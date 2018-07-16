package com.jda.Algorithm.core;

import java.util.Scanner;

public class InsertionSortStrs {

	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		System.out.println("enter word length");
		int N = Integer.parseInt(s.nextLine());
		String strs[] = new String[N];
		System.out.println("enter string line");
		for(int i=0; i<N; i++)
			strs[i] = s.next();
		strs = insertionSort(strs, N);
		System.out.println("sorted line");
		for(int i=0; i<N; i++)
			System.out.print(strs[i] + " ");
		System.out.println();

	}
	public static String[] insertionSort(String[] strs, int N){
		for(int i=0; i<N-1; i++){
			for(int j=i; j<N; j++){
				if(strs[i].compareTo(strs[j]) > 0){
					String str = strs[i];
					strs[i] = strs[j];
					strs[j] = str;
				}
			}
		}
		return strs;
	}

}

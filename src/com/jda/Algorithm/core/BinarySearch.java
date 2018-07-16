package com.jda.Algorithm.core;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter array size");
		int N = s.nextInt();
		int arr[] = new int[N];
		System.out.println("enter array elements");
		for(int i=0; i<N; i++)
			arr[i] = s.nextInt();
		System.out.println("enter search key value");
		int key = s.nextInt();
		long now = System.currentTimeMillis();
		int ans = index(arr, key , 0, N-1);
		if(ans != -1)
			System.out.println("index of the searched key"+ans+1);
		else
			System.out.println("Not found");
		System.out.println("The time elasped is " + (System.currentTimeMillis() - now)/1000.0);
	}
	public static int index(int [] arr, int num, int i,int j){
		int min = i;
		int max = j;
		while(min <= max){
			if(arr[(max+min)/2] == num){
				return (max+min)/2;
			}else if(arr[(max+min)/2] > num){
				
				return index(arr, num, i, (max+min)/2);
			}else{
				return index(arr, num, (max+min)/2+1, j);
			}
		}
		return -1;
	}
	
}

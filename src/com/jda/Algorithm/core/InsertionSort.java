package com.jda.Algorithm.core;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter array size");
		int N = s.nextInt();
		int arr[] = new int[N];
		System.out.println("enter array elements");
		for(int i=0; i<N; i++)
			arr[i] = s.nextInt();
		long now = System.currentTimeMillis();
		arr = insertion(arr, N);
		System.out.println("sorted array");
		for(int i=0; i<N; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("The time elasped is " + (System.currentTimeMillis()-now)/1000.0);

	}
	public static int[] insertion(int [] arr, int N){
		for(int i=0; i<N-1; i++){
			for(int j=i+1; j<N; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}

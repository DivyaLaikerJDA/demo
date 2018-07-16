package com.jda.Algorithm.core;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter array size");
		int N = s.nextInt();
		int arr[] = new int[N];
		System.out.println("enter array elements");
		for (int i = 0; i < N; i++)
			arr[i] = s.nextInt();
		long now = System.currentTimeMillis();
		arr = bubble(arr, N);
		System.out.println("array elements after sorting ");
		for (int i = 0; i < N; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("The time elasped is " + (System.currentTimeMillis() - now) / 1000.0);

	}

	public static int[] bubble(int arr[], int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}

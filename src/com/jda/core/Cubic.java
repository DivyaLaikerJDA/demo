package com.jda.core;

import com.jda.utility.FunctionalUtil;

public class Cubic {

	public static void main(String args[]) {
		System.out.print("enter number of integers");
		int N = FunctionalUtil.getIntegerj();

		int arr[] = new int[N];
		System.out.println("enter array elements");
		for (int i = 0; i < N; i++) {
			int num = FunctionalUtil.getIntegerj();
			arr[i] = num;
		}
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					if (arr[i] + arr[j] + arr[k] == 0)
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
				}
			}
		}

	}
}

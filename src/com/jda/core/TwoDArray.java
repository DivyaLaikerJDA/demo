package com.jda.core;

import com.jda.utility.FunctionalUtil;

public class TwoDArray {
	public static void main(String args[]) {
		System.out.println("enter X size");
		int M = FunctionalUtil.getIntegerj();
		System.out.println("enter y size");
		int N = FunctionalUtil.getIntegerj();
		int arr[][] = new int[M][N];

		for (int i = 0; i < M; i++)
			for (int j = 0; j < N; j++) {
				int num = FunctionalUtil.getIntegerj();
				arr[i][j] = num;
			}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}

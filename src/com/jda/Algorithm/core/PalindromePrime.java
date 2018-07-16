package com.jda.Algorithm.core;

import java.util.Scanner;

import com.jda.Algorithm.util.Utility;

public class PalindromePrime {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter integer value");
		int N = s.nextInt();
		int arr[] = PrimeNumbers.primes(N);
		for(int i=2; i<N+1; i++){
			if(arr[i] == 0)
			   if(Utility.isPalind(i) && i>10)
				   System.out.print(i + " ");
		}
		System.out.println();

	}

}

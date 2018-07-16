package com.jda.utility;
 import java.util.Scanner;
import java.util.Random;


public class FunctionalUtil 
 {
	static Scanner scanner = new Scanner(System.in);
	public static String  getStringf()
	{ 
		return scanner.nextLine();
	}
	
	public static int getIntegerj()
	{ int i;
	
	return scanner.nextInt();
	}

	
	public static boolean isPrime(int  N)
	{ boolean flag=false;
		for (int i=2;i<N;i++)
		{
			if(N%i==0)
			{
				flag = false;
				break;
			}
			else
			{
				flag = true;
				
			}
		
		}
	return flag;
	}
	public static double randomNumberGenerator()
	{
		double randNo = Math.random();
		return randNo;
	}
	
	public static int getFourDigitNumber()
	{ int num;
	System.out.println("enter year");
	Scanner S = new Scanner(System.in);
	num = S.nextInt();
	int n = num;
	for(int i=1;i<=4;i++)
	{ if(n==0)
	{
		System.out.println("wrong NUmber entered");
		getFourDigitNumber();
	}
		n =n/10;
	}
	if(n==0)
	{
		return num;
	}
	else{
		System.out.println("wrong NUmber entered");
		getFourDigitNumber();
		return 0;
		
	}
	}

}

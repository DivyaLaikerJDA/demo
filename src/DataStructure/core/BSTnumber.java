package DataStructure.core;

import java.util.Scanner;

public class BSTnumber {
	
	public int catNumber(int N)
	{
		
		 int number = 0;
		
	if(N<=1)
		return 1;
	
	for(int i =0;i<N;i++)
	{
		number = number + (catNumber(i) * catNumber(N-i-1));
	}
	return number;
	
	
	}
	public static void main(String args[])
	{   System.out.println("enter a number");
	int N;
	Scanner scan = new Scanner(System.in);
	N = scan.nextInt();
		BSTnumber bst = new BSTnumber();
		System.out.println(bst.catNumber(N));
	}

}

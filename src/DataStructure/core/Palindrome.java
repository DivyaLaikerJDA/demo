package DataStructure.core;

import java.util.Scanner;

public class Palindrome<T extends Comparable<T>> {

	public static void main(String args[])
	{
		String str;
		Scanner scan = new Scanner(System.in);
		CustomDeque<Character> cd = new CustomDeque<>();
		boolean flag = true;
		System.out.println("enter string that we need to check");
		str = scan.nextLine();
		if(str.trim().isEmpty())
		{
			System.out.println("wrong string");
			return;
		}
		for(int i=0;i<str.length();i++)
			cd.addRear(str.charAt(i));
		
		while(!cd.isEmpty())
		{
			if( (compare(cd.removeRear(),cd.removeFront())!=0) )
			{
				flag = false;
			}
			
				
				
		}
		if(flag == true) {
			System.out.println("it is palindrome");
		}
		else 
		{
			System.out.println("not a palindrome");
		}
			
	}
	public static <T extends Comparable<T>> int compare(T one, T two){
		return one.compareTo(two);
	}
}

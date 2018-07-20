package DataStructure.core;

import java.util.ArrayList;
import java.util.Scanner;

public class Parentheses {
	
	public static void main(String args[])
	{   CustomStack cs = new CustomStack();
		Scanner sc = new Scanner(System.in);
	  String exp;
		System.out.println("enter the expression to check");
		exp = sc.nextLine();
		for(int i=0;i<exp.length();i++)
		{
			if(exp.charAt(i) == '(')
			{
				cs.push(exp.charAt(i));
			}
			else if(exp.charAt(i) == ')')
			{
				cs.pop();
			}
		}
		if(cs.isEmpty())
			System.out.println("stack is balanced");
		else
			System.out.println("stack is not balanced");
	
		
	}

}

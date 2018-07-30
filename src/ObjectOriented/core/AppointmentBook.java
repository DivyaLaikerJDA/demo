package ObjectOriented.core;

import java.util.Scanner;

public class AppointmentBook {
	
	public static void main(String args[])
	{    String doc;
	SearchMethods methods = new SearchMethods();
		Scanner scan = new Scanner(System.in);
		System.out.println("do you wish to take an appointment");
		String ans = scan.nextLine() ;
		if(ans.equals("y"))
		{
			System.out.println("enter the namme of doctor you wish to have appointment with");
			printDocList();
			doc = scan.nextLine();
		}
		
	}

}

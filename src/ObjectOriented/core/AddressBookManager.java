package ObjectOriented.core;

import java.util.Scanner;

public class AddressBookManager {
	
	
	public static void manager()
	{
		Scanner scan = new Scanner(System.in);
	do
	{
		System.out.println("enter what you want to do"+"\n"
				+ "1. create a new addressBook"+"\n"
				+ "2. open and existing address book"+"\n"
				+ "3. save an address book"+"\n"
				+ "4. saveAs"+"\n"
				+ "5. Quit");
		
		int ans;
		System.out.println("enter the answer");
		ans = scan.nextInt();
		switch(ans)
		{
		case 1:
		{ 
			System.out.println("enter new file name");
		String name = scan.next();
			CustomTest cs = new CustomTest(name);
			
			break;
		}
		case 2:
		{
			System.out.println("enter the filename to open");
			String name = scan.next();
			CustomTest cs = new CustomTest(name);
			cs.addressmanager();
			break;
		}
		case 3:
		{
			
		}
		case 4:
		{
			
		}
		case 5:
		{
			System.out.println("thank you for using the address book system");
			System.exit(0);
		}
		}
	}while(true);
	}
}

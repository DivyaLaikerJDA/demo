package ObjectOriented.core;

import java.util.Scanner;

public class CustomTest {
String bookName;

	public CustomTest(String name)
	{
		bookName = name;
	}
	public void addressmanager() {
		// TODO Auto-generated method stub
		
		AddressBook adr = new AddressBook(bookName);
		String c;
		Scanner sc = new Scanner(System.in);
		do{
				System.out.println("enter the procedure you want to implement");
		System.out.println("1. Enter new person to the addressbook");
		System.out.println("2. Delete an already existing person from addressBook");
		System.out.println("3. Edit an already existing person from the addressbook");
		System.out.println("4. Print the addressbook");
		System.out.println("5. Sort the address book");
		int ch;
		ch = sc.nextInt();
		switch (ch) {
		case 1: 
		{     String FirstName;
		String LastName;
		String Address;
		String City;
		String State;
		String PhoneNumber;
		String Zip;
		
		System.out.println("enter new person details");
		System.out.println();
		System.out.println("enter firstname");
		FirstName = sc.next();
		System.out.println("enter last name");
		LastName = sc.next();
		System.out.println("enter address");
		Address = sc.next();
		System.out.println("enter city");
		City = sc.next();
		System.out.println("enter state");
		State = sc.next();
		System.out.println("enter phoneNumber");
		PhoneNumber = sc.next();
		System.out.println("enter zip code");
		Zip = sc.next();


				adr.AddToAddressBook(FirstName, LastName, Address, City, State, PhoneNumber, Zip);
				System.out.println("procedure successful");
				break;
		}
		case 2:
		{ System.out.println("enter the name of the person you want  to delete");
		String name = sc.nextLine();
			adr.DeleteFromAddressBook(name);
		}
		case 3:
		{
			System.out.println("enter the name whose record you wish to edit");
			String name = sc.nextLine();
			System.out.println("which field do you want to edit");
			String field = sc.nextLine();
			System.out.println("enter the new value");
			String newVal = sc.nextLine();
			adr.edit(name,field, newVal);
			break;
		}
		case 5:
		{
			System.out.println("enter the field you want to sort by"
					+ "a) by lastname"
					+ "b) by zipcode");
			String field = sc.next();
			if(field.equals("lastname"))
			adr.Sort(field);
		}
		}
		
		System.out.println("do you wish to cont");
		c = sc.next();
	
		
	
	}while(c.equals("y"));
	sc.close();
	}
	}

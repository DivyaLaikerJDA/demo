package ObjectOriented.core;

import java.util.ArrayList;
import java.util.Comparator;


public class AddressBook {
	
	ArrayList<Person>  addressbook = new ArrayList<>(); 
	String bookName;
	public AddressBook(String name)
	{
		bookName = name;
	}
	public void AddToAddressBook(String f,String l,String a,String c,String s,String p,String z)
	{
		Person per = new Person( f,l, a,c,s, p, z);
		addressbook.add(per);
	}
	
	public void print()
	{
		Person per =null;
		for(int i=0;i<addressbook.size();i++)
		{
			per = addressbook.get(i);
			System.out.print(per.getFirstName()+" ");
			System.out.println(per.getLastName());
			System.out.println(per.getAddress());
			System.out.println(per.getCity());
			System.out.println(per.getState());
			System.out.println(per.getPhoneNumber());
			System.out.println(per.getZip());
			
		}
	}
	
	public void DeleteFromAddressBook(String name)
	{   Person per = null;
		for(int i=0 ; i< addressbook.size();i++)
		{ 
			if(addressbook.get(i).getFirstName().equals(name))
			{
				per = addressbook.get(i);
				addressbook.remove(per);
			}
		}
	}
	
	public void Sort(String sortBy)
	{
		if(sortBy.equals("lastname"))
		{
			addressbook.sort(personSortByLastName);
		}
		else
			if(sortBy.equals("zipCode"))
			{
				addressbook.sort(personSortByZip);
			}
			else
			{
				System.out.println("sorting no allowed");
			}
	}
	public void edit(String name,String fieldname,String newVal)
	{
		Person per =null;
		for(int i = 0 ; i<addressbook.size();i++)
		{
			if(addressbook.get(i).getFirstName().equals(name))
			{
				per = addressbook.get(i);
				if(fieldname.equals("address"))
				{
					per.setAddress(newVal);
					System.out.println(fieldname+"changes successfully");
				}
				else
					if(fieldname.equals("city"))
							{
						per.setCity(newVal);
						System.out.println(fieldname+"changes successfully");
							}
					else
				if(fieldname.equals("state"))
				{
					per.setState(newVal);
					System.out.println(fieldname+"changes successfully");
				}
				else
					if(fieldname.equals("zip"))
						{
						per.setZip(newVal);
						System.out.println(fieldname+"changes successfully");
					}
					else
						if(fieldname.equals("phonenumber"))
						{
							per.setPhoneNumber(newVal);
							System.out.println(fieldname+"changes successfully");
						}
			}
		}
		
	}
	
	
public static Comparator<Person> personSortByLastName = new Comparator<Person>()
{

	@Override
	public int compare(Person person1, Person person2) {
		// TODO Auto-generated method stub
		if(person1.getLastName().equals(person2.getLastName() ))
		return person1.getFirstName().compareTo(person2.getFirstName());
		
		
			return person1.getLastName().compareTo(person2.getLastName());
	}
	};
	public static Comparator<Person> personSortByZip = new Comparator<Person>()
	{

		@Override
		public int compare(Person person1, Person person2) {
			// TODO Auto-generated method stub
	if(person1.getZip().equals(person2.getZip()))
	return person1.getFirstName().compareTo(person2.getFirstName());
	
	return person1.getZip().compareTo(person2.getZip());
		}
		};
}

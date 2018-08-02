package ObjectOriented.core;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ObjectOriented.utility.util;


public class AddressBook {
	private List<Person> allPersons = new ArrayList<>();
	private String AddressBookName;
private AddressBook(){};
	public List<Person> getAllPersons() {
		return allPersons;
	}

	public void setAllPersons(List<Person> allPersons) {
		this.allPersons = allPersons;
	}

	public String getAddressBookName() {
		return AddressBookName;
	}

	public void setAddressBookName(String addressBookName) {
		AddressBookName = addressBookName;
	}

	public AddressBook(String name) {
		this.AddressBookName = name;
	}

	public List<Person> addEntry(List<Person> person) {
		Person entry = new Person();
		System.out.println("enter firstname");
		String firstname = util.getStringcust();
		System.out.println("enter second name");
		String lastname = util.getStringcust();
		entry.setName(firstname + " "+ lastname);
		System.out.print("Enter the address:");
		entry.setAddress(util.getStringcust());
		System.out.print("Enter the city:");
		entry.setCity(util.getStringcust());
		System.out.print("Enter the state:");
		entry.setState(util.getStringcust());
		System.out.print("Enter the zip:");
		entry.setZip(util.getIntcust());
		System.out.print("Enter the phone number:");
		entry.setPhoneNumber(util.getLong());
		person.add(entry);
		return person;
	}

	public List<Person> editInfo(List<Person> allPersons) {
		System.out.println("Enter the name of the user:");
		String name = util.getStringcust();
		for (Person person : allPersons) {
			if (person.getName().equals(name)) {
				System.out.println("Enter 1 to change address, 2 to change phone number:");
				int key = util.getIntcust();
		
				switch (key) {
				case 1: {
					String change;
					System.out.println("Enter the new address:");
					change = util.getStringcust();
				person.setAddress(change);
					
					System.out.println("Enter the new city");
					change = util.getStringcust();
				person.setCity(change);
					
					System.out.println("Enter the new state:");
					change = util.getStringcust();
						person.setState(change);
					
					System.out.println("Enter the new zip number:");
					int zip = util.getIntcust();
						person.setZip(zip);
					
				}
					break;
				case 2: {
					int number;
					System.out.println("Enter the new phone number:");
					number = util.getIntcust();
					
						person.setPhoneNumber(number);
					
				}
				}
			}
		}
		return allPersons;
	}

	public List<Person> deleteEntry(List<Person> allPersons) {
//		System.out.println("Enter the name of the user:");
		System.out.println("enter firstname");
		String first = util.getStringcust();
		System.out.println("enter second name");
		String second = util.getStringcust();
		String name = first+" "+second;
		for (Person x : allPersons) {
			System.out.println(name);
			if (x.getName().equals(name)) {
				allPersons.remove(x);		
			    break;
			}
		}
		return allPersons;
	}

	class NameComparator implements Comparator<Person> {

		@Override
		public int compare(Person arg0, Person arg1) {
			String lastName1 = arg0.getName().split(" ")[1];
			String lastName2 = arg1.getName().split(" ")[1];
			if (lastName1.compareTo(lastName2) < 0) {
				return -1;
			} else if (lastName1.compareTo(lastName2) > 0) {
				return 1;
			} else if (lastName1.equals(lastName2)) {
				String firstName1 = arg0.getName().split(" ")[0];
				String firstName2 = arg1.getName().split(" ")[0];
				if (firstName1.compareTo(firstName2) < 0) {
					return -1;
				} else {
					return 1;
				}
			}
			return 0;
		}
	}

	class ZipComparator implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			if (o1.getZip() < o2.getZip()) {
				return -1;
			} else if (o1.getZip() < o2.getZip()) {
				return 1;
			} else {
				String lastName1 = o1.getName().split(" ")[1];
				String lastName2 = o2.getName().split(" ")[1];
				if (lastName1.compareTo(lastName2) < 0) {
					return -1;
				} else if (lastName1.compareTo(lastName2) > 0) {
					return 1;
				} else if (lastName1.equals(lastName2)) {
					String firstName1 = o1.getName().split(" ")[0];
					String firstName2 = o2.getName().split(" ")[0];
					if (firstName1.compareTo(firstName2) < 0) {
						return -1;
					} else {
						return 1;
					}
				}
				return 0;
			}
		}
	}

	public List<Person> sortByLastName(List<Person> allPersons) {
		Collections.sort(allPersons, new NameComparator());
		return allPersons;
	}

	public List<Person> sortByZip(List<Person> allPersons) {
		Collections.sort(allPersons, new ZipComparator());
		return allPersons;
	}

	public void print() {
		for (Person x : allPersons) {
			System.out.println("Name : " + x.getName());
			System.out.println("Address : " + x.getAddress());
			System.out.println("City : " + x.getCity());
			System.out.println("State : " + x.getState());
			System.out.println("Zip Code : " + x.getZip());
			System.out.println("Phone Number : " + x.getPhoneNumber());
			System.out.print("\n");
		}
	}
}
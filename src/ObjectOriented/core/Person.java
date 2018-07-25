package ObjectOriented.core;

public class Person {

	 private String FirstName = "";
	 private String LastName;
	 private String Address;
	 private String City;
	 private String State;
	 private String PhoneNumber;
	 private String Zip;
	 
	 
	 public Person(String f,String l,String a,String c,String s,String p,String z)
	 {
		 FirstName = f;
		 LastName = l;
		 Address = a;
		 City = c;
		 State = s;
		 PhoneNumber = p;
		 Zip = z;
		 
	 }
	 
	 
	 
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}
	 
	public void print()
	{
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(Address);
		System.out.println(City);
		System.out.println(State);
		System.out.println(PhoneNumber);
		System.out.println(Zip);
	}
}

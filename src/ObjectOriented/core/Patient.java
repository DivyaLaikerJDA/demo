package ObjectOriented.core;

public class Patient {

	private String Name;
	private int ID;
	private long MobileNumber; 
	private int Age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int i) {
		ID = i;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long l) {
		MobileNumber = l;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int i) {
		Age = i;
	}
	
}

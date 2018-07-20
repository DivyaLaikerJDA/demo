package DataStructure.core;

public class DequeTest {
	public static void main(String args[])
	{
		CustomDeque cd = new CustomDeque();
		cd.addFront(1);
		cd.addFront(3);
		cd.addRear(7);
		cd.addRear(9);
		//cd.removeFront();
		//cd.removeRear();
		cd.print();
	}

}

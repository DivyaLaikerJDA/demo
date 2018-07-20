package DataStructure.core;

public class StackTest {

	public static void main(String args[])
	{
		CustomStack<Integer> cs = new CustomStack<>();
		cs.push(5);
		cs.push(6);
		cs.push(2);
		cs.push(9);
		cs.pop();
		System.out.println(cs.peak());
		cs.print();
	}
}

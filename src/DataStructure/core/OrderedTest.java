package DataStructure.core;

public class OrderedTest {

	public static void main(String args[])
	{
		OrderedLinkedList list = new OrderedLinkedList();
		list.add(8);
		list.add(10);
		
	list.add(9);
	list.add(1);
	list.remove(9);
	System.out.println(list.size());
System.out.println(list.index(10));
	System.out.println(list.search(9));
		list.print();
	
	}
}

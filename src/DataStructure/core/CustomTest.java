package DataStructure.core;

import java.util.Scanner;

public class CustomTest {

	public static void main(String args[])
	{
		customLinkedList list = new customLinkedList();
	
	list.append(7);
	list.append(5);
	list.append(4);
	list.append(8);
	list.add(9);
//	list.remove(7);
	list.insert(3, 12);
	//System.out.println(list.search(10));
	//System.out.println(list.size());
	//System.out.println(list.index(12));
	list.print();
	
System.out.println();
	list.pop(3);
	list.print();
	
	}
}

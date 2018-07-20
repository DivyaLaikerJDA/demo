package DataStructure.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import DataStructure.core.OrderedLinkedList.Node;

public class OrderedList {

	public static void main(String args[]) throws IOException
	{
		File file = new File("C:\\Users\\1022779\\Desktop\\sampletest2.txt");
		Scanner sc = new Scanner(file);
		Scanner scan = new Scanner(System.in);
		OrderedLinkedList<String> list = new OrderedLinkedList<>();
	//	FileWriter fw = new FileWriter(file);
		Node nic = list.head;
		while(sc.hasNextLine()){

				String str = sc.nextLine();
				String[]  str1=str.split(" ");
				for(int i=0;i<str1.length;i++)
				{
					list.add(str1[i]);
				}
				System.out.println( );
			}
		String number;
		System.out.println("enter new number");
		number = scan.nextLine();
		list.add(number);
		System.out.println("the new list is");
		list.print();
		
		sc.close();
		scan.close();
	}
}

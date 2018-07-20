package DataStructure.core;
import java.io.File;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class UnorderedList {

	public static void main(String args[]) throws Exception
	{

		File file = new File("C:\\Users\\1022779\\Desktop\\sampletext1.txt");
		Scanner sc = new Scanner(file);
		Scanner scan = new Scanner(System.in);
	
        customLinkedList<String> list = new customLinkedList<>();
		
		while(sc.hasNextLine()){
//		System.out.println(sc.nextLine());
			String str = sc.nextLine();
			String[]  str1=str.split(" ");
			for(int i=0;i<str1.length;i++)
			{
				list.append(str1[i]);
			}
			System.out.println( );
		}
		String SearchString ;
		System.out.println("enter string to be searched");
		SearchString = scan.next();
		
		if(list.search(SearchString))
		{
			list.remove(SearchString);
		}
		else
		{
			list.append(SearchString);
		}
		System.out.println("list ");
		list.print();
		sc.close();
		scan.close();
	}
	
}

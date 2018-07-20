package DataStructure.core;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HashingFunction {
	
	public static void main(String args[]) throws IOException
	{
		int arr[] = new int[11];
		
		File file = new File("C:\\Users\\1022779\\Desktop\\sampletest2.txt");
		Scanner sc = new Scanner(file);
		Scanner scan = new Scanner(System.in);
		String str = "";
		while(sc.hasNextLine()){
//			System.out.println(sc.nextLine());
				 str = sc.nextLine();
		}
		
				String[]  str1=str.split(" ");
				for(int i=0;i<str1.length;i++)
				{
					int mod= Integer.parseInt(str1[i]) % 11;
					customLinkedList<Integer> temp = new customLinkedList<>();
					temp.add(Integer.parseInt(str1[i]));
				arr[mod] = temp;
					arr[mod] =temp.add(Integer.parseInt(str1[i]));
				}
				System.out.println( );
			
	    for(int i=0;i<arr.length;i++)
	    {   System.out.println();
	    customLinkedList<Integer> temp = new customLinkedList<>();
	    temp = arr[i];
	    temp.print();
	    	
	    }
	    sc.close();
		scan.close();
	}

}

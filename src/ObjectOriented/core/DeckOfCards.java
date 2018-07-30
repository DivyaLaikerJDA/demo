package ObjectOriented.core;

import java.util.Comparator;

import DataStructure.core.CustomQueue;
import ObjectOriented.utility.util;

public class DeckOfCards {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String deck[] = {"clubs","hearts","diamonds","spades"};
		String cards[] = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};
		String array[][] = new String[4][9];
		util u = new util();
	
		for(int i=0;i<4;i++)
		{  
			System.out.println("player"+i+": ");
			for(int j = 0; j<9;j++) {
			double n = util.getRandomDoubleBetweenRange(0,3);
			double m = util.getRandomDoubleBetweenRange(0, 12);
			String str = deck[(int) n]+cards[(int) m];
			array[i][j] = str;
		    System.out.print(array[i][j]+ " ");  
		}
System.out.println(" \n");
	}
	
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<9;j++)
			{
				for(int k = j+1;k<9;k++)
			{
				 if (array[i][j].compareTo(array[i][k])>0) 
	                {
	                    String temp = array[i][j];
	                    array[i][j] = array[i][k];
	                    array[i][k] = temp;
	                }
			}
			}
		}
		System.out.println("array ");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<9;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

	
}

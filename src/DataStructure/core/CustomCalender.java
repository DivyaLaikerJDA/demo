package DataStructure.core;

import java.util.Scanner;

public class CustomCalender {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int cal[][] = new int[6][7];

		Scanner in = new Scanner(System.in);
   System.out.println("enter month");
   
		int m = in.nextInt();
				System.out.println("enter year");
		 int y = in.nextInt();
				 int d = 1;

		int y0 = y - (14 - m)/12;

		int x = y0+y0/4-y0/100+y0/400;

		int m0 = m + 12*((14-m)/12)-2 ;

		int d0 = (d + x + 31*m0/12) % 7;

		int count = 1;

		int row = 0, column = d0;

		while(days[m] > 0){

			while(column < 7 && days[m]-- > 0){

				cal[row][column] = count;

				count++;

				column++;

			}

			if(days[m] == 0) break;

			row++;

			column = 0;

		}

		char cd[] = {'S', 'M', 'T', 'W', 'T', 'F', 'S'};

		for(int i=0; i<7; i++)

			System.out.print(cd[i] + " ");

		System.out.println();

		for(int i=0; i<6; i++){

			for(int j=0; j< 7; j++)

				System.out.print(cal[i][j] + "   ");

			System.out.println();

		}
in.close();


	}
}

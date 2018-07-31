package ObjectOriented.core;

import java.io.IOException;

import ObjectOriented.utility.util;


public class StockUI {
	private static String filename;
	public static void main(String[] args) throws IOException {
		int choice;
		StockAccount account = null;
		while (true) {
			System.out.print("\n1. Create/Open account\n");
			System.out.print("2. Get value of stocks\n");
			System.out.print("3. Buy stock\n");
			System.out.print("4. Sell stock\n");
			System.out.print("5. Print\n");
			System.out.print("6. Save\n");
			System.out.print("7. Exit\n");
			System.out.print("Enter choice : ");
			choice = util.getIntcust();
		//	util.getStringcust();
			switch (choice) {
			case 1: {
				System.out.print("\nEnter the account name:");
				filename = util.getStringcust();
				account = new StockAccount(filename);
				break;
			}
			case 2: {
				System.out.println(account.valueOf());
				break;
			}
			case 3: {
				account.printReport();
				System.out.print("\nEnter the company name:");
				String name = util.getStringcust();
				System.out.print("\nEnter the amount:");
				int number = util.getIntcust();
				util.getStringcust();
				account.buy(number, name);
				break;
			}
			case 4: {
				account.printReport();
				System.out.print("\nEnter the company name:");
				String name = util.getStringcust();
				System.out.print("\nEnter the amount:");
				int number = util.getIntcust();
			//	util.getStringcust();
				account.sell (number, name);
				break;
			}
			case 5: {
				account.printReport();
				break;
			}
			case 6:{
				account.save(filename);
				break;
			}
			case 7: {
				return;
			}
			}
		}

	}
}

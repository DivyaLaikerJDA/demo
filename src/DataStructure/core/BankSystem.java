package DataStructure.core;

import java.util.Scanner;

public class BankSystem<T> {

	private static class People {
		private String status;
		private int amt;

		public People() {
			status = "d";
			amt = 0;
		}

		public People(String status, int amt) {
			this.status = status;
			this.amt = amt;
		}
	}

	public static void main(String args[]) {
		CustomQueue<People> cq = new CustomQueue<>();
		Scanner scan = new Scanner(System.in);
		int amt = 10000000;
		int noOfpeople;
		System.out.println("enter number of people in line");
		noOfpeople = scan.nextInt();
		System.out.println("now enter the queue");
		for (int i = 0; i < noOfpeople; i++) {
			People ppl = new People();
			scan.nextLine();
			System.out.println("enter status");
			ppl.status = scan.nextLine();
			System.out.println("enter amt");
			ppl.amt = scan.nextInt();

			cq.enqueue(ppl);

		}

		while (!cq.isEmpty()) {
			People item = cq.dequeue();

			if (item.status.equals("w")) {
				if (amt - item.amt > 0) {
					System.out.println("withdrawn successful");
					amt = amt - item.amt;
				} else {
					System.out.print("cannot be withdrawn");
				}
			} else {
				if (item.status.equals("d")) {
					System.out.println("deposit successful");
					amt = amt + item.amt;
				}
			}
		}

		System.out.println(amt);
		scan.close();
	}
}

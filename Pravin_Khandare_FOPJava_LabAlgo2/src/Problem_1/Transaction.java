package Problem_1;

import java.util.Scanner;

public class Transaction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size = sc.nextInt();

		int[] transactionArray = new int[size];
		System.out.println("enter the values of the array");
		for (int i = 0; i < size; i++) {
			transactionArray[i] = sc.nextInt();
		}
		System.out.println("enter the total no. of targets to be achieved");
		int count = sc.nextInt();
		// changing the transactionArray to
		for (int i = 0; i < size; i++) {
			if (i == 0)
				continue;
			transactionArray[i] = transactionArray[i - 1] + transactionArray[i];
		}

		while (count != 0) {
			System.out.println("enter the value of the target");
			int target = sc.nextInt();
			boolean notAchieved = false;
			for (int i = 0; i < size; i++) {
				if (target < transactionArray[i]) {
					System.out.println("the target is achieved after " + (i + 1) + " transactions");
					break;
				}
				notAchieved = true;
				if (notAchieved) {
					System.out.println("the given target is not achieved");
				}
			}
			count--;
		}
		sc.close();
	}
}

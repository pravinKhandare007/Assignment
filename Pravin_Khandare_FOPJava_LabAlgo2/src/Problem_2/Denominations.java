package Problem_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Denominations {
	public static void main(String[] args) {
		// to store denominations array
		int[] denoArr;

		Scanner sc = new Scanner(System.in);
		// try catch block to manage if user enters wrong data type for any input that
		// is being asked
		try {
			System.out.println("enter the size Denominations");

			int size = sc.nextInt();

			denoArr = new int[size];

			System.out.println("enter the denomination value");

			for (int i = 0; i < size; i++) {
				denoArr[i] = sc.nextInt();
			}

			System.out.println("enter the amount you want to pay");

			int pay = sc.nextInt();
			System.out.println("Your payment approach in order to give min no of notes will be");
			int left = 0;
			int right = denoArr.length - 1;

			MergeSort sort = new MergeSort();
			sort.mergeSort(denoArr, left, right);

			while (pay != 0) {
				if (pay < denoArr[size - 1]) {
					System.out.println("cannot pay further");
					break;
				}
				int maxDeno = 0;// to store the max denomination we are going to use for minimum no. of notes
				for (int i = 0; i < denoArr.length; i++) {

					if (pay >= denoArr[i]) {
						maxDeno = denoArr[i];
						break;
					}
				}
				// below in pay/opDeno ,opDeno will never be zero
				try {
					System.out.println(maxDeno + " : " + pay / maxDeno);
					pay = pay % maxDeno;
				} catch (ArithmeticException ex) {
					System.out.println("check if you have entered 0 as a denomination");
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("enter only interger values, run the program again");
		}
		sc.close();
	}
}

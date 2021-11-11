package arrays;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numArray = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter number " + (i + 1) +": ");
			numArray[i] = scanner.nextInt();
		}

		System.out.println();
		System.out.println("print array");
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + "\t");
		}

	}

}

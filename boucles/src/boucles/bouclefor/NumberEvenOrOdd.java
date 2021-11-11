package boucles.bouclefor;

import java.util.Scanner;

public class NumberEvenOrOdd {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your numbrer: ");
		int entryNumber = scanner.nextInt();

		while (entryNumber != 0) {
			if (entryNumber % 2 == 0) {
				System.out.println("the number is Even " + entryNumber);
			}

			if (entryNumber % 2 != 0) {
				System.out.println("the number is odd " + entryNumber);
			}

			System.out.println("Enter your numbrer: ");
			entryNumber = scanner.nextInt();

		}
		
		System.out.println("end");

	}

}

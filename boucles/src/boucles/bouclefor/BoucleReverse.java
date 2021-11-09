package boucles.bouclefor;

import java.util.Scanner;

public class BoucleReverse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your number");
		int entryNumber = scanner.nextInt();

		for (int i = entryNumber; i > 0; i--) {
			System.out.print(i + "\t");
		}

		scanner.close();

	}

}

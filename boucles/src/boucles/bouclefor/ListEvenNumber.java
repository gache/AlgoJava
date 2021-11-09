package boucles.bouclefor;

import java.util.Scanner;

public class ListEvenNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your numbrer: ");
		int entryNumber = scanner.nextInt();

		for (int i = 1; i <= entryNumber; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
		scanner.close();
	}

}

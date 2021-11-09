package boucles.boucleWhile;

import java.util.Scanner;

public class ListEvenNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your numbrer: ");
		int entryNumber = scanner.nextInt();
		int i = 1;
		while (i <= entryNumber) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
			i++;
		}
		scanner.close();
	}

}

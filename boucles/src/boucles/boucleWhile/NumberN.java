package boucles.boucleWhile;

import java.util.Scanner;

public class NumberN {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your number: ");
		int entryNumber = scanner.nextInt();
		int i = 1;
		while (i <= entryNumber) {
			System.out.println(i);
			i++;
		}
		
		scanner.close();

	}

}

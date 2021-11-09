package boucles.bouclefor;

import java.util.Scanner;

public class NumberAddition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your numbrer: ");
		int entryNumber = scanner.nextInt();
		int resultat = 0;
		for (int i = 1; i < entryNumber; i++) {
			resultat += i;
		}
		System.out.println(resultat);
		
		scanner.close();

	}

}

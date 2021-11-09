package boucles.boucleWhile;

import java.util.Scanner;

public class NumberNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your number: ");
		int entryNumber = scanner.nextInt();
		int squareNumber = 0;

		while (entryNumber >= 0) {
			squareNumber= (entryNumber * entryNumber);
			System.out.println( "the square number is: "+squareNumber);
			System.out.print("Enter other number: ");
			entryNumber = scanner.nextInt();
			
		}
		
		scanner.close();

	}

}

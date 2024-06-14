package Day.wise.assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int number = scanner.nextInt();

		scanner.close();

		long factorial = 1;
		int i = number;

		do {
			if (number < 0) {
				factorial = -1;
				break;
			}
			if (number == 0) {
				factorial = 1;
				break;
			}
			factorial *= i;
			i--;
		} while (i > 0);

		if (factorial == -1) {
			System.out.println("Factorial of a negative number is undefined.");
		} else {
			System.out.println("The factorial of " + number + " is: " + factorial);
		}
	}
}

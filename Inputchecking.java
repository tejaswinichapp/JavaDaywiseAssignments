package Day.wise.assignments;

import java.util.Scanner;

public class Inputchecking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		if (num > 0) {
			System.out.println("THe number is positive");
		} else if (num < 0) {
			System.out.println("The number is negative");
		} else {
			System.out.println("The number is 0");
		}
	}
}

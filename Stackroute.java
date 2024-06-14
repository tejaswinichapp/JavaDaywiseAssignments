package Day.wise.assignments;

import java.util.Scanner;

public class Stackroute {

	public static void main(String[] args) {// main method
		Scanner scanner = new Scanner(System.in);// taking input from the user

		System.out.print("Enter the company name: ");// printing the company name
		String company = scanner.nextLine();

		System.out.print("Enter the location: ");// print location
		String location = scanner.nextLine();

		scanner.close();// closing scanner classs

		if ("ABC".equalsIgnoreCase(company)) {
			System.out.println("ABC Technologies " + location);
		} else {
			System.out.println(company + " " + location);
		}
	}
}

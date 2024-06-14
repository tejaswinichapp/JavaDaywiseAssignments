package Day.wise.assignments;

import java.lang.Thread;

public class Farewelldaydemo {
	public static void main(String[] args) {
		String greeting = args[0];
		char chars[] = greeting.toCharArray();
		if (args.length != 0) {
			for (char ch : chars) {
				try {
					// calling static method
					
					System.out.println(Thread.currentThread().getName());
					
						
					
					Thread.currentThread().sleep(5000);

				} catch (InterruptedException ie) {
					System.out.println("Sleeping..");
				}

				System.out.println(ch);
			}
		}
	}
}

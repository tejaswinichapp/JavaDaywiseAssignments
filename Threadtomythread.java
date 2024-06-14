package Day.wise.assignments;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Threadtomythread {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Assign the current thread to t1
		Thread t1 = Thread.currentThread();

		System.out.print("Enter new thread name: ");// enter the thread name
		String threadName = scanner.nextLine();

		t1.setName(threadName);// changing thread name

		System.out.println("Thread name: " + t1.getName());// display changing thread name

		// Display the current time
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current time: " + dtf.format(now));

		try {
			// thread to sleep for 10 seconds
			System.out.println("Thread is going to sleep for 10 seconds...");
			Thread.sleep(10000); // Sleep for 10,000 milliseconds (10 seconds)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Display the time again after waking up thread
		LocalDateTime wakeUpTime = LocalDateTime.now();
		System.out.println("Time after waking up: " + dtf.format(wakeUpTime));

		scanner.close();
	}

}

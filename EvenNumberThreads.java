package Day.wise.assignments;

public class EvenNumberThreads extends Thread {
	public void run() {
		try {
			for (int i = 2; i <= 10; i += 2) {
				System.out.println("Even: "+i);
				Thread.sleep(1000); // Delay of 1 second
			}
		} catch (InterruptedException e) {
			System.out.println("EvenNumberThread interrupted.");
		}
	}
}

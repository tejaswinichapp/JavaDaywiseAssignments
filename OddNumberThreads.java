package Day.wise.assignments;

public class OddNumberThreads extends Thread {
	public void run() {
		try {
			 for (int i = 1; i <= 9; i += 2) {
				System.out.println( "Odd: "+i);
				Thread.sleep(1000); // 1 second
			}
		} catch (InterruptedException e) {
			System.out.println("OddNumberThread interrupted.");
		}
	}
}

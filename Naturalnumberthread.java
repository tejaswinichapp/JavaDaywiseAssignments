package Day.wise.assignments;

public class Naturalnumberthread {
	class NaturalNumberThread extends Thread {
		public void run() {
			for (int i = 2; i <= 10; i++) {
				System.out.println("Natural: "+i);
				try {
					Thread.sleep(1000); // 1 second
				} catch (InterruptedException e) {
					System.out.println("NaturalnumberThread interrupted.");
				}
			}
		}
	}
}

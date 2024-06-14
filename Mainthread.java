package Day.wise.assignments;
import java.util.*;
public class Mainthread {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	            System.out.println("\nMenu:");
	            System.out.println("1. Display Even Numbers");
	            System.out.println("2. Display Odd Numbers");
	            System.out.println("3. Display Natural Numbers");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    EvenNumberThread evenThread = new EvenNumberThread();
	                    evenThread.start();
	                    break;
	                case 2:
	                    OddNumberThread oddThread = new OddNumberThread();
	                    oddThread.start();
	                    break;
	                case 3:
	                    NaturalNumberThread naturalThread = new NaturalNumberThread();
	                    naturalThread.start();
	                    break;
	                case 4:
	                    System.out.println("Exit...");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	    }
	





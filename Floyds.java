package Day.wise.assignments;

public class Floyds {
	    public static void main(String[] args) {
	        int n = 5; 
	        int i = 1;
	        int number = 1;

	        while (i <= n) {
	            int j = 1;
	            while (j <= i) {
	                System.out.print("* ");
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
	    }
	}



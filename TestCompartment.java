package Day.wise.assignments;


	import java.util.Random;

	// Abstract class Compartment
	abstract class Compartment {
	    // Abstract method notice
	    abstract void notice();
	}

	// FirstClass compartment
	class FirstClass extends Compartment {
	    @Override
	    void notice() {
	        System.out.println("Notice: This is a First Class compartment.");
	    }
	}

	// Ladies compartment
	class Ladies extends Compartment {
	    @Override
	    void notice() {
	        System.out.println("Notice: This is a Ladies compartment.");
	    }
	}

	// General compartment
	class General extends Compartment {
	    @Override
	    void notice() {
	        System.out.println("Notice: This is a General compartment.");
	    }
	}

	// Luggage compartment
	class Luggage extends Compartment {
	    @Override
	    void notice() {
	        System.out.println("Notice: This is a Luggage compartment.");
	    }
	}

	// main method
	public class TestCompartment {
	    public static void main(String[] args) {
	        // Declaring an array of Compartment of size 10
	        Compartment[] compartments = new Compartment[10];
	        Random rand = new Random();

	        
	        for (int i = 0; i < compartments.length; i++) {
	            int randomNum = rand.nextInt(4) + 1;
	            switch (randomNum) {//using switch case
	                case 1:
	                    compartments[i] = new FirstClass();
	                    break;
	                case 2:
	                    compartments[i] = new Ladies();
	                    break;
	                case 3:
	                    compartments[i] = new General();
	                    break;
	                case 4:
	                    compartments[i] = new Luggage();
	                    break;
	            }
	        }

	        
	        for (Compartment compartment : compartments) {
	            compartment.notice();
	        }
	    }
	}



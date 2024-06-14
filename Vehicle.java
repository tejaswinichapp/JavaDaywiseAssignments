package Day.wise.assignments;

public class Vehicle {

		// Attributes
	    private String regno;
	    private String brand;
	    private double price;
	    private double mileage;

	    // Constructor to initialize the vehicles
	    public Vehicle(String regno, String brand, double price, double mileage) {
	        this.regno = regno;
	        this.brand = brand;
	        this.price = price;
	        this.mileage = mileage;
	    }

	    // Method to display the details of the vehicles
	    public void display() {
	        System.out.println("Regno: " + regno);
	        System.out.println("Brand: " + brand);
	        System.out.println("Price: " + price);
	        System.out.println("Mileage: " + mileage);
	        System.out.println();
	    }

	    // Method to return the price of the vehicle
	    public double getPrice() {
	        return price;
	    }

	    // Method to return the mileage of the vehicle
	    public double getMileage() {
	        return mileage;
	    }

	
	  

}


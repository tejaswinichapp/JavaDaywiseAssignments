package Day.wise.assignments;

public class Bookmianclass {
	public static void main(String[] args) {
        
        Magazine magazine = new Magazine("1234-5678", "Tech Today", 5.99, "Technology");
       
        Novel novel = new Novel("8765-4321", "Mystery Nights", 15.99, "John Doe");

     
        System.out.println("Magazine Details:");
        magazine.displayDetails();
        System.out.println();

        // Display details of Novel
        System.out.println("Novel Details:");
        novel.displayDetails();
    }
}


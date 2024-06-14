package Day.wise.assignments;

public class AccoumtManagement {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// Create account objects
	        Account account1 = new Account(1000.0);
	        Account account2 = new Account(500.0);

	        // Test functionalities
	        System.out.println("Account 1 initial balance: " + account1.getBalance());
	        System.out.println("Account 2 initial balance: " + account2.getBalance());

	        account1.deposit(200.0);
	        account1.withdraw(150.0);
	        System.out.println("Account 1 balance after transactions: " + account1.getBalance());

	        account2.deposit(300.0);
	        account2.withdraw(1000.0); // This should show an error for insufficient funds
	        System.out.println("Account 2 balance after transactions: " + account2.getBalance());

		}

	}



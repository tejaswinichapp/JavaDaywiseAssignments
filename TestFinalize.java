package Day.wise.assignments;


	class A1 {
	    @Override
	    protected void finalize() throws Throwable {
	        super.finalize();
	        System.out.println("Finalize method called");
	    }
	}

	public class TestFinalize {
	    public static void main(String[] args) {
	        // Creating objects using the same reference
	        A1 a = new A1();
	        a = new A1();
	        a = new A1();

	        // Requesting garbage collection
	        Runtime.getRuntime().gc();

	        // Adding a delay to give the garbage collector time to run
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}



package Day.wise.assignments;

public class NumberMatrix {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			int row = 3;
			int column=4;
		    int Array1[][]=new int[row][column];
		    int num=1;	    
		    for(int i=0;i<row;i++) {
		    	for(int j=0;j<column;j++) {
		    	Array1[i][j]=num++;	
		    		
		    	}
		    }
		    for (int i = 0; i < row; i++) {
	            for (int j = 0; j< column; j++) {
	                System.out.print(Array1[i][j] + "\t");
	            }
	            System.out.println();
	        }
		    
		}

	}


	

	 class Student {
		private int StudentId;
		private String Name;
		private String contactNo;
		private String course;
		private double fees;
		
		

		
	public Student(int StudentId, String Name, String contactNo, String course, double fees) {
			super();
			this.StudentId = StudentId;
			this.Name = Name;
			this.contactNo = contactNo;
			this.course = course;
			this.fees = fees;
		}

	public void display(){
		System.out.println("StudentId :"+StudentId);
		System.out.println("Name: " + Name);
	    System.out.println("ContactNo: " + contactNo);
	    System.out.println("Course: " + course);
	    System.out.println("Fees: " + fees);
	    //System.out.println();
	}


	public double getFees() {
	    return fees;
	}

	public String getCourse() {
	    return course;
	}


		

	}



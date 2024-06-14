package Day.wise.assignments;
import java.util.Scanner;
public class Accountholder {
	 private String acNo;
	    private String name;
	    private String contactNo;

	    public void AccountHolder(String acNo, String name, String contactNo) {
	        this.acNo = acNo;
	        this.name = name;
	        this.contactNo = contactNo;
	    }

		public String getAcNo() {
			return acNo;
		}

		public void setAcNo(String acNo) {
			this.acNo = acNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContactNo() {
			return contactNo;
		}

		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
		}

		@Override
		public String toString() {
			return "Accountholder [acNo=" + acNo + ", name=" + name + ", contactNo=" + contactNo + "]";
		}
		
}
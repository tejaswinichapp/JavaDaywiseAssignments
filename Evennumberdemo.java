package Day.wise.assignments;

public class Evennumberdemo {
	static int age=10;
	static {
		System.out.println(age);
	}
	
public static void main(String [] args) {
		generateEven();
}
public static void generateEven() {
	
	for(int i=2;i<=10;i=i+=2) {
		System.out.println(i);
	}
}
}
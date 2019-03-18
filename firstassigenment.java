import java.util.Scanner;

public class firstassigenment {

	public static void main(String[] args) {
		double a, b, res;
		       Scanner X = new Scanner(System.in);
		   
	       System.out.print("Please Enter Two Numbers : ");
	       a = X.nextDouble();
	       b = X.nextDouble();
	   
		   
	       res = a + b;
	       System.out.println("Submission  = " +res);
		   
	       res = a - b;
	       System.out.println("Subtraction = " +res);
		   
	       res = a * b;
	       System.out.println("Multiplication = " +res);
		   
	       res = a / b;
	       System.out.println("Division = " +res);

	}

}

package automation_course;
import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		temp object = new temp();
		System.out.println("enter your first number : ");
		double x = input.nextDouble();
		System.out.println("enter your second number : ");
		double y = input.nextDouble();
		System.out.println("enter the operator : ");
		char command = input.next().charAt(0);
		object.caculation(x,y,command);
	}
			

}

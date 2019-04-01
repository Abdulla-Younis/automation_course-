package automation_course;

import java.util.Scanner;

public class answer_Q4 {

	public static void main(String[] args) {
		int a; int b; int c;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the first number ");
		 a = x.nextInt();
			System.out.println("enter the second number ");
		 b = x.nextInt();
			System.out.println("enter the third number ");
		c = x.nextInt();
		if(a>b & a>c) {
			System.out.println("the largest number is "+ a);
		}
		else if (b>c) {
			System.out.println("the largest number is "+b);
			
		}	
		else {
			System.out.println("the laregest number is "+c);
		}
	}

}

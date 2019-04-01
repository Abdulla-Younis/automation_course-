package automation_course;

import java.util.Random;
import java.util.Scanner;

public class answer_Q5 {
	 static int x;
	 static int y;
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		 System.out.println("enter the number of tosses");
		 int x = z.nextInt();
		
		for (int i =0; i<x; i++) {
			Random rand = new Random();
			y = rand.nextInt(2);
			 //y = (int) (Math.random()*1+0);
			if(y==0) {
				System.out.println("head");
			}
			else {
				System.out.println("tail");
			}
		}
		
		
    }
}

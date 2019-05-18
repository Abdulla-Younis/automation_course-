package assi7_exc2;
import java.util.*;
import java.util.Scanner;
public class emails {

	public static void main(String[] args) {
		int i=0; int emailNumber;
		
		List<String> emailList = new ArrayList<String>();

		Scanner z = new Scanner(System.in);

		
		System.out.println(" What is the number of emails ");
		emailNumber = z.nextInt();
		
		System.out.println("Please enter "+ emailNumber + " emails:");

		
		while(i<=emailNumber) {
			emailList.add(z.nextLine());
			i++;
		}
		
		checkEmailValidation(emailList);
			
	}
	
	public static void checkEmailValidation(Collection<String> emailList) {
		
		List<String> validemail = new ArrayList<String>(); 
		List<String> inValidemail = new ArrayList<String>(); 
		
		for(String x:emailList) {
			if((x.contains("@")) && (x.endsWith(".com")) 
					&& (x.indexOf('@') != 0) && (x.indexOf(".com") != 0 ) 
					&& (x.indexOf('@') == x.lastIndexOf("@")) 
					&& (x.indexOf(".com") == x.lastIndexOf(".com")) 
					&& (x.indexOf(".com") > x.indexOf("@")) 
					&& (x.indexOf(".com") != (x.indexOf("@")+1)) 
					&& x.indexOf('.', (x.indexOf('@')-1)) != x.indexOf('@')-1 && x.indexOf('.', x.indexOf('@')) != x.indexOf('@')+1
					&& (x.indexOf('.', x.indexOf(".com")-1) != x.indexOf(".com")-1)) {
				validemail.add(x);
			}
			else {
				inValidemail.add(x);
			}
		}
		printValidEmail(validemail);
		
		printInvalidEmail(inValidemail);
	
	}
	
	public static void printValidEmail(List<String> list1) {
		
			System.out.println("The Valid Emails are:");
			for (int i=0; i<list1.size();i++) {
				System.out.println(list1.get(i));
			}
	}
	
		public static void printInvalidEmail(List<String> list2) {
		
			System.out.println("\nThe Invalid Emails are:");
			for (int i=0; i<list2.size();i++) {
				System.out.println(list2.get(i));
			}
		
	}


	}



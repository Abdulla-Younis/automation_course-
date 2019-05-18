package assi7_exc1;

import java.util.Scanner;

public class zipcode {

	public static void main(String[] args) {
		System.out.println(" enter the formate ");
		Scanner x = new Scanner(System.in);
		String zipCode = x.nextLine();
		
		checkzipCode(zipCode);
		
	}
	
	public static void checkzipCode (String s) {
		char ch;
		String str = s;
				if(s.length() == 5) {
			
			if(s.matches("^[0-9]*$")) { 
				System.out.println(" Valid formate zip Code ");
			}
			else {
				for(int i=0;i<s.length();i++) {
					ch = s.charAt(i);
					
					if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
						str = str.replace(ch,'5');
					}
					
					else if(ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+' || ch == '=' || ch == '_' || ch == '/' || ch == '<' || ch == '>' || ch == '?' ) {
						str = str.replace(ch,'1');
					}
			}
				System.out.println(" Invalid formate zip Code ");
				System.out.println("Did you Mean " + str + "!?");
			}
		}else { 
			if(s.contains(" ")) {
				System.out.println(" Invalid formate zip Code ");
				System.out.println("Do you Mean " + s.replace(" ", "") + "?");
			}else { 
				System.out.println("Invalid formate zip Code");	
			}
		}	
			
	}



	}



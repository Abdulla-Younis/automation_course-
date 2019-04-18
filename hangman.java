package automation_course;

import java.util.Scanner;

public class hangman {
	public static void main( String[] args )
	{
		String[] word_list = { "automation", "performance", "security", "innovation", "creativity"};
		String rand_word;
		char[] hidden_word;
		Scanner input = new Scanner(System.in);
		String user_guess;
		int miss_chance = 0;
		char[] missed = new char[9];
		boolean letter_found = false, solved = false;
				
		rand_word = word_list[ (int)(Math.random() * word_list.length) ];
		hidden_word = new char[rand_word.length()];
		for ( int i = 0; i < rand_word.length(); i++ )
		{
			hidden_word[i] = '_';
		}		
				
		while (miss_chance < 8 && ! solved)
		{
			System.out.println( "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" );
			System.out.println( "You have " + (8 - miss_chance) + " try left." );
			System.out.print( "Word:\t" );
			for ( int i = 0; i < rand_word.length(); i++ ) {
				System.out.print( hidden_word[i] + " " );
			}
			System.out.print("\nMisses: ");
			for ( int i = 0; i < missed.length; i++ ) {
				System.out.print( missed[i] );
			}
			
			System.out.print( "\nGuess: " );
			user_guess = input.next();
			letter_found = false;
			
			for ( int i = 0; i < rand_word.length(); i++ ) {
				if ( user_guess.charAt(0) == rand_word.charAt(i) ) {
					hidden_word[i] = rand_word.charAt(i);
					letter_found = true;
				}
			}
			if (!letter_found) {
				miss_chance++;
				missed[miss_chance] = user_guess.charAt(0);	
			}
			
			int hidden_count = 0;
			for ( int i = 0; i < rand_word.length(); i++ ) {
				if ( '_' == hidden_word[i] )
					hidden_count++;
			}
			if (hidden_count > 0) 
				solved = false;
			else
				solved = true;
		}

		System.out.println( "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" );
		System.out.println( "You have " + (8 - miss_chance) + " try left." );
		System.out.print( "Word:\t" );
		for ( int i = 0; i < rand_word.length(); i++ ) {
			System.out.print( hidden_word[i] + " " );
		}
		System.out.print("\nMisses: ");
		for ( int i = 0; i < missed.length; i++ ) {
			System.out.print( " ");
		}
	
	
		if (solved) 
			System.out.println( "You Got it!" );
		
		else 
			System.out.println( " you lost!!");	
		
	}
	
}

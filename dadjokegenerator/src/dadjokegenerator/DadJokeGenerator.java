package dadjokegenerator;

import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class DadJokeGenerator {

	public static void main(String[] args) {
		//display dad jokes from an array of 20
		
		//display the count of dad jokes to the user
		//display at least four dad jokes to the user
		//use Math.random() to randomly select jokes to display
		//ask the user if they want to see more dad jokes
		
		//initialize a string arraylist of size 20
		ArrayList<String> dadJokes = new ArrayList<String>();
		
		//set the dad jokes in the arraylist
		dadJokes.add("What do you call it when a group of apes starts a company? Monkey business.");
		dadJokes.add("Which bear is the most condescending? A pan-duh!");
		dadJokes.add("What kind of noise does a witch’s vehicle make? Brrrroooom, brrroooom.");
		dadJokes.add("What’s brown and sticky? A stick.");
		dadJokes.add("Two guys walked into a bar. The third guy ducked.");
		dadJokes.add("How do you get a country girl’s attention? A tractor.");	
		dadJokes.add("Why are elevator jokes so classic and good? They work on many levels.");
		dadJokes.add("What do you call a pudgy psychic? A four-chin teller.");
		dadJokes.add("What did the police officer say to his belly-button? You’re under a vest.");
		dadJokes.add("My wife asked me to stop singing “Wonderwall” to her. I said maybe...");
		dadJokes.add("What kind of drink can be bitter and sweet? Reali-tea.");
		dadJokes.add("What do you call a naughty lamb dressed up like a skeleton for Halloween? Baaad to the bone.");
		dadJokes.add("Want to know why nurses like red crayons? Sometimes they have to draw blood.");
		dadJokes.add("What would the Terminator be called in his retirement? The Exterminator.");
		dadJokes.add("What did Tennessee? The same thing as Arkansas.");
		dadJokes.add("My wife asked me to go get 6 cans of Sprite from the grocery store. I realized when I got home that I had picked 7 up.");
		dadJokes.add("Why do bees have sticky hair? Because they use a honeycomb.");
		dadJokes.add("Why do some couples go to the gym? Because they want their relationship to work out.");
		dadJokes.add("What do you call an angry musician flipping someone off? A song bird.");
		dadJokes.add("What’s the most detail-oriented ocean? The Pacific.");
		
		//initialize the scanner
		Scanner scanner = new Scanner(System.in);
		
		//declare the answer
		String answer;
		
		//welcome the user
		System.out.println("******---------------");
		System.out.println("******---------------");
		System.out.println("Welcome to Dad Jokes!");
		System.out.println("---------------------");
		System.out.println("---------------------");
		
		//do while loop for y or yes
		do
		{ 
			//define a numeric variable to hold the count of dad jokes
			int count = dadJokes.size();
			
			//display the # of dad jokes remaining to the user
			System.out.println("           -----------           ");
			System.out.println("<There are " + count + " Dad Jokes remaining>");
			System.out.println("           -----------           ");
			
			//if no more dad jokes, apologize, 'splain, and end
			if(count == 0)
			{
				System.out.println("Sorry, we are fresh out of Dad Jokes!");
				break;
			}
			
			//randomly generate 4 dad jokes, display them, and remove them from the arraylist
			int random = 0;
			
			for(int i = 0; i < 4; i++)
			{
				random = (int)((Math.random()*(dadJokes.size() - 1)));
			    System.out.println(i + 1 + ": " + dadJokes.get(random));
				dadJokes.remove(random);
		    }
			
			//ask user if they want some more Dad Jokes
			System.out.println("Enter y for more dad jokes, or n to exit!");
			answer = scanner.next();
			
			//ask again in case they typo
			while(!(answer.equalsIgnoreCase("y")) && !(answer.equalsIgnoreCase("yes")) && !(answer.equalsIgnoreCase("n")) && !(answer.equalsIgnoreCase("no")))
			{
				System.out.println("Sorry, I didn't catch that! Enter y for more dad jokes, or n to exit!");
			    answer = scanner.next();
			}
			
			
		} while(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Yes"));
			
		//say goodbye to the user
		System.out.println("See you later, alligator!");
		
		//close the scanner
		scanner.close();
		
	}

}

/**
 * 
 * @author ChrisMCodes
 * Java Web Development
 * 9/1/2022
 * Week 1a
 *
 */

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userGuess = -1;
		int randomNumber = new Random().nextInt(10) + 1;
		int numGuesses = 0;
		int minGuess = 0;
		int maxGuess = 10;
		
		System.out.println("Let's play a game!");
		
		
		while (userGuess != randomNumber) {
			System.out.printf("Guess a number between %d and %d: ", minGuess, maxGuess);
			
			// catching bad input
			try {
				userGuess = sc.nextInt();
				numGuesses++;
			} catch (Exception e) {
				// clearing buffer, alerting user in case of invalid input
				sc.next();
				System.out.println("Invalid input. Let's try again...");
				continue;
			}
			
			// checking results
			if (userGuess == randomNumber) {
				System.out.println("Great guess! You won in " + numGuesses + " guesses!");
			} else if (userGuess < randomNumber) {
				System.out.println("Your guess is a little too low. Keep trying!");
				minGuess = userGuess >= minGuess ? userGuess+1:minGuess;
			} else if (userGuess > randomNumber) {
				System.out.println("Your guess is a little too high. Keep trying!");
				maxGuess = userGuess <= maxGuess ? userGuess-1:maxGuess;
			} else {
				System.out.println("Let's try again...");
			}
		}
		
		System.out.println("\nGood game! See you next time!");
		sc.close();

	}

}

/*
 * Create a class Game, allows a user to play "Guess the number" game once.
 * Game should have the following methods:
 * 1. Constructor to generate a random numbers
 * 2. takeUserInput() to take a user input of number
 * 3. isCorrectNumber() to detect whether the number entered by the user is true
 * 4. getter and setter for noOfGuesses
 * Use properties such as noOfGuesses(int), etc. to get this task done.
 */

import java.util.Random;
import java.util.Scanner;

class Game {

    int number;
    int userInput;
    int noOfGuesses = 0;

    Game() {
        Random r = new Random();
        this.number = r.nextInt(100);
    }

    public void takeUserInput() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Guess a number between 0 and 100: ");
            userInput = sc.nextInt();
        }
    }
    
    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (userInput == number) {
            System.out.printf(
                    "Yes! you have guessed it right, the number is %d and you have guessed it in %d attempts.", number,
                    noOfGuesses);
                    return true;
        } else if (userInput < number) {
            System.out.println("Your guessed number is too low, guess some higher number!");
        } else if (userInput > number) {
            System.out.println("Your guessed number is too high, guess some lower number!");
        }
        return false;
    }

}

public class CWH_43_Ex3 {
    public static void main(String[] args) {
        Game myGame= new Game();
        boolean b= false;
        while(!b){
        myGame.takeUserInput();
        b = myGame.isCorrectNumber();
        }
    }
}

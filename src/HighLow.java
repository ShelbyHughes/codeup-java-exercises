import java.util.Random;
import java.util.Scanner;

public class HighLow {
    int randomNumber;
    int numGuesses;
    int maxGuesses;
    Scanner input;
    public static void main(String args[]) {

    }
    public HighLow(Scanner userInput) {
        this.randomNumber = new Random().nextInt(99) + 1;
        this.numGuesses = 0;
        this.maxGuesses = Integer.MAX_VALUE;
        this.input = userInput;
    }
    public HighLow(Scanner userInput, int maxGuesses) {
        this.maxGuesses = maxGuesses;
        this.numGuesses = 0;
        this.randomNumber = new Random().nextInt(99) + 1;
        this.input = userInput;
    }

    public void PlayGame() {
        System.out.println("Welcome to the guessing game");
        while (this.numGuesses < this.maxGuesses)
        {
            System.out.println(String.format("You have {0} guesses left.", maxGuesses - numGuesses));
            System.out.println(Guess());
        }
    }

    public String Guess(){
        this.numGuesses ++;
        System.out.println("Enter your guess:");
        String input = this.input.nextLine();
        int guess = Integer.parseInt(input);

        if(guess == this.randomNumber) {
            return "Good guess!";
        }
        else if (guess > randomNumber) {
            return "LOWER";
        }
        else
        {
            return "HIGHER";
        }
    }
}

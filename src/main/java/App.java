import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import models.Word;

public class App {
    public static void main(String[] args) {
        boolean exit = true;

        while (exit) {
            try{
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Welcome to the Scrabble scorer.");
                System.out.println("Please enter the word you wish to score (Enter 'Exit' if you wish to quit.): ");
                String userInput = bufferedReader.readLine();

                if (userInput.equals("Exit")) {
                    exit = false;
                } else {
                    Word wordScorer = new Word();
                    Integer score = wordScorer.calculateScore(userInput);
                    System.out.println("Your score was: " + score);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

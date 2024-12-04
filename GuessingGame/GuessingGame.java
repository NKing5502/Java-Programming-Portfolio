// Nick King
// Class: CS 145
//Lab1: Guessing Game


import java.util.Scanner;

public class GuessingGame {
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        introduceGame();

        int totalGames = 0;
        int totalGuesses = 0;
        int bestGame = Integer.MAX_VALUE;

        while (true) {
            int guesses = playGame(scanner);
            totalGames++;
            totalGuesses += guesses;
            if (guesses < bestGame) {
                bestGame = guesses;
            }
            System.out.print("Do you want to play again? ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.startsWith("y")) {
                break;
            }
        }

        reportResults(totalGames, totalGuesses, bestGame);
    }

    private static void introduceGame() {
        System.out.println("This program allows you to play a guessing game.");
        System.out.println("I will think of a number between 1 and " + MAX_NUMBER +
                " and will allow you to guess until you get it.");
        System.out.println("For each guess, I will tell you whether the right answer is higher or lower than your guess.\n");
        System.out.println("I'm thinking of a number between 1 and " + MAX_NUMBER + "...");
    }

    private static int playGame(Scanner scanner) {
        int answer = (int) (Math.random() * MAX_NUMBER) + 1;
        int guesses = 0;

        while (true) {
            System.out.print("Your guess? ");
            int guess = scanner.nextInt();
            guesses++;

            if (guess == answer) {
                if (guesses == 1) {
                    System.out.println("You got it right in 1 guess");
                } else {
                    System.out.println("You got it right in " + guesses + " guesses");
                }
                break;
            } else if (guess < answer) {
                System.out.println("It's higher.");
            } else {
                System.out.println("It's lower.");
            }
        }
        return guesses;
    }

    private static void reportResults(int totalGames, int totalGuesses, int bestGame) {
        double avgGuesses = (double) totalGuesses / totalGames;

        System.out.println("\nOverall results:");
        System.out.println("\ttotal games = " + totalGames);
        System.out.println("\ttotal guesses = " + totalGuesses);
        System.out.printf("\tguesses/game = %.1f\n", avgGuesses);
        System.out.println("\tbest game = " + bestGame);
    }
}


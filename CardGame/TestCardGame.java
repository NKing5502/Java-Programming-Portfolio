package cardgame;

import java.util.Scanner;

public class TestCardGame {
    public static void main(String[] args) {
        CardManager manager = new CardManager();
        Scanner scanner = new Scanner(System.in);

        // Shuffles the deck before starting the game
        manager.shuffle();
        System.out.println("Welcome to the card game!");
        boolean gameOver = false;

        try {
            while (!gameOver) {
                System.out.println("Press 1 to deal a card, or 0 to quit:");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    Card dealtCard = manager.dealCard();
                    System.out.println("You were dealt: " + dealtCard);
                    System.out.println("Cards left in the deck: " + manager.cardsLeft());
                } else if (choice == 0) {
                    gameOver = true;
                    System.out.println("Thanks for playing!");
                } else {
                    System.out.println("Invalid choice. Please choose 1 or 0.");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

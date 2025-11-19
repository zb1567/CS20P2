package Mastery;
import java.util.Random;
import java.util.Scanner;

public class Nim2 {

    static class NimGame {
        private int stones;
        private Random rand = new Random();

        public NimGame() {
            stones = rand.nextInt(16) + 15;  // random 15–30
        }

        public int getStones() {
            return stones;
        }

        public boolean playerMove(int take) {
            if (take < 1 || take > 3 || take > stones) {
                return false; // illegal move
            }
            stones -= take;
            return true;
        }

        public int computerMove() {
            int take = rand.nextInt(3) + 1;

            // Keep reducing until legal
            while (take > stones) {
                take = rand.nextInt(3) + 1;
            }

            stones -= take;
            return take;
        }

        public boolean gameOver() {
            return stones == 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NimGame game = new NimGame();

        System.out.println("Welcome to the Game of Nim!");
        System.out.println("The player forced to take the last stone LOSES.");
        System.out.println("--------------------------------------------");
        System.out.println("Starting stones: " + game.getStones());

        while (!game.gameOver()) {

            // PLAYER TURN
            System.out.print("\nYour turn! How many stones will you take (1-3)? ");
            int take = input.nextInt();

            while (!game.playerMove(take)) {
                System.out.print("Invalid move. Enter 1, 2, or 3 (and not more than remaining stones): ");
                take = input.nextInt();
            }

            System.out.println("You took: " + take);
            System.out.println("Stones remaining: " + game.getStones());

            if (game.gameOver()) {
                System.out.println("\nYou took the last stone — You LOSE!");
                break;
            }

            // COMPUTER TURN
            int compTake = game.computerMove();
            System.out.println("\nComputer takes: " + compTake);
            System.out.println("Stones remaining: " + game.getStones());

            if (game.gameOver()) {
                System.out.println("\nComputer took the last stone — Computer LOSES! You WIN!");
                break;
            }
        }
    }
}

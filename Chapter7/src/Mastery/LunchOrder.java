package Mastery;
import java.util.Scanner;

public class LunchOrder {

    // Food class inside same file
    static class Food {
        private double price;
        private int fat;
        private int carbs;
        private int fiber;

        public Food(double price, int fat, int carbs, int fiber) {
            this.price = price;
            this.fat = fat;
            this.carbs = carbs;
            this.fiber = fiber;
        }

        public double getPrice() {
            return price;
        }

        public int getFat() {
            return fat;
        }

        public int getCarbs() {
            return carbs;
        }

        public int getFiber() {
            return fiber;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create Food objects using chart values
        Food hamburger = new Food(1.85, 9, 33, 1);
        Food salad = new Food(2.00, 1, 11, 5);
        Food fries = new Food(1.30, 11, 36, 4);
        Food soda = new Food(0.95, 0, 38, 0);

        // Ask user for order quantities
        System.out.print("How many hamburgers? ");
        int hQty = input.nextInt();

        System.out.print("How many salads? ");
        int sQty = input.nextInt();

        System.out.print("How many french fries? ");
        int fQty = input.nextInt();

        System.out.print("How many sodas? ");
        int dQty = input.nextInt();

        // Calculate total cost
        double total = (hQty * hamburger.getPrice()) +
                       (sQty * salad.getPrice()) +
                       (fQty * fries.getPrice()) +
                       (dQty * soda.getPrice());

        // Display result
        System.out.println("\nTotal Price: $" + String.format("%.2f", total));
    }
} 

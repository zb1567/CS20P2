package mastery;

import java.util.Scanner;

public class EggPricing {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of eggs
        System.out.print("Enter the number of eggs you want to purchase: ");
        int eggs = scanner.nextInt();

        // Convert to dozens and leftover eggs
        int dozens = eggs / 12;
        int extraEggs = eggs % 12;

        // Determine price per dozen based on tiers
        double pricePerDozen;

        if (dozens < 4) {
            pricePerDozen = 0.50;
        } else if (dozens < 6) {
            pricePerDozen = 0.45;
        } else if (dozens < 11) {
            pricePerDozen = 0.40;
        } else {
            pricePerDozen = 0.35;
        }

        // Extra eggs cost = 1/12 of dozen price per egg
        double pricePerEgg = pricePerDozen / 12;

        // Calculate total cost
        double totalCost = (dozens * pricePerDozen) + (extraEggs * pricePerEgg);

        // Output
        System.out.printf("You ordered %d eggs.\n", eggs);
        System.out.printf("That's %d dozen and %d extra eggs.\n", dozens, extraEggs);
        System.out.printf("Price per dozen: $%.2f\n", pricePerDozen);
        System.out.printf("Price per egg (extra): $%.2f\n", pricePerEgg);
        System.out.printf("Total cost: $%.2f\n", totalCost);

        scanner.close();
	  }
	}



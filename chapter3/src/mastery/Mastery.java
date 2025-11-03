package mastery;

import java.util.Scanner;

public class Mastery {

	 public static void piza(String[] args) {
	        // Constants
	        final double LABOR_COST = 0.75;
	        final double RENT_COST = 1.00;
	        final double MATERIAL_COST_PER_INCH = 0.05;

	        // Input
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter diameter of the pizza in inches: ");
	        int diameter = input.nextInt();

	        // Calculation
	        double materialCost = MATERIAL_COST_PER_INCH * diameter * diameter;
	        double totalCost = LABOR_COST + RENT_COST + materialCost;

	        // Output
	        System.out.printf("The cost of making the pizza is: $%.2f%n", totalCost);
	        
	        input.close();
	    }
	}

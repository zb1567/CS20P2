package mastery;

import java.util.Scanner;

public class height {
	public static void main(String[] args) {
        // Constants
        final double START_HEIGHT = 100.0;
        final double GRAVITY_FACTOR = 4.9;

        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a time less than 4.5 seconds: ");
        double t = input.nextDouble();

        // Validation
        if (t >= 4.5 || t < 0) {
            System.out.println("Error: Time must be between 0 and less than 4.5 seconds.");
        } else {
            // Calculation using h = 100 - 4.9 * t^2
            double height = START_HEIGHT - GRAVITY_FACTOR * (t * t);

            // Output
            System.out.printf("The height of the object is: %.2f meters%n", height);
        }

        input.close();
    }

}

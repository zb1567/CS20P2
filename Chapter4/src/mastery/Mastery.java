package mastery;
import java.util.Scanner;

public class Mastery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        final double MAX_WEIGHT = 27.0; // kilograms
        final double MAX_VOLUME = 100000.0; // cubic centimeters

        // Input
        System.out.print("Enter the weight of the package (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter the length of the package (cm): ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the package (cm): ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the package (cm): ");
        double height = scanner.nextDouble();

        // Calculate volume
        double volume = length * width * height;

        // Check conditions
        boolean tooHeavy = weight > MAX_WEIGHT;
        boolean tooLarge = volume > MAX_VOLUME;

        // Output
        if (tooHeavy && tooLarge) {
            System.out.println("Package is too heavy and too large.");
        } else if (tooHeavy) {
            System.out.println("Package is too heavy.");
        } else if (tooLarge) {
            System.out.println("Package is too large.");
        } else {
            System.out.println("Package meets the requirements.");
        }

        scanner.close();
    }
}

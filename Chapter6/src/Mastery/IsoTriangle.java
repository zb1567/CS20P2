package Mastery; import java.util.Scanner;

public class IsoTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for the size of the triangle
        System.out.print("Enter the size of the isosceles triangle: ");
        int size = input.nextInt();

        // Draw the triangle
        for (int line = 1; line <= size; line++) {
            addSpaces(size - line);        // print leading spaces
            drawBar(2 * line - 1);         // print the stars for this line
            System.out.println();          // move to next line
        }

        input.close();
    }

    // Method to print a certain number of spaces
    public static void addSpaces(int numSpaces) {
        for (int i = 0; i < numSpaces; i++) {
            System.out.print(" ");
        }
    }

    // Method to print a certain number of asterisks (*)
    public static void drawBar(int numStars) {
        for (int i = 0; i < numStars; i++) {
            System.out.print("*");
        }
    }
}

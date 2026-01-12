package Masteryexcerise; 
import java.util.Random;

public class RandomStats
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] counts = new int[10];  // stores how many times each number 0–9 appears

        // Generate 500 random numbers between 0 and 9
        for (int i = 0; i < 500; i++)
        {
            int num = rand.nextInt(10); // random number 0–9
            counts[num]++;              // count the occurrence
        }

        // Display results
        System.out.println("Number\tOccurrences");
        for (int i = 0; i < counts.length; i++)
        {
            System.out.println(i + "\t" + counts[i]);
        }
    }
}


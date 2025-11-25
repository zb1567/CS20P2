package Masteryexcerise; 
public class GeneratedNums
{
    public static void main(String[] args)
    {
        int[] numbers = new int[101];

        // Fill the array
        for (int i = 0; i < numbers.length; i++)
        {
            int digit1 = i / 10;   // tens place
            int digit2 = i % 10;   // ones place
            numbers[i] = i + digit1 + digit2;
        }

        // Display array contents
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}

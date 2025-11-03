package skillbuilders;


import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{
		 // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        
        
     // Get digits from user
        System.out.print("Enter two digit number: ");
        int number = input.nextInt();
        
        int tens, ones;
        
        tens = number / 10;
        ones = number % 10;
        
        System.out.println("Tens = "+ tens);
        
        System.out.print("Ones = "+ ones);
        

	}

}

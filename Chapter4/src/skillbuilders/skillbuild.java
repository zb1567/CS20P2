package skillbuilders;

import java.util.Scanner;

public class skillbuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numVisitors = 0;
int totalVisitors= 0;
int avgVisitors = 0;
		
		Scanner input = new Scanner(System.in);
		for(int day = 1; day <=5; day ++)
		{
			System.out.println(
		                   "Enter the number "
			+ " of visitors on day "
		                   + day + " : "
		                   );
		                   numVisitors = input.nextInt();
		                   totalVisitors = totalVisitors + numVisitors;
	}//end of for loop
	avgVisitors = (totalVisitors / 5);
	System.out.println("the average number of"
	                    + " visitors is : "
	                    + avgVisitors );
	
		
	}

}

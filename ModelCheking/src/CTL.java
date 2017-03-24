import java.util.*;

public class CTL
{
/*	public static void main(String[] args)
	{
		CTL();
	}
*/
	
	
	// The funktion that dosomething with the input!
	public void CTL() 
	{
		Scanner console = new Scanner(System.in);
		
		
		int test = 1;
		
		while(test != 0)
		{
			System.out.println("--------------------");
			System.out.println("Select a command! click 28 for end the this!!!)");
			
			int input = 0;
			int randomTest = 25;
			
			do {
				System.out.print("Please chose a pos number below 10");

				// I disapprove of negative coins or nonexistent coin
				int Check = console.nextInt();
				if (Check > 0 && Check <= 10) {
					randomTest = randomTest - Check;
				}
				
				//close the system
				if(Check == 28)
				{
					test = 0;
					System.out.print("good bye and have a nice day.");
					return;
				}

			} while (randomTest >= 1);


			if (randomTest != 0) {
				System.out.println("Thank you. the code is working.");
			} else {
				System.out.println("Thank you.");
			}

		}
		// Shut down
		console.close();

	}
}

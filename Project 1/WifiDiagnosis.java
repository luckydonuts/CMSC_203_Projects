/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Guide to fixing your WiFi issues.
 * Due: 09/05/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/

import java.util.Scanner;
public class WifiDiagnosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work. \n");
		System.out.println("Start");
		System.out.println("Reboot the computer and try to connect");
		System.out.println("Did that fix the problem (yes or no)?");
		String response = sc.nextLine();
	
		if (response.equalsIgnoreCase("yes"))
		{
			System.out.println("\nDone");
			System.out.println("Programger: Michael Bushman");
			System.exit(0);
			
		}
		
		else if (response.equalsIgnoreCase("no"))
		{
			System.out.println("\nReboot the router and try to connect");
			System.out.println("Did that fix the problem (yes or no)?");
			response = sc.nextLine();
			
			if (response.equalsIgnoreCase("yes"))
			{
				System.out.println("\nDone");
				System.out.println("Programger: Michael Bushman");
				System.exit(0);
			}
			
			else if (response.equalsIgnoreCase("no"))
			{
				System.out.println("\nMake sure the cables connecting the router are firmly plugged in and power is getting to the router");
				System.out.println("Did that fix the problem (yes or no)?");
				response = sc.nextLine();
				
				if (response.equalsIgnoreCase("yes"))
				{
					System.out.println("\nDone");
					System.out.println("Programger: Michael Bushman");
					System.exit(0);
				}
				
				else if (response.equalsIgnoreCase("no"))
				{
					System.out.println("\nMove the computer closer to the router and try to connect");
					System.out.println("Did that fix the problem (yes or no)?");
					response = sc.nextLine();
					
					if (response.equalsIgnoreCase("yes"))
					{
						System.out.println("\nDone");
						System.out.println("Programger: Michael Bushman");
						System.exit(0);
					}
					
					else if (response.equalsIgnoreCase("no"))
					{
						System.out.println("\nContact your ISP");
						System.out.println("Done");
						System.out.println("Programger: Michael Bushman");
						System.exit(0);
					}
					
					else 
					{
						System.out.println("Invalid answer, try again");
					}
				}
				
				else 
				{
					System.out.println("Invalid answer, try again");
				}
			}
			
			else 
			{
				System.out.println("Invalid answer, try again");
			}
		}
		
		else 
		{
			System.out.println("Invalid answer, try again");
		}
	}

}

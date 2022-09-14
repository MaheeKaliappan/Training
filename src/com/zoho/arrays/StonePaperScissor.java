package com.zoho.arrays;

import java.util.Random;
import java.util.Scanner;

public class StonePaperScissor {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Stone Paper Scissor");
		
		
		String chiceValues[] = {"STONE",
								"PAPER",
								"SCISSOR"};
		int playingChoice = 0;
		do {
			System.out.println("Enter Your Choice");
			String userChoice = reader.next();
			Random computerChoice = new Random();
			int choice = computerChoice.nextInt(3);
			
			System.out.println("Computer Choice : "+chiceValues[choice]);
			System.out.println("User Choice     : "+userChoice);
			
			if(userChoice.equalsIgnoreCase(chiceValues[choice]))
			{
				System.out.println("Result is TIE");
			}
			else if(userChoice.equalsIgnoreCase("Stone"))
			{
				if(chiceValues[choice].equalsIgnoreCase("SCISSOR"))
				{
					System.out.println("User Win");
				}
				else
				{
					System.out.println("Computer Win");
				}
				
			}
			else if(userChoice.equalsIgnoreCase("Scissor"))
			{
				if(chiceValues[choice].equalsIgnoreCase("Paper"))
				{
					System.out.println("User Win");
				}
				else
				{
					System.out.println("Computer Win");
				}
			}
			else if(userChoice.equalsIgnoreCase("Paper"))
			{
				if(chiceValues[choice].equalsIgnoreCase("Stone"))
				{
					System.out.println("User Win");
				}
				else
				{
					System.out.println("Computer Win");
				}
			}
			else
			{
				System.out.println("Invalid input");
			}
			System.out.println("Do You Want Play Again???Press 1");
			playingChoice = reader.nextInt();
			
		}while(playingChoice == 1);
		System.out.println("Thank yu");
		
		
		

	}

}

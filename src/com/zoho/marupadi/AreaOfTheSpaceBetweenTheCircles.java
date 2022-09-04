package com.zoho.marupadi;


import java.util.Scanner;

public class AreaOfTheSpaceBetweenTheCircles
{
	public static void main (String args[])
	{
		//17Program 

		/*17) Given the radius of two concentric circle, find the area of the space between the
		circles.
		*/

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the areaOfOuterCircle : ");
		int areaOfOuterCircle = reader.nextInt();
		System.out.println("Enter the areaOfInnerCircle : ");
		int areaOfInnerCircle = reader.nextInt();
		
		// Declare value of pi
		double pi = 3.14;
	 
		// Calculate area of outer circle
		double outerCircle = pi * areaOfOuterCircle * areaOfOuterCircle;
	 
		// Calculate area of inner circle
		double innerCircle = pi * areaOfInnerCircle * areaOfInnerCircle;
	 
		// Difference in areas
		double differeneceBetweenTwoAreas =  outerCircle - innerCircle;
			
		System.out.println ("differeneceBetweenTwoAreas :"+differeneceBetweenTwoAreas);
	}
}

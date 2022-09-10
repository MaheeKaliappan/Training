package com.zoho.arrays;

import java.util.Scanner;

public class FindFGrandChildren {

	public static void main(String[] args) {
		String childAndFather [][] = {
										{"luke","shaw"},
										{"wayne","rooney"},
										{"rooney","ronaldo"},
										{"shaw","rooney"}
									};
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the grandFatherName");
		String findGradFatherName = reader.next();
		String sonName = "";
		int count=0;
		
		for(int i = 0;i<childAndFather.length;i++)
		{
			if(childAndFather[i][1].equals(findGradFatherName))
			{
				sonName = childAndFather[i][0];
				System.out.println(sonName);
				break;
			}
		}
		for(int i = 0;i<childAndFather.length;i++)
		{
			if(childAndFather[i][1].equals(sonName))
			{
				count++;
			}
		}
		
		
		System.out.println(count);

	}

}

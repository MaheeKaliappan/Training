package com.zoho.marupadi;



public class FindTheValue
{
	public static void main(String args[])
	{
		/* 18) Evaluate the following expression on paper and on program and understand the
		difference
		i) ++a-b–                   ii) a%b++     iii)  a*=b+5               iv) x=69>>>2 */
		
		int a = 5;
		int b =10;
		int resultOne = ++a - b--;
		
		int c = 5;
		int d =10;
		int resultTwo = c%d++;
		
		int e = 5;
		int f =10;
		int resultThree = e*=f+5;
		
		
		int resultFour = 69>>>3;



		System.out.println("resultOne  : "+resultOne);
		System.out.println("resultTwo  : "+resultTwo);
		System.out.println("resultThree: "+resultThree);
		System.out.println("resultFour : "+resultFour);

	}
}

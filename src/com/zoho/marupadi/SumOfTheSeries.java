package com.zoho.marupadi;
import java.util.Scanner;

class Series {
	
	public int findSumOfTheSeries(int value)
	{
		
		int series =0;
		
		int seriesValue = 0;
		for(int index = 1;index <= value;index++)
		{
			
			series = (series*10+1);
			System.out.print(series +" + ");
			seriesValue += series;
		}
		return seriesValue;
	}
}
public class SumOfTheSeries 
{
	public static void main(String[] args) 
	{
		//60th Program

		/* 60) Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
		1111 +.. n terms.*/
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print ("Enter the Value : ");
		
		int value = reader.nextInt();
		
		
		Series series = new Series();
		
		
		int seriesValue = series.findSumOfTheSeries(value);
		
		
		System.out.println("The Sum Is : "+seriesValue);
	}

}

package com.zoho.marupadi;


import java.util.Scanner;

public class PolynomialEquation
{
  
  static int horner(int poly[], int n, int x)
  {
     
      int result = poly[0]; 

     
      for (int i=1; i<n; i++)
		{
          result = result*x + poly[i];
		}

      return result;
  }
   
 
  public static void main (String args[])
  {
	  
	//16Program

	//16) Write a program to evaluate the polynomial equation


	  
      // Let us evaluate value of 2x3 - 6x2 + 2x - 1 for x = 3
      int[] poly = {2, -6, 2, -1};
      int x = 3;
      int n = poly.length;
      System.out.println("Value of polynomial is "
                                      + horner(poly,n,x));
  }
}


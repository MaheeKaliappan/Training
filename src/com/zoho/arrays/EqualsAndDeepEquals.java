package com.zoho.arrays;

import java.util.Arrays;

public class EqualsAndDeepEquals {

	public static void main(String[] args) {
		
		 int intArr[] = { 10, 20, 15, 22, 35 };
		  
	        
	        System.out.println("array: "+ Arrays.toString(intArr));
	        int copyArray[] =  intArr.clone();
	        // To compare both arrays using equals
	        System.out.println("1D Array on comparison: "
	                           + Arrays.equals(intArr, copyArray));
	        
	        int firstArray[][] = {{10,20,30},{10, 20, 30} };
	        
	        // second Arrays
	        int secondArray[][] = {{10,20,30},{10,20,30}};
	  
	        // To compare both arrays using deepEquals
	        System.out.println("2D Array on comparison: "
	                           + Arrays.deepEquals(firstArray, secondArray));
	        
	        
		
	}

}

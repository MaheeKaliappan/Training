package com.zoho.marupadi;

import java.math.BigInteger;

public class SquareSeries {

	public static void main(String[] args) {
		BigInteger quareValue = new BigInteger("64");
		
		int value  = 2;
		
		for(int limit = 1;limit<=64;limit++)
		{
			quareValue = quareValue.multiply(BigInteger.valueOf(value));
		}
		System.out.println(quareValue);
	}

}
//1180591620717411303424
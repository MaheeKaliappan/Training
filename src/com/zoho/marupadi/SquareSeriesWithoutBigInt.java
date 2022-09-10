package com.zoho.marupadi;

import java.math.BigInteger;

public class SquareSeriesWithoutBigInt {

	public static void main(String[] args) {
		
				String quareValue =null;
				BigInteger bigInteger = new BigInteger("55");
				for(int limit = 1;limit<=64;limit++)
				{
					quareValue = String.valueOf(bigInteger.multiply(BigInteger.valueOf(2)));
					System.out.println(quareValue);
				}
				System.out.println(quareValue);
			}

		}
// 1180591620717411303424



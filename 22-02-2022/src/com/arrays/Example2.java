package com.arrays;

public class Example2
{

	public static void main(String[] args)
	{
		
	
		int studentRollNumbers[] = {23, 12, 24, 56, 45, 89, 29};
		
		/**
		 * Array: an array derived defined data type, used to store multiple values of
		 * =====  same data types. 
		 * 
		 * 1. array concept works based on indexes.
		 * 
		 * 2. in array index starts from 0(zero) and ends with length-1 or size-1
		 *   
		 * for example,
		 * 
		 * studentRollNumbers[] = {23, 12, 24, 56, 45, 89, 29};
		 *   					    0   1   2   3   4   5   6
		 */
		
		//System.out.println(studentRollNumbers[6]);
		
		for(int i = 0; i < studentRollNumbers.length; i++)
		{
			System.out.println(studentRollNumbers[i]);
		}
		
	}

}

package com.TypesOfArray;

public class Example3
{

	public static void main(String[] args)
	{
		//multidimensional array
		
		//multidimensional array in one line(array declaration and initialization)
		
		int matrix[][] = {{28, 34}, {30, 29}};
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n\n");
		}
		
	}

}

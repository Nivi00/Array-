package com.TypesOfArray;

public class Example4
{

	public static void main(String[] args)
	{
		
		//multidimensional array
		
		//multidimensional array in multiple lines(array declaration and initialization)
		
		//array declaration
		int matrix[][] = new int[3][3];//array object creation
		
		//array initialization		
		matrix[0][0] = 1;
		matrix[0][1] = 0;
		matrix[0][2] = 0;
		
		matrix[1][0] = 0;
		matrix[1][1] = 1;
		matrix[1][2] = 0;
		
		matrix[2][0] = 0;
		matrix[2][1] = 0;
		matrix[2][2] = 1;
		
		
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

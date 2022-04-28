package com.TypesOfArray;

public class Example2
{

	public static void main(String[] args)
	{
		//single dimensional array
		
		//single dimensional array in multiple lines(array declaration and initialization)
		
		//array declaration
		int employeeIds[] = new int[5];//array object creation			
		
		//array initialization		
		employeeIds[0] = 2819;
		employeeIds[1] = 3467;
		employeeIds[2] = 3290;
		employeeIds[3] = 2829;
		employeeIds[4] = 2910;
		
		for(int id: employeeIds)
		{
			System.out.println(id);
		}
		
	}

}

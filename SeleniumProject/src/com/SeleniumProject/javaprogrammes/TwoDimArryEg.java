package com.SeleniumProject.javaprogrammes;

public class TwoDimArryEg {

	public static void main(String[] args) {
		
		Object[][] x = new Object[2][3];
		
		System.out.println("The number of rows "+ x.length);
		System.out.println("The number of columns for 1st indexed row "+ x[1].length);
		
		x[0][1] = "Apple";
		x[1][0] = 200000;
		x[1][2] = true;
		
//		System.out.println(x[0][1]);
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
			}
		}

	}

}

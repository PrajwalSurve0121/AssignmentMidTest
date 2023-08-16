package com.JanWrittenTest;

import java.util.Arrays;

public class Q6AvgMultiDimensional {
	
	static void avgRow(int a[][])
	{
		
		for(int i=0;i<a.length;i++)
		{
			int av=0;
			int sum=0;
			for(int j=0;j<a[0].length;j++)
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println(sum); 
			av=sum/a[0].length;	
//			System.out.println(av);
		}
		System.out.print(Arrays.deepToString(a));
		
	}
	
	static void avgColumn(int a[][])
	{
		for(int i=0;i<a[0].length;i++)
		{
			int sum=0;
			int av=0;
			for(int j=0;j<a.length;j++)
			{
				sum=sum+a[j][i];
			}
			
//			System.out.println(sum);
			av=sum/a.length;
			System.out.println(sum+" "+av);
			
		}
	}

	public static void main(String[] args) {
		// 6.Write a program which calculates average of each column of two dimensional array.
//		Also calculate max of all numbers.e.g. If array is {{2,4,9,7} , {6,5,3,10} {7,3,6,4}} 
//		average of each column will be column1 =5 , column2 = 4, column3= 6, column4 = 7. Max element is 10.

		int a[][]={{2,4,9,7} , {6,5,3,10} ,{7,3,6,4}};
//		avgRow(a);
		avgColumn(a);
	}

}

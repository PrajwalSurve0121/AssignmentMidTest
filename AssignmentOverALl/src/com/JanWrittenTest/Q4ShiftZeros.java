package com.JanWrittenTest;

import java.util.Arrays;

public class Q4ShiftZeros {
	
	public static void shiftZ(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// Shift all 0s in array to the end. E.g. if array is {1,5,0 ,6,0,4} 
//		output should be {1,5,6,4,0,0}
		int a[]={1,5,0 ,6,0,4};
		shiftZ(a);

	}

}

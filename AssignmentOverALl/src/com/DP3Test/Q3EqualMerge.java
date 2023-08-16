package com.DP3Test;

import java.util.Arrays;

public class Q3EqualMerge {
	
	public static void equalMerge(String a[],String s[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(a[i].equals(s[j]))
				{
					count++;
					System.out.print(a[i]);
				}
			}
			
		}
		System.out.println(count);
		String merged[]=new String[count];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(a[i].contains(s[j]))
				{
					merged[index]=a[i];
					index++;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(merged));
	}
	
	public static void merge(String a[],String s[])
	{
		String common="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(a[i].equals(s[j]))
				{
					common=common+a[i]+" ";
				}
			}
			
		}
		System.out.println(common);
		String z[]=common.split(" ");
		System.out.println(Arrays.toString(z));
	}

	public static void main(String[] args) {
		//Q3. Write a program to find equal elements of an array and merge in a array.
//	       Arr[]={“Java”,”C”,”Python”,”Oracle”}
//	       Arr2[]={“Angular”, “SpringBoot”,”Java”,”SQL”,”Oracle”}
//	       Resultant array[]={“java”,”oracle”}
		
		String arr[]={"Java","C","Python","Oracle"};
		String arr2[]={"Angular", "SpringBoot","Java","SQL","Oracle"};
		equalMerge(arr, arr2);
//		merge(arr, arr2);
		

	}

}

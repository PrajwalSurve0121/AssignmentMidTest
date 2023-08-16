package com.DP3Test;

import java.util.Arrays;

public class Q3EqualMerge2 {
	
	public static void equalMerge(String a[],String s[])
	{
		int count=0;
		String re="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(a[i].equals(s[j]))
				{
					count++;
					re=re+a[i]+" ";
//					System.out.print(a[i]);
				}
			}
			
		}
		System.out.println(re);
		System.out.println(count);
		//String ss[]=re.split(" ");
		String me[]=new String[count];
		int in=0;
		char ch[]=re.toCharArray();
		for(int i=0;i<re.length();i++)
		{
			if(re.charAt(i)==' ') {
				
			}
		}
		

		
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

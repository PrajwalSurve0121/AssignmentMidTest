package com.DP3Test;

import java.util.Arrays;

public class Q6ToggleCase {
	
	public static void changeCase(String s)
	{
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='A' && c[i]<='Z')
			{
				c[i]=(char)(c[i]+32);
			}
			else if(c[i]>='a' && c[i]<='z')
			{
				c[i]=(char)(c[i]-32);
			}
			else
			{
				c[i]=c[i];
			}
			System.out.print(c[i]);
			
		}
		System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {
		// Write a program to encode a string
//	      Input: ProGraM
//	      Output: pROgRAm
		
		String s="ProGraM";
		System.out.println(s);
		changeCase(s);

	}

}

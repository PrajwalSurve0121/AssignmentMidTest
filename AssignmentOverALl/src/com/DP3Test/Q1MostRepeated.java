package com.DP3Test;

import java.util.Arrays;

public class Q1MostRepeated {
	
	public static void mostRepetedWord(String s)
	{
		String l=s.toLowerCase();
		String a[]=l.split(" ");
		int maxCount=0;
		String repWord="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=="\0")
			{
				continue;
			}
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
					a[j]="\0";
				}
			}
			if(count>maxCount)
			{
				maxCount=count;
				repWord=a[i];
			}
		}
		System.out.println(repWord);
	}
	
	public static void repetedWo(String s)
	{
		String z=s.toLowerCase();
		String a[]=z.split(" ");
		String repeted="";
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=="Visited")
			{
				continue;
			}
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
					a[j]="Visited";
				}
			}
			if(count>max)
			{
				max=count;
				repeted=a[i];
			}
		}
		System.out.println("Most Repeted word is: "+repeted);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="India is My countary and india is beautiful countary it is it it golden countary";
		mostRepetedWord(s);
		repetedWo(s);

	}

}

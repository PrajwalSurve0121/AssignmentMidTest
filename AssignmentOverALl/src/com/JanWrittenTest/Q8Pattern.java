package com.JanWrittenTest;

public class Q8Pattern {

	public static void main(String[] args) {
		// 8.WAP to print pattern [1M]
//		1
//		2 3
//		4 5 6
//		7 8 9 10
//		11 12 13 14 15
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n +" ");
				n++;
			}
			System.out.println(); 
		}

	}

}

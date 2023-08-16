package com.DP3Test;

import java.util.Arrays;

public class Q5ReverseNumAssi {
	
	public static void RevNum(int a[])
	{
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[a.length+i-a.length/2];
			a[a.length+i-a.length/2]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
	
	public void disRev(int arr[])
	{
		int n = arr.length;
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[i + mid + n % 2];
            arr[i + mid + n % 2] = temp;
        }
	}

	public static void main(String[] args) {

//		Q5. Write a program to reverse an array in following manner. Suppose array size is even then 
//		later half should come first and first half should go last. E.g. input array { 1,2,5,7,3,4} output 
//		will be { 7,3,4, 1,2,5}. If array size is even then middle element should remain as it is and 
//		array will be reversed as above. E.g. input array { 5,22,55,21,4,54,10} output will be 
//		{4,54,10,21,5,22,55}
		
		int a[] = { 1, 2, 5, 7, 3, 4 };
		int b[] = { 5, 22, 55, 21, 4, 54, 10 };
		RevNum(a);
		RevNum(b);

	}

}

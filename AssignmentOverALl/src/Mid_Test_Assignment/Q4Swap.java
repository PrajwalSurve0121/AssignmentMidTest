package Mid_Test_Assignment;

import java.util.Arrays;

public class Q4Swap {
	
	public static void reverseArray(int a[])
	{
		int b[] = new int[a.length] ;
		int index = 0;
		
		if(a.length % 2 == 0)
		{	
			index = a.length / 2;
			
			for(int i = 0; i < a.length / 2; i++)
			{
				b[index] = a[i];
				index++;
			}
			
			index = 0;
			for(int i = a.length / 2; i < a.length; i++)
			{
				b[index] = a[i];
				index++;
			}
		}
		
		if(a.length % 2 != 0)
		{	
			index = (a.length / 2)+1;
			b[a.length / 2] = a[a.length / 2];
			
			for(int i = 0; i < a.length / 2; i++)
			{
				b[index] = a[i];
				index++;
			}
			
			index = 0;
			for(int i = ((a.length / 2)+1); i < a.length; i++)
			{
				b[index] = a[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {
		//Write a program to reverse an array in following manner. Suppose array size is even then later half should come first and first half should go last. 
//		E.g. input array { 1,2,5,7,3,4} output will be { 7,3,4, 1,2,5}. If array size is odd then middle element should remain as it is and array will be reversed as above.
//		E.g. input array { 5,22,55,21,4,54,10} output will be {4,54,10,21,5,22,55}

		int arr[] = {1,2,3,4,5,6,7};
		
		Q4Swap.reverseArray(arr);
	}

}

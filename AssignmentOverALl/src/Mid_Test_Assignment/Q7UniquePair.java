package Mid_Test_Assignment;

import java.util.Arrays;

public class Q7UniquePair {
	
	public static void UniquePairAddi(int a[],int sum)
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// To Find unique Pair Of Integers in Array whose Sum is Given Number Given array : [2, 4, 3, 5, 6, -2, 4, 7, 8, 9] 
//		Given sum : 7 Integer numbers, whose sum is equal to value : 7 (2, 5) (4, 3) (-2, 9) , (7)
		
		int a[]= {2, 4, 3,5, 6, -2, 4, 7, 8, 9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		int sum=7;
//		UniquePairAddi(a,sum);
		
		int low=0;
		int high=a.length-1;
		
		while(low<high)
		{
			if(a[low]+a[high]>sum)
			{
				high--;
			}else if(a[low]+a[high]<sum)
			{
				low++;
			}
			else if(a[low]+a[high]==sum)
			{
				System.out.println("Pair of Sum are:"+a[low]+" + "+a[high]+"= "+sum);
				low++;
				high--;
			}
		}

	}

}

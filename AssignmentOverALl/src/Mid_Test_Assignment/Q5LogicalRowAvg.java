package Mid_Test_Assignment;

import java.util.Arrays;

public class Q5LogicalRowAvg {
	
	public static void showRowAvg(int a[][])
	{
		System.out.println(Arrays.deepToString(a));
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			int av=0;
			for(int j=0;j<a[0].length;j++)
			{
				sum=sum+a[i][j];
			}
			av=sum/a[i].length;
			System.out.println("Average of Row is: "+av);
		}
		
	}
	
	public static void showColumnAvg(int a[][])
	{
		
		for(int i=0;i<a[0].length;i++)
		{
			int sum=0;
			int av=0;
			for(int j=0;j<a.length;j++)
			{
				sum=sum+a[j][i];
			}
			av=sum/a.length;
			System.out.println("Average of Column is: "+av);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		showRowAvg(a);
		showColumnAvg(a);
	}

}

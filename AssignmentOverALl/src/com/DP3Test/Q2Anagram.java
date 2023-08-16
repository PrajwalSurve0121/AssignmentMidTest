package com.DP3Test;

public class Q2Anagram {
	
	public static void checkAnagram(String s,String a)
	{
		char p[]=s.toCharArray();
		char q[]=a.toCharArray();
		int count=0;
		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<q.length;j++)
			{
				if(p.length==q.length)
				{
					if(p[i]==q[j])
					{
						count++;
					}
				}
			}
		}
		if(count==s.length())
		{
			System.out.println("s and a are anagram of each other");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="appa";
		String a="papa";
		checkAnagram(s, a);

	}

}

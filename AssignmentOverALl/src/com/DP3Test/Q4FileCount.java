package com.DP3Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Q4FileCount {
	
	public void writeData(File f)
	{
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
				FileOutputStream fout=new FileOutputStream(f);
				String data="Hello Java Cool java";
				byte []a=data.getBytes();
				fout.write(a);
				System.out.println("Data Added Sucessfully....");
				fout.close();
			}
			else
			{
				System.out.println("File Does Not Exist");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void readData(File f)
	{
		try {
			if(f.exists())
			{
				FileInputStream fin=new FileInputStream(f);
				BufferedInputStream bin=new BufferedInputStream(fin);
				int count=0;
				int i;
				while((i=bin.read())!=-1)
				{
					if((char)i==' ')
					{
						count++;
					}
				}
				System.out.println(count);
				int totalchar=(int)(f.length()-count);
				int totalword=count+1;
				System.out.println("Chracter Count is: "+totalchar);
				System.out.println("Word Count is: "+totalword);
				bin.close();
				fin.close();
			}
			else
			{
				System.out.println("File Does Not Exist");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		//Q4. Write a program to count number of words and charcters in a file
		Q4FileCount q=new Q4FileCount();
		
		File f=new File("F:\\JavaWork\\MyFileHandling\\CountWord.txt");
//		q.writeData(f);
		q.readData(f);
		
		
		

	}

}

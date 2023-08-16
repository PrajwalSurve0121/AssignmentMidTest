package com.DP3Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Q8CopyFile {
	
	public void copyFile(File so,File d)
	{
		try
		{
			if(so.exists())
			{
				FileInputStream fin=new FileInputStream(so);
				FileOutputStream fout=new FileOutputStream(d);
				
				int i;
				while((i=fin.read())!=-1)
				{
					fout.write(i);
					System.out.print((char)i);
				}
				System.out.println("Data is Copied");
				fin.close();
				fout.close();
			}
			else
			{
				System.out.println("File Does Not exist");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// Write a program to copy the content of one file to another

		Q8CopyFile q=new Q8CopyFile();
		
		File source=new File("F:\\JavaWork\\MyFileHandling//Source.txt");
		File destin=new File("F:\\JavaWork\\MyFileHandling//Destination.txt");
		q.copyFile(source, destin);
	}

}

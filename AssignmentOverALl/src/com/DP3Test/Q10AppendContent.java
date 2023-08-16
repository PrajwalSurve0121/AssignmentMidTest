package com.DP3Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10AppendContent {

	public static void main(String[] args) throws IOException {
		// Q10. Write a program to append content in a existing file
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		File f=new File("F:\\JavaWork\\MyFileHandling\\BufferedDemo.txt");
		if(!f.exists())
		{
			f.createNewFile();
		}
		//true: Appends data in existing file 
		FileWriter fw=new FileWriter(f,true);
		
		System.out.println("Enter Data( Enter stop to finish)");
		
		String data="";
		
		while(true)
		{
			data=br.readLine();
			if(data.equalsIgnoreCase("stop"))
			{
				break;
			}
					
			fw.write(data);
			fw.write("\n");
		}
		
		System.out.println(",.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,");
		br.close();
		fw.close();
		
		

	}

}

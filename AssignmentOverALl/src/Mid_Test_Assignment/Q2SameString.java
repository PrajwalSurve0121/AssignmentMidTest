package Mid_Test_Assignment;

import java.util.Arrays;

public class Q2SameString {

	public static void main(String[] args) {
		// Write a Java program or function which takes two strings as input and print common characters between them in alphabetical order. 
//		For example, if "thin sticks" and "thick bricks" are two given input strings then common characters between them in alphabetical order are     [c, h, i, k, s, t].
		
		String s1="thick sticks";
		s1=s1.replace(" ", "");
		String s2="thin bricks";
		s2=s2.replace(" ", "");
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		String s3="";
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]=='\0') {
				continue;	
			}
			int count=1;
			for(int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[j]) {
					count++;
					ch2[j]='\0';
				}
			}
			if(count>1) {
				s3=s3+ch1[i];
			}
		}
		char ch3[]=s3.toCharArray();
		for(int i=0;i<ch3.length;i++) {
			for(int j=i+1;j<ch3.length;j++) {
				if(ch3[i]>ch3[j]) {
					char temp=ch3[i];
					ch3[i]=ch3[j];
					ch3[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ch3));


	}

}

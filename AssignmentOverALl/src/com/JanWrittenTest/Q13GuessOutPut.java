package com.JanWrittenTest;

public class Q13GuessOutPut {

	public static void main(String[] args) {
		// Guess the output [1M]

		int i = 2, j = 5;
		String str;
		int k = i++ * --j;
		str = k < 8 ? "false" : null;
		System.out.println(str.equalsIgnoreCase("false") ? "White" : "Black");
		

	}

}

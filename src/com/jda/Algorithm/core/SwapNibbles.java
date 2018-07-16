package com.jda.Algorithm.core;

import java.util.Scanner;

public class SwapNibbles {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println(convert(Conversion.binary(in.nextInt())));

	}
	public static int convert(String str){
		String str2 = "";
		char[] charArr = str.toCharArray();
		for(int i=4; i<8; i++)
			str2 += charArr[i];
		for(int i=0; i<4; i++)
			str2 += charArr[i];
		char[] charArr2 = str2.toCharArray();
		System.out.println(str2);
		int j=0, count=0;
		for(int i=7; i>=0; i--){
			if(charArr2[i] == '1')
			    j += Math.pow(2,count);
			count++;
		}
		return j;
	}

}

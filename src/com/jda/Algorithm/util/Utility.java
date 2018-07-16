package com.jda.Algorithm.util;

public class Utility {
	public static boolean isPalind(int num){
		String str1 = Integer.toString(num);
		String str2 = "";
		for(int i=str1.length()-1; i>=0; i--){
			str2 += str1.charAt(i);
		}
		return str1.equals(str2);
	}
	
	public static int[] toInt(String str){
		int len  = str.length();
		char[] charArr = str.toCharArray();
		int[] arr = new int[len];
		for(int i=0; i<len; i++){
			arr[i] = (int)charArr[i] - (int)'A';
		}
		return arr;
	}
}

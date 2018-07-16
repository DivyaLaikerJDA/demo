package com.jda.core;

import com.jda.utility.FunctionalUtil;

public class replaceString {
	
	public static void main(String args[])
	{
		java.lang.String name = FunctionalUtil.getStringf();
		java.lang.String msg = "hello <<username>> how are you?";
	
		msg = msg.replaceAll("<<username>>", name);
			System.out.println(msg);
			
			
		
	}
	

}

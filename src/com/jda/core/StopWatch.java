package com.jda.core;
public class StopWatch {
	public static void main(String...args)
		{
			long starttime=0 ;
			long endtime=0;
	 char ans =' ';
			System.out.println("do you want to start the timer");
			//ans.Functionalutil.g
			if(ans=='Y')
					{
				starttime = System.currentTimeMillis()/1000;
				
					}
			
			System.out.println("do you want to stop the timer");
			if(ans=='Y')
					{
				endtime = System.currentTimeMillis()/1000;
				
					}
			long timeelapsed = starttime - endtime;
			System.out.println("time elapsed"+(timeelapsed));
		}

	}

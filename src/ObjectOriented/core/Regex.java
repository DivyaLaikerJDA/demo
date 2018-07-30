package ObjectOriented.core;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import ObjectOriented.utility.util;

public class Regex 
{
	static Scanner scan = new Scanner(System.in);
	static String tmplateStr="";
	static String mobileNumber;
	static String fullName;
	static String date;
     public static void main(String[] args) 
     {
    	try 
    	{
			FileReader readFile=new FileReader("C:\\Users\\1022779\\Desktop\\training\\demo\\src\\ObjectOriented\\core\\message.txt");
			BufferedReader br = new BufferedReader(readFile);
			  
			  try
			  {
			  String str;
			  while ((str = br.readLine()) != null)
			  {
				  tmplateStr+=str+"\n";
			  }
			  }
			  catch(IOException e)
			  {
				  System.out.println("Exception: " + e);
			  }
			  System.out.println("Enter your full name");
			   fullName=scan.nextLine();
			  System.out.println("Enter your mobile number");
			   mobileNumber=scan.nextLine();
			  System.out.println("Enter your date(dd/mm/yyyy)");
			   date=scan.nextLine();
			  
			  replaceName();
			  replaceFullName();
			  replaceDate();
			  replacePhoneNumber();
			  System.out.println(tmplateStr);
		} 
    	catch (FileNotFoundException e) 
    	{
			e.printStackTrace();
		}
     }
  private static void replaceName() {
         Pattern p = Pattern.compile("<<\\w+>>");
        Matcher m = p.matcher(tmplateStr);
         if (m.find()) {
             tmplateStr = m.replaceAll(fullName.split(" ")[0]);
         }
     }

     private static void replaceFullName() {
        Pattern p = Pattern.compile("<<\\w+\\s\\w+>>");
        Matcher m = p.matcher(tmplateStr);
         if (m.find()) {
             tmplateStr = m.replaceAll(fullName);
         }
     }

     private static void replaceDate() 
     {
         Pattern p = Pattern.compile("<<[d]{2}/[m]{2}/[y]{4}>>");
        Matcher m = p.matcher(tmplateStr);
         if (m.find()) {
             tmplateStr = m.replaceAll(date);
         }
     }
    private static void replacePhoneNumber() {
         Pattern p = Pattern.compile("<<91-x{10}>>");
        Matcher m = p.matcher(tmplateStr);
         if (m.find()) {
             tmplateStr = m.replaceAll(mobileNumber);
         }
     }
}

package ObjectOriented.core;

import java.io.File;

import ObjectOriented.utility.util;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectsUtil ou = new ObjectsUtil();
		util   u = new util();
		File  fileName =new File("/home/bridgelabz/workspace/demo1/src/ObjectOriented/core/OOPs.json");
		do{
System.out.println("1 .do you wish to add util"+"\n"
		+ "2. do you wish to print all utils"+"\n"
		+"3. quit system");

int ans = u.getIntcust();
switch(ans)
{
case 1: 
	ou.getUtil(fileName);
	break;
case 2:
	//ou.printUtil(fileName);
	u.ReadFromFile();
	break;
case 3:
	System.exit(0);
}
	}while(true);
}
}
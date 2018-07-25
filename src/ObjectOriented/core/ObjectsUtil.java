package ObjectOriented.core;

import java.io.File;
import java.io.Serializable;

import ObjectOriented.utility.util;

public class ObjectsUtil implements Serializable{
	
	private static final long serialVersionUID = 1L;
	util u = new util();
String  name;
String weight;
String price;
public String asjdcscscdcgetName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getName()
{
	return name;
	}
public String getWeight() {
	return weight;
}
public void setWeight(String weight) {
	this.weight = weight;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}

public void printUtil(File fileName)
{ try{
	u.ReadFromFile();
}
catch(Exception e)
{
	e.printStackTrace();
	}
System.out.println(getName());	
System.out.println(getWeight());
System.out.println(getPrice());
}
public void  getUtil(File name)
{

System.out.println("enter name of the util");
  setName(u.getStringcust());
System.out.println("enter weight");
setWeight(u.getStringcust());
System.out.println("enter price");
setPrice(u.getStringcust());
u.cs.add(this);
try{
u.writeToFile(name);
}
catch(Exception e )
{
	e.printStackTrace();
	}

}
	
}

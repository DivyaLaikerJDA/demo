package DesignPatterns;

import java.lang.reflect.Constructor;

public class Reflection {
	public static void main(String args[]){
	 EagerInitialisation one = EagerInitialisation.getInstance();
	 EagerInitialisation two = null;
	 try{
		 Constructor[] constructors = EagerInitialisation.class.getDeclaredConstructors();
		 for(Constructor constructor:constructors)
		 {
			 constructor.setAccessible(true);
			 two = (EagerInitialisation) constructor.newInstance();
		 }
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 System.out.println(one.hashCode());
	 System.out.println(two.hashCode());
}
	
	
}

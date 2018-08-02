package DesignPatterns;

public class LazyInitialisation {
	
	private static LazyInitialisation instance;
	
	private LazyInitialisation(){};
	
	public static LazyInitialisation getInstance()
	{
		if(instance==null)
			instance = new LazyInitialisation();
		
		return instance;
	}

}

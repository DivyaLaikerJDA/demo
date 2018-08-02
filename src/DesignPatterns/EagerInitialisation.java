package DesignPatterns;

public class EagerInitialisation {
	
	private static final EagerInitialisation instance = new EagerInitialisation();
	private EagerInitialisation(){};
	
	private static EagerInitialisation getInstance()
	{
		return instance;
	}

}

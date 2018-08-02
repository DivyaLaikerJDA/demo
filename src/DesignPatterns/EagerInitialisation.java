package DesignPatterns;

public class EagerInitialisation {
	
	private static final EagerInitialisation instance = new EagerInitialisation();
	private EagerInitialisation(){};
	
	static EagerInitialisation getInstance()
	{
		return instance;
	}

}

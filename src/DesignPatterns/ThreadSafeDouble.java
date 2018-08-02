package DesignPatterns;

public class ThreadSafeDouble {
	
	private static ThreadSafeDouble instance;
	private ThreadSafeDouble(){};
	
	public static ThreadSafeDouble getInstance()
	{
		if(instance == null)
		{
			synchronized(ThreadSafeDouble.class)
			{
				if(instance == null)
					instance = new ThreadSafeDouble();
			}
		}
		return instance;
	}

}

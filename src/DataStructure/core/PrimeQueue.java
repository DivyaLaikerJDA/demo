package DataStructure.core;

public class PrimeQueue {
	static boolean isPrime(int n)
    {
       
        if (n <= 1)
            return false;
      
      
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
      
        return true;
    }
	
	public static int reverse(int N)
	{ int num = 0;
	int i;
		if(N<9)
		return 1;
		else
		{ if(N<100)
			 i=10;
		else
			 i=100;
		int k=1;
			while(N!= 0)
			{
				int d = N/i;
				N = N% i ;
				i = i/10;
				num = num + d*k;
				k = k*10;
			}
			return num;
		}
	}
	public static void main(String args[])
	{
		CustomQueue<Integer> cq = new CustomQueue<>();
		PrimeQueue pq = new PrimeQueue();
		for(int i=0;i<=1000;i++)
		{ int N = i;
			if(isPrime(N) && isPrime(reverse(N)))
				cq.enqueue(N);
		}
		cq.print();
	}

}

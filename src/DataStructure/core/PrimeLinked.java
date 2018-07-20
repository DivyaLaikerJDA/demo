package DataStructure.core;

public class PrimeLinked {
	
	static boolean isPrime(int n)
    {
       
        if (n <= 1)
            return false;
      
      
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
      
        return true;
    }
	
	public int reverse(int N)
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
		PrimeLinked pl = new PrimeLinked();
		int arr[][] = new int[10][];
		System.out.println("primes");
		for(int k=0;k<10;k++) {
			int j=0;
			arr[k] = new int[100];
			
		for(int i=100*k;i<=100*k+100;i++)
		{       int N = i;
		
			if(pl.isPrime(N)& pl.isPrime(pl.reverse(N)))
			{ int index = N/100;
			arr[index][j] = N;
			j++;
			System.out.print(N+" ");
			}
			
		}
		System.out.println();
		}
	}}
		
	
	



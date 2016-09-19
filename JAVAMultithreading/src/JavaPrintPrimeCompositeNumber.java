
public class JavaPrintPrimeCompositeNumber extends Thread
{
	private int number;
	private boolean isPrime;
	private JavaPrintNumber printNumber;
	int start;

	JavaPrintPrimeCompositeNumber(int startValue,JavaPrintNumber printNumber,int number,boolean isPrime)
	{
		this.printNumber = printNumber;
		this.number = number;
		this.isPrime = isPrime;
		start = startValue;
	}

	public void run()
	{
		for(int i = start; i<=number; i+=2)
		{
			if(isPrime(i))
			{
				printNumber.printPrime(i);
			}
			else
				printNumber.printComposite(i);
		}
	}
	
	public static boolean isPrime(int toTest)
	{
		if(toTest == 2)
		{
			return true;
		}
		for(int n=3;n<toTest;n+=2)
		{
			if(toTest%n==0)
			{
				return false;
			}
		}
		return true;
	}
}

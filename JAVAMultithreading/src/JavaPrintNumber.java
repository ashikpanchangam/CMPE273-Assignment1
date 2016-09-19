
public class JavaPrintNumber
{

	boolean isPrime = false;
	synchronized void printPrime(int number)
	{
		while(!isPrime)
		{
			try
			{
				wait();
			}catch(Exception E)
			{
			}
		}
		System.out.println(number);
		isPrime = false;
		notifyAll();
	}

	synchronized void printComposite(int number)
	{
		while(isPrime)
		{
			try
			{
				wait();
			}catch(Exception E)
			{
			}			
		}
		System.out.println(number);
		isPrime = true;
		notifyAll();
	}
}
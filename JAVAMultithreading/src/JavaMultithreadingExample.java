import java.util.Scanner;

public class JavaMultithreadingExample
{
	public static void main(String [] args)
	{
		Scanner readInput = new Scanner(System.in);		
		System.out.println("Enter the number of digits to be printed");
		String number = readInput.nextLine();
		Boolean error = printPrimeCompositeNumber(number);
		if(error)
		{
			System.out.println("Unexpected error occured");
		}
		else
		{
			System.out.println("It is either a prime or a composite number");
		}
	}

	public static Boolean printPrimeCompositeNumber(String numberString)
	{
		Boolean error = false;
		try{
			int number = Integer.parseInt(numberString);
			JavaPrintNumber printNumber = new JavaPrintNumber();
			int starting = 1;
			Thread threadOne = new Thread(new JavaPrintPrimeCompositeNumber(starting, printNumber, number, false));
			Thread threadTwo = new Thread(new JavaPrintPrimeCompositeNumber(starting, printNumber, number, true));

			threadOne.start();
			threadTwo.start();
		}
		catch(Exception E)
		{
			error = true;
		}
		return error;
	}
}
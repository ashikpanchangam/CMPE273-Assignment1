import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

public class JavaGenericsExample
{
	public static void main(String args[]) {
		Scanner sc,numberReader;
		int intValue;
		String elementCount;
		boolean result;
		do{
			System.out.println("Enter 1 to Enter integers");
			System.out.println("Enter 2 to Enter characters");
			System.out.println("Enter 3 to exit");

			sc = new Scanner(System.in);
			intValue = Integer.parseInt(sc.nextLine());
			switch (intValue)
			{
			case 1: 
				System.out.println("Enter the number of elements");
				numberReader = new Scanner(System.in);
				elementCount = numberReader.nextLine();
				Integer intArray[] = new Integer[Integer.parseInt(elementCount)];
				for(int i=0; i<Integer.parseInt(elementCount);i++)
				{
					System.out.println("Enter element " + i);
					intArray[i] = Integer.parseInt(numberReader.nextLine());
				}
				result = reverse(intArray);
				if(result)
				{
					System.out.println("Error has been found ");
				}
				break;
			case 2:
				System.out.println("Enter the number of elements a");
				numberReader = new Scanner(System.in);
				elementCount = numberReader.nextLine();
				int count = Integer.parseInt(elementCount);
				String characterArray[] = new String[count];
				for(int i=0;i<count;i++)
				{
					System.out.println("Enter element " + i);
					characterArray[i] = numberReader.nextLine();
				}
				result = reverse(characterArray);
				if(result)
				{
					System.out.println("Error has been found ");
				}
				break;
			case 3:
				System.exit(0);
				break;
			default: 
				System.out.println("Invalid input");
				break;
			} 
		}while(intValue != 3);
	}

	public static <E extends Comparable<E>> boolean reverse(E[] array)
	{
		boolean flag = false;
		try{
			System.out.println("Reverse order");
		for (int i=array.length -1;i>=0;i--)
		{
			System.out.println(array[i]);
				
		}
		}
		catch(Exception error){
				flag = true;
		}
		
		return flag;
	}
}
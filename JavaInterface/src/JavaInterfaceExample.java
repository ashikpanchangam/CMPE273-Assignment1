import java.util.Scanner;

public class JavaInterfaceExample
{

	public static void main(String[] args)
	{
		Scanner sc;
		int input;
		do{
			System.out.println("Enter 1 to hear sound of cat");
			System.out.println("Enter 2 to hear sound of dog");
			System.out.println("Enter 3 to exit");
			sc = new Scanner(System.in);
			input = Integer.parseInt(sc.nextLine());
			switch(input)
			{
			case 1:
				System.out.println(displaySoundOfCat());
				break;
			case 2:
				System.out.println(displaySoundOfDog());
				break;
			case 3:
				System.exit(0);
				break;
			default: 
				System.out.println("Enter a valid input");
				break;	
			}
			
		}while(input != 3);
	}
	
	public static String displaySoundOfDog()
	{
		dog d = new dog();
		return d.makeNoise();
	}
	public static String displaySoundOfCat()
	{
		cat d = new cat();
		return d.makeNoise();
	}
}
import java.util.*;

public class JavaQueuesExample 
{
    public static void main(String[] args) 
    {
    	PriorityQueue<String> pq = new PriorityQueue<String>();
    	pq.offer("january");
    	pq.offer("february");
    	pq.offer("march");
    	pq.offer("april");
    	pq.offer("may");
    	pq.offer("june");
    	pq.offer("july");
    	pq.offer("august");
    	pq.offer("september");
    	pq.offer("october");
    	pq.offer("november");
    	pq.offer("december");
    	
    	System.out.println("Enter the month:");
    	Scanner sc = new Scanner(System.in);
    	String month = sc.nextLine();
    	
    	Boolean flag = CheckIfMonthOrNot(month, pq);
    	
    	if(flag)
    	{
    		System.out.println("Entered String is a valid month");
    	}
    	else
    	{
    		System.out.println("Invalid month");
    	}
    }
    
    public static Boolean CheckIfMonthOrNot(String month, PriorityQueue<String> pq)
    {
		// TODO Auto-generated method stub
    	Boolean result = false;
    	
    	Iterator<String> it = pq.iterator();
    	while(it.hasNext())
    	{
    		if(it.next().equals(month))
    		{
    			result = true;
    			break;
    		}
    		else
    		{
    			result = false;
    		}
    	}
    	return result;
    }
}
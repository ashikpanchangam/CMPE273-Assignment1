import static org.junit.Assert.*;

import java.util.PriorityQueue;

import org.junit.Test;

public class JavaQueuesExampleTest 
{
	@Test
	public void test1() 
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
    	String month = "zuari";
    	assertEquals(false,JavaQueuesExample.CheckIfMonthOrNot(month, pq));
	}
	@Test
	public void test2() 
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
    	String month = "august";
    	assertEquals(true,JavaQueuesExample.CheckIfMonthOrNot(month, pq));
	}


}

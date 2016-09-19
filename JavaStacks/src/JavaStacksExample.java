import java.util.*;

public class JavaStacksExample
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string:");
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	
    	boolean result = BalancedParentheses(str);
    	
    	if(result)
    	{
    		System.out.println("The string of parentheses is balanced");
    	}
    	else
    	{
    		System.out.println("The string of parentheses is not balanced");
    	}
	}
	
	public static boolean BalancedParentheses(String str)
	{
		// TODO Auto-generated method stub

	    Stack<Character> stack = new Stack<Character>();

	    char c;
	    for(int i=0; i < str.length(); i++)
	    {
	        c = str.charAt(i);

	        if(c == '(')
	            stack.push(c);
	        else if(c == '{')
	            stack.push(c);
	        else if(c == '[')
	        	stack.push(c);
	        else if(c == ')')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '(')
	                stack.pop();
	            else
	                return false;
	        else if(c == '}')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '{')
	                stack.pop();
	            else
	                return false;
	        else if(c == ']')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '[')
	                stack.pop();
	            else
	                return false;
	    }
	    return stack.empty();
	}
}
import java.util.ArrayList;
import java.util.Stack;

public class Armstrong
{
	public static void main(String[] args)
	{
		int base;
		int carry = 999;
		int check;
		ArrayList<Integer> stack = new ArrayList<Integer>();
		for(base = 1; base < 999;base++)
		{
			
			while(carry > 0)
			{
				carry = base;
				stack.push(carry % 10);
				carry/=10;
			}
			
			int a = stack.pop();
			int b = stack.pop();
			int c = stack.pop();
			
			check = a*a*a + b*b*b + c*c*c;
			if(base == check)
			{
				System.out.println(base);
			}
		}
		
	}
}
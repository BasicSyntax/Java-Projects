import java.util.*;

public class Palindrome {
	
	public static void main (String[] args)
	{
			Scanner in = new Scanner(System.in);
			System.out.println("\nEnter the number you think may be a palindrome.");
			int a = in.nextInt();
			int carry = a;
			int b;
			int c;
			while (carry != 0)
			{
				b = carry % 10;
				c = b;
				while(carry != 0)
				{
					b = carry % 10;
					c = (c *10) + b;
				}
			}
			
			if(a == carry)
			{
				System.out.println("Your number is a palindrome! \nThe reverse of " + a + " is " + carry + "!");
			} else {
				System.out.println("Your number is not a palindrome! \nThe reverse of " + a + " is " + carry + "!");
			}
		
	
	}
}
import java.util.ArrayList;
import java.util.Stack;

public class Strong
{
	public static void main(String[] args)
	{
		int base = 1;
		int carry = 999;
		int check;
		int result = 0;
		for(int i = 1; i < 1000;i++)
		{
			carry = base;
			while(carry > 0)
			{
				int remain = carry % 10;
				result = result + remain*remain*remain;
				carry/=10;
				
			}
			
			if(base == result)
			{
				System.out.println(base);
			}
			result = 0;
			base++;
		}
		
	}
}
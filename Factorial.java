import java.util.*;

public class Factorial
{
	public static int myFactorial( int integer)
	{
		if( integer == 0){
		return 1;
		} else if (integer == 1){
		return 1;
		} else {
			return(integer*(myFactorial(integer-1)));
		}
	}

	public static int factor(int number) {
		if(number == 0) {
           return 1;
        }
        return factorial_i(number, 1);
	}

	public static int factorial_i(int currentNumber, int sum) {
		if(currentNumber == 1) {
			return sum;
		} else {
			return factorial_i(currentNumber - 1, sum*currentNumber);
		}
	}
	
	public static int twofactor(int number) {
		if(number == 0 | number == 1) {
           return 1;
        } else if(number == 1){
			return 1;
		}
        return factorial_i(number, 1);
	}

	public static int twofactorial_i(int currentNumber, int sum) {
		return factorial_i(currentNumber - 1, sum*currentNumber);
		
	}
	
	public static void main(String[] args)
	{
	    int a = 10;
		int b;
		int c;
		for(int i = 0;i < 10; i++)
		{
			c = a;
			b = a;
			while(b > 1)
			{
				a = a * (b-1);
				b = b - 1;
			}
			System.out.println("The Factorial of " + c + " is = " + a);
			a = c - 1;
			
		}
		System.out.println("A is " + a);
		
		Scanner in = new Scanner(System.in);
		
		int e = in.nextInt();
		
		System.out.println( "Answer is = " + myFactorial(e));
		
		System.out.println( "Answer is = " + factor(e));
		
		System.out.println( "Answer is = " + twofactor(e));

	}
	
}
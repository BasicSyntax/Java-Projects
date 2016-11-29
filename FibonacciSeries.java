public class FibonacciSeries
{
	public static void main(String[] args)
	{
		int num1 = 0;
		int num2 = 1;
		int snum = 1;
		while(snum<1000)
		{
			snum = num1 + num2;
			System.out.println(snum);
			num1 = num2;
			num2 = snum;
		}
	}
}
public class oddnum 
{

	public static void main (String[] args)
	{
		try 
		{
			int a = Integer.parseInt(args[0]);
			if ((a % 2) == 0)
			{
				System.out.println("The number " + a + " is in fact a even number.");
			} else {
				System.out.println("The number " + a + " is an odd number.");
			}
		} catch (NumberFormatException e) {
			System.out.println("\nThe argument entered is too long. \n\nPlease enter a number smaller than 2147483647.");
			System.out.println("\n" + e );
		}
		
	
	}
}
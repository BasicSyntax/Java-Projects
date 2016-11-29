 public class Xortrick {
	 public static void main (String[] args)
	{
		
		int a = 2; //0010 in binary 0010101 21 	1101001 105 1111100 124
		int b = 4; //0100 in binary 1111100 124 0010101 21
      
		System.out.println("value of a and b before swapping, a: " + a +" b: " + b);
       
		//swapping value of two numbers without using temp variable and XOR bitwise operator     
		a = a^b; //now a is 6 and b is 4
		b = a^b; //now a is 6 but b is 2 (original value of a)
		a = a^b; //now a is 4 and b is 2, numbers are swapped
	
		System.out.println("value of a and b after swapping using XOR bitwise operation, a: " + a +" b: " + b);
		
		int a = 6;
		int b = 3;

		System.out.println("value of a and b before swapping, a: " + a +" b: " + b);

		//swapping value of two numbers without using temp variable using multiplication and division
		a = a*b; //now a is 18 and b is 3
		b = a/b; //now a is 18 but b is 6 (original value of a)
		a = a/b; //now a is 3 and b is 6, numbers are swapped

		System.out.println("value of a and b after swapping using multiplication and division, a: " + a +" b: " + b);

	}
 }
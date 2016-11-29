public class recursion1 {
	void myMethod( int counter)
	{
		if(counter == 0)
			return;
		else
		{
			System.out.println("hello" + counter);
			myMethod(--counter);
			System.out.println(""+counter);
			return;
		}
	} 

	public static void main(String[] args){
		recursion1 test = new recursion1();

		test.myMethod(4);
	}
}

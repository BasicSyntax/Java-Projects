import java.util.ArrayList;

public class StringDuplicates
{
	public static void main(String[] args)
	{
		String apple = new String("Apple");
		ArrayList<Character> dupes = new ArrayList<Character>(6);
		System.out.println(apple);
		for (int i = 0; i < apple.length(); i++)
		{
			char cycle = apple.charAt(i);
			for (int j = i+1; j < apple.length(); j++)
			{
				char check = apple.charAt(j);
				if(cycle == check)
				{
					dupes.add(cycle);
				}
			}
		}
		System.out.println(dupes);
	}
}
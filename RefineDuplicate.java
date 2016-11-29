import java.util.ArrayList;
import java.util.Scanner;

public class RefineDuplicate
{
	public static void main(String[] args)
	{
		String apple = new String();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter a Word, it will then have its duplicate letters counted. : \n");
		apple = in.next();
		
		
		ArrayList<Character> dupes = new ArrayList<Character>(10);
		ArrayList<Character> alpha = new ArrayList<Character>(25);
		int count=0,length=1;
		
		while(length!=0)
        {  
          
			char word[]=apple.toCharArray();
			length=word.length;
			count=0;
			for(int j=0;j<length;j++)
			{
				if(word[0]==word[j]) 
				{
					count++;
				}
			}
			if(count!=0) 
			{
				System.out.println(word[0]+" is repeated "+count+" Times");
				apple=apple.replace(""+word[0],"");   
			}				
        }
	}
}
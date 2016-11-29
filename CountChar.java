import java.io.*;
public class CountChar 
{

    public static void main(String[] args) throws IOException
    {
      String ch;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the Statement:");
      ch=br.readLine();
      int count=0,len=0;
	  // len is pointless
	  //System.out.println(len);
        do
        {  
          try
          {
          char name[]=ch.toCharArray();
              len=name.length;
			  System.out.println("length is " + len);
			  
			  count=0;
              for(int j=0;j<len;j++)
				{
				   //System.out.println(len);
				   // if loop char == name at 0??? .... >65 < 91 + > 97 < 123 .. check ASCII
                  if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123))) {
					
					  count++;
				  } 
                     
               }
              if(count!=0){
				  //print name[0]?
                System.out.println(name[0]+" "+count+" Times");
				
				//System.out.println(ch.length());
				ch=ch.replace(""+name[0],""); 
				
				System.out.println("ch.length is: " + ch.length()); 
				System.out.println("len is :" + len);
				
				System.out.println("End of one loop");
					
				}					
			
		
		  // what is the exception catch catching?
          }catch(Exception ex){}
        
		// do while doesnt seem to work ...pointless??
		}while(len!=1);
   }

}
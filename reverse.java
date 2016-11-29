public class Reverse {
	
	public static void main(String[] args)
	{
		String a = args[0];
		
		
        if(a == null || a.isEmpty()){
            System.out.println(a);
        }       
        String reverse = "";
        for(int i = a.length() -1; i>=0; i--){
            reverse = reverse + a.charAt(i);
        }
      
        
		System.out.println(reverse + " Is the reverse of " + a);
		
    }
}
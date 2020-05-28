
import java.util.ArrayList;
import java.util.Stack;

public class Strong{
	public static void main(String[] args){
		for(int i = 1; i < 500;i++){
			int carry = i;
			int result = 0;
			while(carry > 0){
				int remain = carry % 10;
				result = result + remain*remain*remain;
				carry/=10;
			}
			if(i == result){System.out.println(i);}
		}
		
	}
}
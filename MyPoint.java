import java.math.*;

public class MyPoint{

	private int x;
	private int y;
	
	
	public MyPoint(){
		
	}
	
	public MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int[] getXY(){
		int[] xy = new int[2];
		xy[0] = x;
		xy[1] = y;
		return xy; 
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "MyPoint:[x = " + x + ", y = " + y + "]";
	}
	
	public double distance(int x, int y){
		return //((this.x - x) + (this.y - y)); 
		 Math.hypot((this.x - x),(this.y - y));
		
	}
	
	public double distance(MyPoint another){
		return //((this.x - another.getX()) + (this.y - another.getY())); 
		 Math.hypot((this.x - another.getX()),(this.y - another.getY()));
	}
	
	public double distance(){
		return //( this.x + this.y ); 
		 Math.hypot((this.x),(this.y));
	}
}
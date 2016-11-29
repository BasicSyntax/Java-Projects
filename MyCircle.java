public class MyCircle {
	
	private MyPoint center;
	private int radius = 1;
	
	public MyCircle(){
		center = new MyPoint(0,0);
		this.radius = 1;
	}
	
	public MyCircle(int x, int y, int radius){
		center = new MyPoint(x,y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius){
		this.center = center;
		this.radius = radius;
	}
	
	public int getRadius(){
		return radius;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public MyPoint getCenter(){
		return this.center;
	}
	
	public void setCenter(MyPoint center){
		this.center = center;
	}
	
	public int getCenterX(){
		return this.center.getX();
	}
	
	public void setCenterX(int x){
		center.setX(x);
	}
	
	public int getCenterY(){
		return this.center.getY();
	}
	
	public void setCenterY(int y){
		center.setY(y);
	}
	
	public int[] getCenterXY(){
		return this.center.getXY();
	}
	
	public void setCenterXY(int x, int y){
		center.setXY(x, y);
	}
	
	public String toString(){
		return "MyCircle[radius = " + radius + ", center = " + center + "]";
	}
	
	public double getArea(){
		return this.radius * Math.PI * Math.PI;
	}
	
	public double getCircumference(){
		return 2*Math.PI*this.radius;
	}
	
	public double distance(MyCircle another){
		return center.distance(another.center);
		//((this.x - another.getX()) + (this.y - another.getY())); 
		 //Math.hypot((this.getCenterX() - another.getCenterX()),(this.getCenterX() - another.getCenterY()));
	}
	
	
	
	
}
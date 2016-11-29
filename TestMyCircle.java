public class TestMyCircle{
	
	public static void main(String[] args){
		MyPoint p1 = new MyPoint(6,4);
		MyCircle c1 = new MyCircle(p1, 6);
	
		System.out.println(c1.getArea());
		System.out.println(c1.getCircumference());
	}
}
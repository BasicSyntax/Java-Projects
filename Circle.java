/*
 * The Circle class models a circle with a radius and color.
 */
public class Circle {  // Save as "Circle.java"
	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;
   
	// The default constructor with no argument.
	// It sets the radius and color to their default value.
	public Circle() {
		radius = 1.0;
		color = "red";
	}
   
	// 2nd constructor with given radius, but color default
	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}
   
	// 3rd constructor to construct a new instance of Circle with the given radius and color
	public Circle (double radius, String color) { 
		this.radius = radius;
		this.color = color;
	
	}
   
	// Getter for instance variable color
	public String getColor() { 
		return color;
	}
   
	// A public method for retrieving the radius
	public double getRadius() {
		return radius; 
	}
   
	// A public method for computing the area of circle
	public double getArea() {
		return radius*radius*Math.PI;
	}
		
	// Setter for instance variable radius
	public void setRadius(double radius) {
	this.radius = radius;
	}
 
	// Setter for instance variable color
	public void setColor(String color) { 
	/*use the special keyword "this" to resolve the conflict 
	between instance variables and methods' arguments */
	this.color = color;
	}
	
	// Return a description of this instance in the form of
	// Circle[radius=r,color=c]
	public String toString() {
		return "Circle[radius=" + this.radius + " color=" + this.color + "]";
	}
	

	
}
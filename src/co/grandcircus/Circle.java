package co.grandcircus;

public class Circle {

	
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getCircumference() {
		return 2 *(Math.PI * radius);
		
	}
	
	public double getArea() {
		return Math.PI * (radius * radius);
		
	}
	
	private static String formatNumber(double x) {
		return String.format("%.2f", x);
		
	}
	
	public String getFormattedCircumference() {
		return "Circumference: " + formatNumber(getCircumference());
		
	}
	
	public String getFormattedArea() {
		return "Area: " + formatNumber(getArea());
		
	}
	
}

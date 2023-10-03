package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	
	public double area() {
		double recArea = width * height;
		return recArea;
		
	}
	
	public double perimeter() {
		double recPerimeter = 2 * (height + width);
		return recPerimeter;
		
	}
	
	public double diagonal() {
		double recDiagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
		return recDiagonal;
		
	}
	

}

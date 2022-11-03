package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
		
	}
	
	public double area(double length, double width) {
		
		return this.length*this.width;
	}
	
	public double perimeter(double length, double width) {
		
		return (2*this.length + 2*this.width);
		
	}
	
	public boolean isSquare(double length, double width) {
		
		if(this.length==this.width)
			return true;
		else
			return false;
		
	}
	
	public boolean isBigger(double area1, double area2) {

		if (area1 > area2)
			return true;
		else
			return false;

	}

}

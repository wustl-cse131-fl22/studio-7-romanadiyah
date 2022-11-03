package studio7;

import Rectangle;

public class testRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Rectangle small = new Rectangle(3.0, 4.0);
		System.out.println(small.area(3.0, 4.0));
		Rectangle large = new Rectangle (4.0, 5.0);
		System.out.println(large.area(4.0, 5.0));
		System.out.println(small.isBigger(small.area(3.0, 4.0), large.area(4.0, 5.0))); //referring method within object class
		
	}

}

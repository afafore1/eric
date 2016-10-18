package Objects;

public class Rectangle {
	
	static double width = 1;
	static double height = 1;
	
	public Rectangle(){
		
	}
	public Rectangle(double width, double height){
		Rectangle.width = width;
		Rectangle.height = height;
	}
	public static double getArea(){
		return width * height;
	}
	public double getPerimeter(){
		return 2 * (width + height);
	}
}

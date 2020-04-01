
public class DrawShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shapeObject = new Circle(20);
		shapeObject.draw();
		System.out.println("The area of the circle is: " + shapeObject.getArea());
		
		shapeObject= new Rectangle(30, 10);
		shapeObject.draw();
		System.out.println("The area of the Rectangle is: " + shapeObject.getArea());
	}

}

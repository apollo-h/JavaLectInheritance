
public class Circle implements Shape{
	private double radius;
	
	
	
	public Circle(double r) {
		this.radius=r;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("this method will draw a circle");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.1416*this.radius*this.radius;
	}
	
	public double getRadius() {
		
		return this.radius;
	}
	

}


public class Rectangle implements Shape{
	
	
	public double height;
	public double width;
	
	public Rectangle(double h, double w) {
		this.height=h;
		this.width=w;
		
	}
	

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("this method will draw a rectangle");
		
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}
	
}

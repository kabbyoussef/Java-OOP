package classWork111422;

public class Circle {
	private double radius;

	public Circle() {
	radius=0;
			
	}

	public Circle(double radius) {
			this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area() {
		return this.getRadius() * this.getRadius()* Math.PI;
	}
	
	

}

package classWork111422;

public class Sphere extends Circle {

	public Sphere() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sphere(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (super.area()* this.getRadius())*4/3;
	}
	

}

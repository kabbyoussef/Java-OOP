package classWork111422;

public class Cylinder extends Circle {
	private double height;

	public Cylinder() {
		super();
		
	}

	public Cylinder(double heigh,double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
		this.height=heigh;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return super.area()*this.getHeight();
	}
	
	

}

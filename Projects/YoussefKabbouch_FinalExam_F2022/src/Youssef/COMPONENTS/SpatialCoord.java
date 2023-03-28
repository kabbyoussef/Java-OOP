package Youssef.COMPONENTS;

public class SpatialCoord {
	private String Designation;
	private double x;
	private double y;
	private double z;
	public SpatialCoord( String designation,double x, double y, double z) {
		this.Designation=designation;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "------------Location------------\nX[" + x + "], Y[" + y + "], Z[" + z + "]";
	}
	
	
	
}

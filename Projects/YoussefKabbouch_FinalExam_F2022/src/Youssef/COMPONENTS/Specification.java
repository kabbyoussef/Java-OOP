package Youssef.COMPONENTS;

public class Specification {
	private String Designation;
	private double Diameter;
	private double  Mass;
	private double Density;
	private double Inclination;
	private double Rotation;
	public Specification(String designation, double diameter, double mass, double density, double inclination,
			double rotation) {
		Designation = designation;
		Diameter = diameter;
		Mass = mass;
		Density = density;
		Inclination = inclination;
		Rotation = rotation;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public double getDiameter() {
		return Diameter;
	}
	public void setDiameter(double diameter) {
		Diameter = diameter;
	}
	public double getMass() {
		return Mass;
	}
	public void setMass(double mass) {
		Mass = mass;
	}
	public double getDensity() {
		return Density;
	}
	public void setDensity(double density) {
		Density = density;
	}
	public double getInclination() {
		return Inclination;
	}
	public void setInclination(double inclination) {
		Inclination = inclination;
	}
	public double getRotation() {
		return Rotation;
	}
	public void setRotation(double rotation) {
		Rotation = rotation;
	}
	@Override
	public String toString() {
		return "------------Specifications------------\nDiameter=" + Diameter + ", Mass=" + Mass + ", Density="
				+ Density + ", Inclination=" + Inclination + ", Rotation=" + Rotation ;
	}
	
	
	
}

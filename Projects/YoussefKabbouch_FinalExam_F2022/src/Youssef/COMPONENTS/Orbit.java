package Youssef.COMPONENTS;



public class Orbit {
	private String Designation;
	private double Aphelion;
	private double Perihelion;
	private double Eccentricity;
	private double PeriodOrbit;
	private double RadiusOrbit;
	public Orbit(String designation, double aphelion, double perihelion, double eccentricity, double periodOrbit,
			double radiusOrbit) {
	
		Designation = designation;
		Aphelion = aphelion;
		Perihelion = perihelion;
		Eccentricity = eccentricity;
		PeriodOrbit = periodOrbit;
		RadiusOrbit = radiusOrbit;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public double getAphelion() {
		return Aphelion;
	}
	public void setAphelion(double aphelion) {
		Aphelion = aphelion;
	}
	public double getPerihelion() {
		return Perihelion;
	}
	public void setPerihelion(double perihelion) {
		Perihelion = perihelion;
	}
	public double getEccentricity() {
		return Eccentricity;
	}
	public void setEccentricity(double eccentricity) {
		Eccentricity = eccentricity;
	}
	public double getPeriodOrbit() {
		return PeriodOrbit;
	}
	public void setPeriodOrbit(double periodOrbit) {
		PeriodOrbit = periodOrbit;
	}
	public double getRadiusOrbit() {
		return RadiusOrbit;
	}
	public void setRadiusOrbit(double radiusOrbit) {
		RadiusOrbit = radiusOrbit;
	}
	@Override
	public String toString() {
		return "------------Orbit------------\n"
				+ "Aphelion=" + Aphelion + ", Perihelion=" + Perihelion
				+ ", Eccentricity=" + Eccentricity + ", PeriodOrbit=" + PeriodOrbit + ", RadiusOrbit=" + RadiusOrbit;
	}
	
	
}

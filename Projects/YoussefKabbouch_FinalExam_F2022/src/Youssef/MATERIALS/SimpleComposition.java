package Youssef.MATERIALS;

public class SimpleComposition {
	private String Designation;
	private double Rock;
	private double Metal;
	public SimpleComposition(String designation, double rock, double metal) {
		super();
		Designation = designation;
		Rock = rock;
		Metal = metal;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public double getRock() {
		return Rock;
	}
	public void setRock(double rock) {
		Rock = rock;
	}
	public double getMetal() {
		return Metal;
	}
	public void setMetal(double metal) {
		Metal = metal;
	}
	@Override
	public String toString() {
		return "------------SimpleComposition------------\n Rock=" + Rock + ", Metal=" + Metal ;
	}
	

}

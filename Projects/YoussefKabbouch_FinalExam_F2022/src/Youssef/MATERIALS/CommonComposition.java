package Youssef.MATERIALS;

public class CommonComposition {
	private String Designation;
	private double Nickel;
	private double Molybdenum;
	private double Iron;
	private double Zinc;
	public CommonComposition(String designation, double nickel, double molybdenum, double iron, double zinc) {
		
		Designation = designation;
		Nickel = nickel;
		Molybdenum = molybdenum;
		Iron = iron;
		Zinc = zinc;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public double getNickel() {
		return Nickel;
	}
	public void setNickel(double nickel) {
		Nickel = nickel;
	}
	public double getMolybdenum() {
		return Molybdenum;
	}
	public void setMolybdenum(double molybdenum) {
		Molybdenum = molybdenum;
	}
	public double getIron() {
		return Iron;
	}
	public void setIron(double iron) {
		Iron = iron;
	}
	public double getZinc() {
		return Zinc;
	}
	public void setZinc(double zinc) {
		Zinc = zinc;
	}
	@Override
	public String toString() {
		return "------------CommonComposition------------\nNickel=" + Nickel + ", Molybdenum=" + Molybdenum
				+ ", Iron=" + Iron + ", Zinc=" + Zinc;
	}
	
	
	
	
	
}

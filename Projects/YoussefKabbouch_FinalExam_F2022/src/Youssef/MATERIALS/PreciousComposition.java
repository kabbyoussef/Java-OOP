package Youssef.MATERIALS;

public class PreciousComposition {
	private String Designation;
	private double Gold;
	private double Silver;
	private double Platinum;
	private double Palladium;
	private double Rhodium;
	private double Ruthenium;
	private double Iridium;
	private double Osmium;
	public PreciousComposition(String designation, double gold, double silver, double platinum, double palladium,
			double rhodium, double ruthenium, double iridium, double osmium) {
		
		Designation = designation;
		Gold = gold;
		Silver = silver;
		Platinum = platinum;
		Palladium = palladium;
		Rhodium = rhodium;
		Ruthenium = ruthenium;
		Iridium = iridium;
		Osmium = osmium;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public double getGold() {
		return Gold;
	}
	public void setGold(double gold) {
		Gold = gold;
	}
	public double getSilver() {
		return Silver;
	}
	public void setSilver(double silver) {
		Silver = silver;
	}
	public double getPlatinum() {
		return Platinum;
	}
	public void setPlatinum(double platinum) {
		Platinum = platinum;
	}
	public double getPalladium() {
		return Palladium;
	}
	public void setPalladium(double palladium) {
		Palladium = palladium;
	}
	public double getRhodium() {
		return Rhodium;
	}
	public void setRhodium(double rhodium) {
		Rhodium = rhodium;
	}
	public double getRuthenium() {
		return Ruthenium;
	}
	public void setRuthenium(double ruthenium) {
		Ruthenium = ruthenium;
	}
	public double getIridium() {
		return Iridium;
	}
	public void setIridium(double iridium) {
		Iridium = iridium;
	}
	public double getOsmium() {
		return Osmium;
	}
	public void setOsmium(double osmium) {
		Osmium = osmium;
	}
	@Override
	public String toString() {
		return "------------PreciousComposition------------\nGold=" + Gold + ",Silver=" + Silver
				+ ",Platinum=" + Platinum + ",Palladium=" + Palladium + ",Rhodium=" + Rhodium + ",Ruthenium="
				+ Ruthenium + ",Iridium=" + Iridium + ",Osmium=" + Osmium;
	}

}
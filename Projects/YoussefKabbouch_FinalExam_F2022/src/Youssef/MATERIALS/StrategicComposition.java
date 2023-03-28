package Youssef.MATERIALS;

public class StrategicComposition {
	private String Designation;
	private double Chromium;
	private double Cobalt;
	private double Tungsten;
	private double Uranium;
	public StrategicComposition(String designation, double chromium, double cobalt, double tungsten, double uranium) {
		super();
		Designation = designation;
		Chromium = chromium;
		Cobalt = cobalt;
		Tungsten = tungsten;
		Uranium = uranium;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public double getChromium() {
		return Chromium;
	}
	public void setChromium(double chromium) {
		Chromium = chromium;
	}
	public double getCobalt() {
		return Cobalt;
	}
	public void setCobalt(double cobalt) {
		Cobalt = cobalt;
	}
	public double getTungsten() {
		return Tungsten;
	}
	public void setTungsten(double tungsten) {
		Tungsten = tungsten;
	}
	public double getUranium() {
		return Uranium;
	}
	public void setUranium(double uranium) {
		Uranium = uranium;
	}
	@Override
	public String toString() {
		return "------------StrategicComposition------------\n Chromium=" + Chromium + ", Cobalt=" + Cobalt
				+ ", Tungsten=" + Tungsten + ", Uranium=" + Uranium;
	}
	
}

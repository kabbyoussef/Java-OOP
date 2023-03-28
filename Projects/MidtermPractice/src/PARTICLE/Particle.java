package PARTICLE;

import INTERFACES.Scatterable;
import SUPPORT.Mineral;

public abstract class Particle implements Scatterable {
	private String retrievalCode;
	private double pDiameter;
	private double pVolume;
	private double pSurfaceArea;
	private Mineral pComposition;
	private boolean isRefined;
	public static int particleCount = 0;
	
	public Particle(String retrievalCode, double pDiameter, double pVolume, double pSurfaceArea, Mineral pComposition) {
		
		this.retrievalCode = retrievalCode;
		this.pDiameter = pDiameter;
		this.pVolume = pVolume;
		this.pSurfaceArea = pSurfaceArea;
		this.pComposition = pComposition;
		particleCount++;
		
	}



	//Start Setters and Getters
	public String getRetrievalCode() {
		return retrievalCode;
	}

	public void setRetrievalCode(String retrievalCode) {
		this.retrievalCode = retrievalCode;
	}

	public double getpDiameter() {
		return pDiameter;
	}

	public void setpDiameter(double pDiameter) {
		this.pDiameter = pDiameter;
	}

	public double getpVolume() {
		return pVolume;
	}

	public void setpVolume(double pVolume) {
		this.pVolume = pVolume;
	}

	public double getpSurfaceArea() {
		return pSurfaceArea;
	}

	public void setpSurfaceArea(double pSurfaceArea) {
		this.pSurfaceArea = pSurfaceArea;
	}

	public Mineral getpComposition() {
		return pComposition;
	}

	public void setpComposition(Mineral pComposition) {
		this.pComposition = pComposition;
	}

	public boolean isRefined() {
		return isRefined;
	}

	public void setRefined(boolean isRefined) {
		this.isRefined = isRefined;
	}



	//END Setters and Getters
	public void displayParticleInfo() {
		System.out.println("Particle Retieval Code: "+ retrievalCode);
		System.out.println("Diameter: "+ pDiameter +", Volume: "+ pVolume +", Surface Area: "+pSurfaceArea);
//System.out.println("Composition:"+ pComposition.getMass());
	}


	

	@Override
	public double scatterLight() {
		// TODO Auto-generated method stub
		
		return 0;
	}

}

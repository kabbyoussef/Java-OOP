package PARTICLE;

import SUPPORT.Mineral;

public class B_Particle extends Particle {
	public static int BParticleCount = 0;

	public double pDiameter = 1.7;
	public double pVolume = 396;
	public double pSurfaceArea = 18;
	public Mineral pComposition = Mineral.TRITANIUM;
	public boolean isRefined = false;
	
			
	public B_Particle(String retrievalCode) {
	super(retrievalCode,1.7, 396, 18,Mineral.TRITANIUM);
				// TODO Auto-generated constructor stub
BParticleCount++;
	}
	

	


	

			public double scatterLight() {
				return pComposition.getStrength()* Math.sqrt(10);
				
				
			}
}

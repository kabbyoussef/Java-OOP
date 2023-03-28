package PARTICLE;

import SUPPORT.Mineral;

public class C_Particle extends Particle {
	public static int CParticleCount = 0;

	public double pDiameter = 1.7;
	public double pVolume = 396;
	public double pSurfaceArea = 18;
	public Mineral pComposition = Mineral.TRITANIUM;
	public boolean isRefined = false;
	
			
	public C_Particle(String retrievalCode) {
	super(retrievalCode,2.1,518,24,Mineral.UNAMIUM);
				// TODO Auto-generated constructor stub
	CParticleCount++;
	}
	

			public double scatterLight() {
				return pComposition.getMass()*10;
				
				
			}
}

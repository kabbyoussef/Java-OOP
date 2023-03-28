package PARTICLE;

import SUPPORT.Mineral;
import java.lang.Math;
public class A_Particle extends Particle{
	
	public static int AParticleCount = 0;

	public double pDiameter = 1.3;
	public double pVolume = 124;
	public double pSurfaceArea = 7;
	public Mineral pComposition = Mineral.DILITHIUM;
	public boolean isRefined = false;
	
			
	public A_Particle(String retrievalCode) {
	super(retrievalCode,1.3, 124, 7,Mineral.DILITHIUM);
				// TODO Auto-generated constructor stub
	AParticleCount++;
	}
	

	


	

			public double scatterLight() {
				
				
				return pComposition.getStrength()* Math.sqrt(10)*0.28* pComposition.getMass();
				
				
			}

}

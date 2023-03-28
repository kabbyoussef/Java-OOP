package GENERATOR;


import PARTICLE.C_Particle;
import SUPPORT.Location;

public class Part_CGenerator extends ParticleGenerator {
	public static final String PTYPE = "C_Particle";
	public static final int PCAPACITY = 210;
	public static int GENERATED_COUNT = 0;
	public Part_CGenerator(String pGeneratorID, Location pGeneratorPos) {
		super(pGeneratorID, pGeneratorPos);
		
		
		// TODO Auto-generated constructor stub
	}
	public C_Particle generateParticle() {
		GENERATED_COUNT++;
		C_Particle retrievalCode = new C_Particle("C" + GENERATED_COUNT);
		return retrievalCode;
		
	}
}

package GENERATOR;


import PARTICLE.B_Particle;
import SUPPORT.Location;

public class Part_BGenerator extends ParticleGenerator {
	public static final String PTYPE = "B_Particle";
	public static final int PCAPACITY = 180;
	public static int GENERATED_COUNT = 0;
	public Part_BGenerator(String pGeneratorID, Location pGeneratorPos) {
		super(pGeneratorID, pGeneratorPos);
				// TODO Auto-generated constructor stub
	}
	public B_Particle generateParticle() {
		GENERATED_COUNT++;
		B_Particle retrievalCode = new B_Particle("B" + GENERATED_COUNT);
		return retrievalCode;
		
	}
}

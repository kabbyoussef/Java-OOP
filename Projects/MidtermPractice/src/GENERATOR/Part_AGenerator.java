package GENERATOR;

import PARTICLE.A_Particle;
import SUPPORT.Location;

public class Part_AGenerator extends ParticleGenerator{
			public static final String PTYPE = "A_Particle";
			public static final int PCAPACITY = 100;
			public static int GENERATED_COUNT = 0;
			public Part_AGenerator(String pGeneratorID, Location pGeneratorPos) {
				super(pGeneratorID, pGeneratorPos);
				
				
				
				// TODO Auto-generated constructor stub
			}
			public A_Particle generateParticle() {
				
				GENERATED_COUNT++;
				A_Particle retrievalCode = new A_Particle("A" + GENERATED_COUNT);
				return retrievalCode;
				
			}
}

package EXTRACTOR;

import java.util.ArrayList;

import COLLECTOR.ParticleCollector;
import PARTICLE.Particle;
import SUPPORT.Location;

public class ParticleExtractor {
	private String extractorID;
	private Location extractorPOS;
	private ArrayList<Particle> extractorPool;
	public static final int EXTRACTOR_CAPACITY = 500;
	
	public ParticleExtractor(String extractorID, Location extractorPOS) {
		extractorPool=new ArrayList <Particle>();
		this.extractorID = extractorID;
		this.extractorPOS = extractorPOS;
	}
	
	public boolean extractParticles(ParticleCollector pc) {
		
		if (extractorPool.size()==EXTRACTOR_CAPACITY) {
			System.out.println("Extractor Pool does not have sufficient capacity");
			return false;
		}else {
			
			for (Particle value: pc.getCollectorPool()) {
				if (extractorPool.size()<EXTRACTOR_CAPACITY) {
					
				extractorPool.add(value);
			}else {
					System.out.println("Extractor Pool does not have sufficient capacity");
				return false;
			}
		}
			
			return true;
		}
	}

	public ArrayList<Particle> getExtractorPool() {
		return extractorPool;
	}

	
	
}

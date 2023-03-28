package GENERATOR;

import INTERFACES.Generatable;
import SUPPORT.Location;

public abstract class ParticleGenerator implements Generatable {
	public String pGeneratorID;
	public Location pGeneratorPos;
	
	public ParticleGenerator(String pGeneratorID, Location pGeneratorPos) {
	this.pGeneratorID = pGeneratorID;
	this.pGeneratorPos = pGeneratorPos;
	}
	
	

}

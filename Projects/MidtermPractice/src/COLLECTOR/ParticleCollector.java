package COLLECTOR;

import SUPPORT.Location;

import java.util.ArrayList;

import PARTICLE.*;
public class ParticleCollector {
	private String collectorID;
	private Location collectorPOS;
	private ArrayList <Particle> collectorPool;
	
	public static final int COLLECTOR_CAPACITY = 500;
	
	public ParticleCollector(String collectorID, Location collectorPOS) {
		collectorPool=new ArrayList <Particle>();
		
		this.collectorID = collectorID;
		this.collectorPOS = collectorPOS;
	}

	public boolean collectoParticle(Particle p) {
						
		if (COLLECTOR_CAPACITY == collectorPool.size() ) {
			return false;
		} else {
			this.collectorPool.add(p);
					return true;
		}
		
	}
	
	
	
	
	public String getCollectorID() {
		return collectorID;
	}

	public void setCollectorID(String collectorID) {
		this.collectorID = collectorID;
	}

	public Location getCollectorPOS() {
		return collectorPOS;
	}

	public void setCollectorPOS(Location collectorPOS) {
		this.collectorPOS = collectorPOS;
	}

	public ArrayList<Particle> getCollectorPool() {
		return collectorPool;
	}

	public void setCollectorPool(ArrayList<Particle> collectorPool) {
		this.collectorPool = collectorPool;
	}


}

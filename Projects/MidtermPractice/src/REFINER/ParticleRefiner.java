package REFINER;

import SUPPORT.Location;


import java.util.ArrayList;

import EXTRACTOR.ParticleExtractor;
import INTERFACES.Refinable;
import PARTICLE.*;
public class ParticleRefiner implements Refinable {
	private String refinerID;
	private String refinerName;
	private Location refinerPos;
	private ArrayList <Particle> pStorage;
	private ArrayList <A_Particle> Refined_AStorage;
	private ArrayList <B_Particle> Refined_BStorage;
	private ArrayList <C_Particle> Refined_CStorage;
	
	public ArrayList<Particle> getpStorage() {
		return pStorage;
	}

	public void setpStorage(ArrayList<Particle> pStorage) {
		this.pStorage = pStorage;
	}

	public ParticleRefiner(String refinerID, String refinerName, Location refinerPos) {
		pStorage =new ArrayList <Particle>();
		Refined_AStorage= new ArrayList	<A_Particle> ();
		Refined_BStorage= new ArrayList	<B_Particle> ();
		Refined_CStorage= new ArrayList	<C_Particle> ();
		this.refinerID = refinerID;
		this.refinerName = refinerName;
		this.refinerPos = refinerPos;
		}
	
	public  A_Particle refineAParticle(A_Particle p) {
		p.isRefined=true;
		return p;
		
	}
	
	public B_Particle refineBParticle(B_Particle p) {
		p.isRefined=true;
		return p;
		
	}
	public C_Particle refineCParticle(C_Particle p) {
		p.isRefined=true;
		return p;
		
	}
	public boolean emptyExtractor (ParticleExtractor p) {
	
		
		
				for (Particle value: p.getExtractorPool()) {
						pStorage.add(value);
						if (value.getRetrievalCode().charAt(0)== 'A'){
							Refined_AStorage.add((A_Particle)value);
						}else if(value.getRetrievalCode().charAt(0)== 'B') {
							Refined_BStorage.add((B_Particle)value);
						}else {
							Refined_CStorage.add((C_Particle)value);
						}
			}	
	

		
		return true;
		}
	public void sampleParticles(int count) {
		Particle p;
		for (int i=0;i<count;i++) {
			p=(Particle)pStorage.get(i);
			p.displayParticleInfo();
		}
		
	}
	public void displayInfo() {
		System.out.println("RefinerID:"+ refinerID);
		System.out.println("RefinerName:"+ refinerName);
		System.out.println("Location:"+ refinerPos.toString());
		
	}

	

}

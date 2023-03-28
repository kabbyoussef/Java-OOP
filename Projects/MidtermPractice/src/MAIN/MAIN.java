package MAIN;
//youssef kabbouch 10/30/22
import COLLECTOR.ParticleCollector;
import EXTRACTOR.ParticleExtractor;
import GENERATOR.*;
import REFINER.ParticleRefiner;
import SUPPORT.*;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		processParticles();
		
	}
	public static void processParticles()
	{
		
		Part_AGenerator aGen=new Part_AGenerator("AGEN-1",new Location("Alpha",10,10));
		Part_BGenerator bGen=new Part_BGenerator("BGEN-1",new Location("Beta",30,20));
		Part_CGenerator cGen=new Part_CGenerator("CGEN-1",new Location("Gamma",50,30));
		
		ParticleCollector pCol = new ParticleCollector("PCOLLECT", new Location("Lambda",70,40));
		ParticleRefiner pRef = new ParticleRefiner("PREFINE", "PX",new Location("Tau",120,60));
		ParticleExtractor pExt = new ParticleExtractor("PEXTRACT", new Location("Sigma",90,50));
		
		for(int i=0;i<10;i++) {
			pCol.collectoParticle(aGen.generateParticle());
			pCol.collectoParticle(bGen.generateParticle());
			pCol.collectoParticle(cGen.generateParticle());
		}
		
		pExt.extractParticles(pCol);
		pRef.emptyExtractor(pExt);
		pRef.displayInfo();
		System.out.println();
		pRef.sampleParticles(3);	
		
		}
	

}

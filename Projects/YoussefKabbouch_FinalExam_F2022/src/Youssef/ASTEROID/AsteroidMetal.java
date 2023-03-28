package Youssef.ASTEROID;

import java.sql.SQLException;


import Youssef.FACTORY.AsteroidAssembler;


public class AsteroidMetal extends Asteroid{
	public AsteroidMetal(String designation) throws ClassNotFoundException, SQLException {
		super();
		setDesignation(designation);
	
		setRegistry(AsteroidAssembler.buildRegistry(designation));
		setLocation(AsteroidAssembler.buildSpatialCoord(designation));
		setSpecs(AsteroidAssembler.buildSpecification(designation));
		setOrbit(AsteroidAssembler.buildOrbit(designation));
		setcComp(AsteroidAssembler.buildCommonComposition(designation));
		setpComp(AsteroidAssembler.buildPreciousComposition(designation));
		setsComp(AsteroidAssembler.buildSimpleComposition(designation));
		setStComp(AsteroidAssembler.buildStrategicComposition(designation));
		
	}

	@Override
	public String toString() {
		return "------------- AsteroidMetal: " + getDesignation() + " ------------- \n "
				+getRegistry().toString()
				+ "\n"+ getLocation().toString()
				+ "\n"+ getSpecs().toString() 
				+ "\n"+getOrbit().toString()
				+ "\n" + getcComp().toString() 
				+ "\n" + getpComp().toString() 
				+ "\n" + getsComp().toString()
				+ "\n" + getStComp().toString() ;
	}
	
}

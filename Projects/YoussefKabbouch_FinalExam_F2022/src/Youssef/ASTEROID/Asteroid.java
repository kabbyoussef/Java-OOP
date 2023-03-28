package Youssef.ASTEROID;

import Youssef.COMPONENTS.*;
import Youssef.MATERIALS.*;
	public abstract class Asteroid {
	
	private String Designation;
	
	private Registry registry;
	private SpatialCoord location;
	private Specification specs;
	private Orbit orbit;
		
	private CommonComposition cComp;
	private PreciousComposition pComp;
	private SimpleComposition sComp;
	private StrategicComposition stComp;
	
		
	public Asteroid() {

	}


	public Asteroid(String designation, Registry registry, SpatialCoord location, Specification specs, Orbit orbit,
			CommonComposition cComp, PreciousComposition pComp, SimpleComposition sComp, StrategicComposition stComp) {
		
		Designation = designation;
		this.registry = registry;
		this.location = location;
		this.specs = specs;
		this.orbit = orbit;
		this.cComp = cComp;
		this.pComp = pComp;
		this.sComp = sComp;
		this.stComp = stComp;
	}


	public String getDesignation() {
		return Designation;
	}


	public void setDesignation(String designation) {
		Designation = designation;
	}


	public Registry getRegistry() {
		return registry;
	}


	public void setRegistry(Registry registry) {
		this.registry = registry;
	}


	public SpatialCoord getLocation() {
		return location;
	}


	public void setLocation(SpatialCoord location) {
		this.location = location;
	}


	public Specification getSpecs() {
		return specs;
	}


	public void setSpecs(Specification specs) {
		this.specs = specs;
	}


	public Orbit getOrbit() {
		return orbit;
	}


	public void setOrbit(Orbit orbit) {
		this.orbit = orbit;
	}


	public CommonComposition getcComp() {
		return cComp;
	}


	public void setcComp(CommonComposition cComp) {
		this.cComp = cComp;
	}


	public PreciousComposition getpComp() {
		return pComp;
	}


	public void setpComp(PreciousComposition pComp) {
		this.pComp = pComp;
	}


	public SimpleComposition getsComp() {
		return sComp;
	}


	public void setsComp(SimpleComposition sComp) {
		this.sComp = sComp;
	}


	public StrategicComposition getStComp() {
		return stComp;
	}


	public void setStComp(StrategicComposition stComp) {
		this.stComp = stComp;
	}


	@Override
	public String toString() {
		return "Asteroid [Designation=" + Designation + ", registry=" + registry + ", location=" + location + ", specs="
				+ specs + ", orbit=" + orbit + ", cComp=" + cComp + ", pComp=" + pComp + ", sComp=" + sComp
				+ ", stComp=" + stComp + "]";
	}
	
	

	
	
}

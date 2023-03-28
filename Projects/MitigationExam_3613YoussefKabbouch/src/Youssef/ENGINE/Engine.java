package Youssef.ENGINE;

public class Engine {
	private String IDNumber;
	private ShipEngine[] engines;
	
	public Engine(String IDNumber,String StarDestroyerType) {

		this.IDNumber = IDNumber;		
	
		engines = new ShipEngine[3];
		engines[0] = new Engine_S(StarDestroyerType);
		engines[1] = new Engine_C(StarDestroyerType);
		engines[2] = new Engine_S(StarDestroyerType);
		

		
		
	}
	
	public void displayEngineSpecs() {
		System.out.println("------------Engine Specifications-----------");
		System.out.println("Engine:"+IDNumber);
		System.out.printf("Starboard Engine: Engine Type: %s  Length: %d  Height: %d  Power: %d  Weight: %d",	getEngines()[0].getEngineType(),
				getEngines()[0].getLength(),getEngines()[0].getHeight(),getEngines()[0].getPower(),getEngines()[0].getWeight());
		System.out.println();
		System.out.printf("Center Engine: Engine Type: %s  Length: %d  Height: %d  Power: %d  Weight: %d",	getEngines()[1].getEngineType(),
				getEngines()[1].getLength(),getEngines()[1].getHeight(),getEngines()[1].getPower(),getEngines()[1].getWeight());
		System.out.println();
		System.out.printf("Port Engine: Engine Type: %s  Length: %d  Height: %d  Power: %d  Weight: %d",	getEngines()[2].getEngineType(),
				getEngines()[2].getLength(),getEngines()[2].getHeight(),getEngines()[2].getPower(),getEngines()[2].getWeight());
		System.out.println();
	}
	
	
	public String getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public ShipEngine[] getEngines() {
		return engines;
	}

	public void setEngines(ShipEngine[] engines) {
		this.engines = engines;
	}
	
	

}

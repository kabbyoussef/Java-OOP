package Youssef.ENGINE;

public class Engine_S extends ShipEngine {
	public Engine_S(String starDestroyerTypet) {
		super("Engine S", starDestroyerTypet, 0, 0, 0, 0);
		
		// TODO Auto-generated constructor stub
		
		if (starDestroyerTypet=="Imperial_I") {
			
			setLength(100);
			setHeight(50);
			setPower(8000000);
			setWeight(100);
			
		}else if(starDestroyerTypet=="Imperial_II") {
			
			setLength(115);
			setHeight(60);
			setPower(9000000);
			setWeight(100);
			
		}
		
	}
}

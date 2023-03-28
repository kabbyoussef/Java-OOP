package Youssef.ENGINE;

public class Engine_C extends ShipEngine{
	public Engine_C(String starDestroyerTypet) {
		super("Engine C" , starDestroyerTypet, 0, 0, 0, 0);
		
		// TODO Auto-generated constructor stub
	if (starDestroyerTypet=="Imperial_I") {
			
			setLength(225);
			setHeight(75);
			setPower(15000000);
			setWeight(125);
			
	}else if(starDestroyerTypet=="Imperial_II") {
			
			setLength(275);
			setHeight(80);
			setPower(17000000);
			setWeight(125);
			
		}
	}
}

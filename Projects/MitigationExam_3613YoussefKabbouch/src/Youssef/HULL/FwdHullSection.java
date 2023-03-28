package Youssef.HULL;

public class FwdHullSection extends HullSection {

	public FwdHullSection( String starDestroyerType) {
		super("Fwd", starDestroyerType, 0, 0, 0, 0);
		// TODO Auto-generated constructor stub
		if (starDestroyerType=="Imperial_I") {
			setLength(900);
			setHeight(100);
			setWidth(75);
			setWeight(350);
		}else if(starDestroyerType=="Imperial_II") {
			setLength(900);
			setHeight(100);
			setWidth(200);
			setWeight(400);
		}
		
	}
	
			
}

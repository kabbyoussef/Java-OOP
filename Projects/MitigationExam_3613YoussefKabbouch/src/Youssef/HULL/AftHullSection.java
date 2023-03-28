package Youssef.HULL;

public class AftHullSection extends HullSection {
	public AftHullSection( String starDestroyerType) {
		super("Aft", starDestroyerType, 0, 0, 0, 0);
		// TODO Auto-generated constructor stub
		if (starDestroyerType=="Imperial_I") {
			setLength(700);
			setHeight(200);
			setWidth(325);
			setWeight(550);
		}else if(starDestroyerType=="Imperial_II") {
			setLength(900);
			setHeight(275);
			setWidth(300);
			setWeight(700);
		}
	}
}

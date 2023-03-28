package Youssef.DECK;

public class Bridge extends ShipDeck {

	public Bridge(String starDestroyerTypet) {
		super("Bridge", starDestroyerTypet, 0, 0, 0, 0);
		if (starDestroyerTypet=="Imperial_I") {
			setLength(150);
			setHeight(20);
			setWidth(100);
			setWeight(75);
		}else if(starDestroyerTypet=="Imperial_II") {
			setLength(300);
			setHeight(22);
			setWidth(150);
			setWeight(100);
		}
		
		
		// TODO Auto-generated constructor stub
	}
	

}

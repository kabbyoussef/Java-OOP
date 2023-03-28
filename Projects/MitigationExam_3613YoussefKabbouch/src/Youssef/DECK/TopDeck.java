package Youssef.DECK;

public class TopDeck extends ShipDeck{
	public TopDeck(String starDestroyerTypet) {
		super("Top Deck", starDestroyerTypet, 0, 0, 0, 0);
		
		// TODO Auto-generated constructor stub
		
		if (starDestroyerTypet=="Imperial_I") {
			setLength(300);
			setHeight(30);
			setWidth(250);
			setWeight(125);
		}else if(starDestroyerTypet=="Imperial_II") {
			setLength(350);
			setHeight(34);
			setWidth(300);
			setWeight(150);
		}
		
	}
}

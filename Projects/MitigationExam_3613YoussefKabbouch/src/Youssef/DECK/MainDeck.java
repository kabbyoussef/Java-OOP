package Youssef.DECK;

public class MainDeck extends ShipDeck {
	public MainDeck(String starDestroyerTypet) {
		super("Main Deck", starDestroyerTypet, 0, 0, 0, 0);
		
		// TODO Auto-generated constructor stub
		if (starDestroyerTypet=="Imperial_I") {
			setLength(600);
			setHeight(50);
			setWidth(400);
			setWeight(250);
		}else if(starDestroyerTypet=="Imperial_II") {
			setLength(700);
			setHeight(56);
			setWidth(450);
			setWeight(300);
		}
		
	}
}

package Youssef.DECK;

public class Deck {
	private String IDNumber;
	private Bridge Deck_Bridge;
	private TopDeck Deck_Top;
	private  MainDeck Deck_Main;
	
	public Deck(String iDNumber,String StarDestroyerType) {
		
		
			this.IDNumber = iDNumber;		
		
		
		Deck_Bridge = new Bridge(StarDestroyerType) ;
		Deck_Top = new TopDeck(StarDestroyerType) ;
		Deck_Main = new MainDeck(StarDestroyerType);
		
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public Bridge getDeck_Bridge() {
		return Deck_Bridge;
	}

	public void setDeck_Bridge(Bridge deck_Bridge) {
		Deck_Bridge = deck_Bridge;
	}

	public TopDeck getDeck_Top() {
		return Deck_Top;
	}

	public void setDeck_Top(TopDeck deck_Top) {
		Deck_Top = deck_Top;
	}

	public MainDeck getDeck_Main() {
		return Deck_Main;
	}

	public void setDeck_Main(MainDeck deck_Main) {
		Deck_Main = deck_Main;
	}

	public void displayDeckSpecs() {
		System.out.println("------------Deck Specifications-----------");
			System.out.println("Deck:"+IDNumber);
		System.out.printf("Bridge: Deck Type: %s  Star Destroyer Type: %s Length: %d  Height: %d  Width: %d  Weight: %d",	getDeck_Bridge().getDeckType(),
							getDeck_Bridge().getStarDestroyerType(),getDeck_Bridge().getLength(),getDeck_Bridge().getHeight(),getDeck_Bridge().getWidth(),
							getDeck_Bridge().getWeight());
		System.out.println();
		System.out.printf("Top Deck: Deck Type: %s  Star Destroyer Type: %s Length: %d  Height: %d  Width: %d  Weight: %d",	getDeck_Top().getDeckType(),
				getDeck_Top().getStarDestroyerType(),getDeck_Top().getLength(),getDeck_Top().getHeight(),getDeck_Top().getWidth(),
				getDeck_Top().getWeight());
		System.out.println();
		System.out.printf("Main Deck: Deck Type: %s  Star Destroyer Type: %s Length: %d  Height: %d  Width: %d  Weight: %d",	getDeck_Main().getDeckType(),
				getDeck_Main().getStarDestroyerType(),getDeck_Main().getLength(),getDeck_Main().getHeight(),getDeck_Main().getWidth(),
				getDeck_Main().getWeight());
		System.out.println();
	}
}

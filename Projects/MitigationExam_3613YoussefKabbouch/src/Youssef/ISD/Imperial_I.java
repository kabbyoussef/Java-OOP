package Youssef.ISD;

import Youssef.BAY.*;
import Youssef.DECK.Deck;
import Youssef.ENGINE.Engine;
import Youssef.HULL.Hull;

public class Imperial_I extends StarDestroyer {
 	
	public Imperial_I(String shpNumber, String shpName) {
				super(shpNumber, shpName);
				this.setShpClass("Imperial_I");	
				this.setShpCrew(9000);
				setShpHulls(new Hull("H1", this.getShpClass()));
				setShpDecks(new Deck("D1", this.getShpClass()));
				setShpEngines(new Engine("E1", this.getShpClass()));
				setStarboardBay(new SBay( "StarBoard Bay","SB-1"));
				setForwardBay(new FBay( "Forward Bay","FB-1"));
				setPortBay(new PBay( "Port Bay","PB-1"));
				// TODO Auto-generated constructor stub
	}

	public void displayImperial_I() {
}
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("------------Ship Specifications-----------");
		System.out.printf("Ship Number: %s  Ship Type: %s  Ship Name: %s  Ship Class: %s  Ship Crew: %d",getShpNumber(),getShpType(),getShpName(),getShpClass(),getShpCrew());
		System.out.println();
		getShpHulls().displayHullSpecs();
		getShpDecks().displayDeckSpecs();
		getShpEngines().displayEngineSpecs();
		System.out.println("------------Fighter Bay Specifications-----------");
		getStarboardBay().displayBayInfo();
		getForwardBay().displayBayInfo();
		getPortBay().displayBayInfo();
	}
	@Override
	public void navigatesToPosition(String p) {
		// TODO Auto-generated method stub
		super.navigatesToPosition(p);
	}
	@Override
	public boolean launchFighters() {
		// TODO Auto-generated method stub
		return super.launchFighters();
	}
	@Override
	public boolean docks(String D) {
		// TODO Auto-generated method stub
		return super.docks(D);
	}
	@Override
	public boolean undocks(String D) {
		// TODO Auto-generated method stub
		return super.undocks(D);
	}
	
	

			
}

package Youssef.ISD;

import Youssef.BAY.*;
import Youssef.DECK.Deck;
import Youssef.ENGINE.Engine;
import Youssef.HULL.Hull;
import Youssef.INTERFACES.Docks;
import Youssef.INTERFACES.Launches;
import Youssef.INTERFACES.Maneuvers;

public abstract class StarDestroyer implements Docks ,Launches,Maneuvers{
	private String ShpNumber;
	private String ShpType = "Star Destroyer";
	private String ShpName;
	private String ShpClass;
	private int ShpCrew;
	private Hull ShpHulls;
	private Deck ShpDecks;
	private Engine ShpEngines;
	private SBay StarboardBay;
	private PBay PortBay;
	private FBay ForwardBay;
	

	public StarDestroyer() {
		
	}


	public StarDestroyer(String shpNumber, String shpName) {
	
		ShpNumber = shpNumber;
		ShpName = shpName;
	}
	
	
	


	public String getShpNumber() {
		return ShpNumber;
	}


	public void setShpNumber(String shpNumber) {
		ShpNumber = shpNumber;
	}


	public String getShpType() {
		return ShpType;
	}


	public void setShpType(String shpType) {
		ShpType = shpType;
	}


	public String getShpName() {
		return ShpName;
	}


	public void setShpName(String shpName) {
		ShpName = shpName;
	}


	public String getShpClass() {
		return ShpClass;
	}


	public void setShpClass(String shpClass) {
		ShpClass = shpClass;
	}


	public int getShpCrew() {
		return ShpCrew;
	}


	public void setShpCrew(int shpCrew) {
		ShpCrew = shpCrew;
	}


	public Hull getShpHulls() {
		return ShpHulls;
	}


	public void setShpHulls(Hull shpHulls) {
		ShpHulls = shpHulls;
	}


	public Deck getShpDecks() {
		return ShpDecks;
	}


	public void setShpDecks(Deck shpDecks) {
		ShpDecks = shpDecks;
	}


	public Engine getShpEngines() {
		return ShpEngines;
	}


	public void setShpEngines(Engine shpEngines) {
		ShpEngines = shpEngines;
	}


	public SBay getStarboardBay() {
		return StarboardBay;
	}


	public void setStarboardBay(SBay starboardBay) {
		StarboardBay = starboardBay;
	}


	public PBay getPortBay() {
		return PortBay;
	}


	public void setPortBay(PBay portBay) {
		PortBay = portBay;
	}


	public FBay getForwardBay() {
		return ForwardBay;
	}


	public void setForwardBay(FBay forwardBay) {
		ForwardBay = forwardBay;
	}


	public void displayInfo() {
	}


	@Override
	public void navigatesToPosition(String p) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean launchFighters() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean docks(String D) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean undocks(String D) {
		// TODO Auto-generated method stub
		return false;
	}

}

package Youssef.MAIN;


import Youssef.FACTORY.ISD1_Factory;


import Youssef.ISD.Imperial_I;


public class Kabbouch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISD1_Factory fc1 =new ISD1_Factory("ISD1FAC") ;
		fc1.buildISDs(1);
		Imperial_I imp1 =(Imperial_I)fc1.getDryDock().get(0);
		imp1.displayInfo();
		
		
//		imp1.getShpHulls().displayHullSpecs();
//
//		imp1.getShpDecks().displayDeckSpecs();
//	
//		imp1.getShpEngines().displayEngineSpecs();
//		
//	
//		
//		
//		imp1.getStarboardBay().displayBayInfo();
//			
//		imp1.getForwardBay().displayBayInfo();
//			
//		imp1.getPortBay().displayBayInfo();
	}

}

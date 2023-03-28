package Youssef.BAY;
import java.util.ArrayList;

import Youssef.ENUMS.TieFighter;
public abstract class FighterBay extends Bay {
	
		private  ArrayList<TieFighter> slots;
		
		public FighterBay(String bayName, String bayID) {
				super(bayName, bayID, "Tie Fighter");
				
				
				// TODO Auto-generated constructor stub
				
		}
	
	
		public ArrayList<TieFighter> getSlots() {
			return slots;
		}


		public void setSlots(ArrayList<TieFighter> slots) {
			this.slots = slots;
		}

		public  abstract void displayTieFighters();

}

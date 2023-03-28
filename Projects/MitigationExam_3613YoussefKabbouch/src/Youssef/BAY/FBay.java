package Youssef.BAY;

import java.util.ArrayList;

import Youssef.ENUMS.Status;
import Youssef.ENUMS.TieFighter;

public class FBay extends FighterBay {
	
	private int Capacity = 96;
			
	public FBay(String bayName, String bayID) {
		super(bayName, bayID);
		// TODO Auto-generated constructor stub
		this.setBayType("Tie Fighter F");
		this.setSlots(new ArrayList<>());
		TieFighter tf= TieFighter.TieFighter_S;
		tf.setTF_width(5);
		tf.setTF_length(15);
		tf.setTF_type("Standard Fighter");
		tf.setTF_status(Status.NOT_READY);
		getSlots().add(tf);
	}


	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

			@Override
			public void displayTieFighters() {
				// TODO Auto-generated method stub
				getSlots().get(0).display();
			}
			public void displayBayInfo() {
				System.out.println("Forward Fighter Bay ID:"+ getBayID());
				System.out.println( getBayName());
				System.out.println( getBayType());
				displayTieFighters();
				System.out.println("Fighter Capacity: "+ this.getCapacity());
				System.out.println();
			}
}
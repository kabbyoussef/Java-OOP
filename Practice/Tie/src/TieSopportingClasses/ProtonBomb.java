package TieSopportingClasses;

import TieSopportingClasses.*;

public class ProtonBomb extends TieWeapon {
	private int Yield = 7;
	private boolean Dropped=false;
	public ProtonBomb(String model) {
		super(model);
		// TODO Auto-generated constructor stub
	}


	
	public int getYield() {
		return Yield;
	}

	public void setYield(int yield) {
		Yield = yield;
	}

	public boolean getDropped() {
		return Dropped;
	}

	public void setDropped(boolean dropped) {
		Dropped = dropped;
	}

	@Override
	public void Fire() {
		// TODO Auto-generated method stub
		Dropped=true;
	}


}

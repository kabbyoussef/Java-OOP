package TieSopportingClasses;

import TieSopportingClasses.*;

public class LaserCannon extends TieWeapon {

	//Model: String
	private int MaxRange;
	private int AmmoCapacity ;
	private int CurrentAmmoCount;
	public LaserCannon(String model) {
		super(model);
		this.MaxRange = 1000;
		this.AmmoCapacity = 500;
		this.CurrentAmmoCount=500;
		// TODO Auto-generated constructor stub
	}
	
		public int getMaxRange() {
		return MaxRange;
	}

	public void setMaxRange(int maxRange) {
		MaxRange = maxRange;
	}

	public int getAmmoCapacity() {
		return AmmoCapacity;
	}

	public void setAmmoCapacity(int ammoCapacity) {
		AmmoCapacity = ammoCapacity;
	}

	public int getCurrentAmmoCount() {
		return CurrentAmmoCount;
	}

	public void setCurrentAmmoCount(int currentAmmoCount) {
		CurrentAmmoCount = currentAmmoCount;
	}

		@Override
	public void Fire() {
		// TODO Auto-generated method stub
			if (this.CurrentAmmoCount>0) {
				this.CurrentAmmoCount--;
				System.out.println("Firing Cannons");
			}else {
				System.out.println("Ammunition Expended");}
			}
		
	}
	



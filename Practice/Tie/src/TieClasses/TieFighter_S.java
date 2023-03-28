package TieClasses;

import TieSopportingClasses.*;

public class TieFighter_S extends TieFighter {

	public TieFighter_S(String iDNumber, TiePilot pilot) {
		super(iDNumber, pilot);
		
		
		this.setManufacturer("Sienar Fleet Systems");
		this.setModel("Tie Standard");
		this.setFighterClass("Superiority");
		this.setLength(6.3);
		this.setWidth(6.4);
		this.setHeight(7.5);
		this.setFuelCapacity(200);
		this.setMaxSpeed(1200);
		
		TieWeapon [] T=new TieWeapon[2];
		T[0]=new LaserCannon("L1");
		T[1]=new LaserCannon("L1");
		this.setWpns(T);
		this.setCurrentLocation(new Location(10, 12, 0));

	
		// TODO Auto-generated constructor stub
	}

	@Override
	public void FiresCannons() {
		// TODO Auto-generated method stub
		TieWeapon [] t=this.getWpns();
		t[0].Fire();
		t[1].Fire();
		
	}

	@Override
	public void MoveLeft() {
		// TODO Auto-generated method stub
		Location lcl= this.getCurrentLocation();
		lcl.setX(lcl.getX()-1);
		this.setCurrentLocation(lcl);
	}

	@Override
	public void MoveRight() {
		// TODO Auto-generated method stub
		Location lcl= this.getCurrentLocation();
		lcl.setX(lcl.getX()+1);
		this.setCurrentLocation(lcl);
	}

	@Override
	public void MoveForward() {
		// TODO Auto-generated method stub
		Location lcl= this.getCurrentLocation();
		lcl.setY(lcl.getY()+1);
		this.setCurrentLocation(lcl);
	}

	@Override
	public void MoveBackward() {
		// TODO Auto-generated method stub
		Location lcl= this.getCurrentLocation();
		lcl.setY(lcl.getY()-1);
		this.setCurrentLocation(lcl);
	}

	@Override
	public void Ascend() {
		// TODO Auto-generated method stub
		Location lcl= this.getCurrentLocation();
		lcl.setZ(lcl.getZ()+1);
		this.setCurrentLocation(lcl);
	}

	@Override
	public void Descend() {
		// TODO Auto-generated method stub
		Location lcl= this.getCurrentLocation();
		lcl.setZ(lcl.getZ()-1);
		this.setCurrentLocation(lcl);
	}

	@Override
	public void Land() {
		// TODO Auto-generated method stub
		Location lcl= this.getCurrentLocation();
		lcl.setZ(0);
		this.setCurrentLocation(lcl);
		this.setLanded(true);
		this.setSpaceborne(false);
	}

	@Override
	public void Takeoff() {
		// TODO Auto-generated method stub
		Location lcl =this.getCurrentLocation();
		lcl.setZ(10);
		this.setCurrentLocation(lcl);
		setLanded(false);
		setSpaceborne(true);
	}

	@Override
	public void scanTarget() {
		// TODO Auto-generated method stub
		System.out.println(this.getIDNumber()+" is scanning for targets");
	}

}

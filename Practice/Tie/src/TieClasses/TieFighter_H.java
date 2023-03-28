package TieClasses;

import TieSopportingClasses.*;

import TieInterfaces.*;

public class TieFighter_H extends TieFighter implements Bombing {

	public TieFighter_H(String iDNumber, TiePilot pilot) {
		super(iDNumber, pilot);
		
		this.setManufacturer("Sienar Fleet Systems");
		this.setModel("Tie Heavy Fighter");
		this.setFighterClass("Close Support");
		this.setLength(7.8);
		this.setWidth(8.6);
		this.setHeight(5.0);
		this.setFuelCapacity(375);
		this.setMaxSpeed(850);
		
		TieWeapon [] T=new TieWeapon[10];
		T[0]=new LaserCannon("L2");
		T[1]=new LaserCannon("L2");
		for (int i=2;i<10;i++) {
			T[i]=new ProtonBomb("P1");
		}
		this.setWpns(T);
		this.setCurrentLocation(new Location(10, 12, 0));
	


		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void FiresCannons() {
		// TODO Auto-generated method stub
		TieWeapon [] t=this.getWpns();
		LaserCannon l1= (LaserCannon)t[0];
		LaserCannon l2= (LaserCannon)t[1];
		l1.Fire();
		l2.Fire();
	}

	@Override
	public boolean bombTarget() {
		// TODO Auto-generated method stub
		TieWeapon []t=this.getWpns();
		ProtonBomb l;
	for (int i=2;i<10;i++) {
		l= (ProtonBomb)t[i];
		if (l.getDropped()==false) {
			l.Fire();
			System.out.println("Bombs Away");
			return true;
		}
	}
	System.out.println("Bombs Expended");
		return false;
	}

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

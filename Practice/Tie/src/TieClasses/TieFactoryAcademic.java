package TieClasses;

import java.util.Random;

import TieSopportingClasses.Location;
import TieSopportingClasses.TiePilot;

public class TieFactoryAcademic {
	
	private String name;
	private Location loc;
	
	public TieFactoryAcademic(String name, Location loc) {
		this.name = name;
		this.loc = loc;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Location getLoc() {
		return loc;
	}
	
	public void setLoc(Location loc) {
		this.loc = loc;
	}
	
	public TiePilot trainPilot() {
		String ranks[]={"LT","CAPT","CMDR"};
		String rating[]={"Novice","Veteran","Elite"};
		Random r=new Random();
		String rk=ranks[r.nextInt(3)];
		String rt=rating[r.nextInt(3)];
		String Id="TP-"+ (r.nextInt(10)+ 10)+"-"+(r.nextInt(100)+ 100);
		TiePilot tp= new TiePilot(Id, rt, rk);
		return tp;
	}
	
	
}

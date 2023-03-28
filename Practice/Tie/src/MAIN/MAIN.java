package MAIN;
//Youssef Kabbouch
import TieClasses.TieFighter_H;
import TieClasses.TieFighter_S;
import TieSopportingClasses.TiePilot;

public class MAIN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TiePilot SP1=  new TiePilot("SP-001", "LT", "Venteran");
		TiePilot HP1=  new TiePilot("SP-002", "CAPT", "Elite");
		
		TieFighter_S ts= new TieFighter_S("ITS-001", SP1);
		TieFighter_H th=new TieFighter_H("ITH-101", HP1);

		ts.displayFighterData();
		System.out.println();
		th.displayFighterData();
		System.out.println();
		ts.FiresCannons();
		System.out.println();
		th.bombTarget();
		System.out.println();
		ts.getPilot().displaysInfo();
		System.out.println();
		th.getPilot().displaysInfo();
		
		System.out.println();
		System.out.println(ts.getCurrentLocation().toString());
		System.out.println();
		System.out.println(th.getCurrentLocation().toString());
		
		th.Takeoff();
		ts.Takeoff();
		System.out.println();
		System.out.println(ts.getCurrentLocation().toString());
		System.out.println();
		System.out.println(th.getCurrentLocation().toString());
		
		
	}

}

package TieSopportingClasses;

import java.util.Random;

public class TiePilot {
	private String IDNumber;
	private String Rank;
	private String PilotRating;
	
	public TiePilot(String IDNumber, String Rank, String PilotRating) {
		this.IDNumber = IDNumber;
		this.Rank = Rank;
		this.PilotRating = PilotRating;
	}

public String getIDNumber() {
		return this.IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		this.IDNumber = iDNumber;
	}

	public String getRank() {
		return this.Rank;
	}

	public void setRank(String rank) {
		this.Rank = rank;
	}

	public String getPilotRating() {
		return this.PilotRating;
	}

	public void setPilotRating(String pilotRating) {
		this.PilotRating = pilotRating;
	}

public void displaysInfo() {
	System.out.println("Imperial Pilot**********");
	System.out.println("ID:"+this.IDNumber);
	System.out.println("RANK:"+this.Rank);
	System.out.println("RATTING:"+this.PilotRating);
}

public TiePilot trainPilot() {
	String ranks[]={"LT","CAPT","CMDR"};
	String rating[]={"Novice","Veteran","Elite"};
	Random r=new Random();
	String rk=ranks[r.nextInt(3)];
	String rt=rating[r.nextInt(3)];
	String Id="TP-"+ (r.nextInt(10)+ 10)+"-"+(r.nextInt(100)+ 100);
	TiePilot tp= new TiePilot(Id, rt, Id);
	return tp;
}
}

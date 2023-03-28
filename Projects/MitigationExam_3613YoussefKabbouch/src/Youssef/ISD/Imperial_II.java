package Youssef.ISD;

public class Imperial_II extends StarDestroyer{
	public Imperial_II(String shpNumber, String shpName) {
		super(shpNumber, shpName);
		this.setShpClass("Imperial_II");	
		this.setShpCrew(12000);
		// TODO Auto-generated constructor stub
}

public void displayImperial_II() {

}
@Override
public void displayInfo() {
// TODO Auto-generated method stub
	System.out.println("Ship Specifications");
	System.out.printf("Ship Number: %s  Ship Type: %s  Ship Name: %s  Ship Class: %s  Ship Crew: %d",getShpNumber(),getShpType(),getShpClass(),getShpCrew());

}
@Override
public void navigatesToPosition(String p) {
// TODO Auto-generated method stub
super.navigatesToPosition(p);
}
@Override
public boolean launchFighters() {
// TODO Auto-generated method stub
return super.launchFighters();
}
@Override
public boolean docks(String D) {
// TODO Auto-generated method stub
return super.docks(D);
}
@Override
public boolean undocks(String D) {
// TODO Auto-generated method stub
return super.undocks(D);
}


}

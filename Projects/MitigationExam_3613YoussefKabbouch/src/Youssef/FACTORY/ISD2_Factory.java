package Youssef.FACTORY;


import Youssef.ISD.Imperial_I;
import Youssef.ISD.Imperial_II;
import Youssef.ISD.StarDestroyer;

public class ISD2_Factory extends ISDFactory {

	
	
	public ISD2_Factory(String name) {
		super(name);
		setBuildType("Imperial II");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean buildISDs(int count) {
		// TODO Auto-generated method stub
		int ind=901;
		for (int i=1;i<=count;i++) {
			String b = String.format("%03d", i);
			Imperial_II imp = new Imperial_II("ISD-"+ind,"SD-"+b+"_II");
			imp.setShpType("StartDestroyer");
			ind++;
			getDryDock().add(imp);
		}
		return true;
	}

	@Override
	public void displayISDs(int count) {
		this.buildISDs(count);
		// TODO Auto-generated method stub
			for (StarDestroyer st: getDryDock()) {
			Imperial_I d =(Imperial_I)st;
			System.out.println("Ship Number: "+ d.getShpNumber()+" Ship Type: "+ d.getShpType()+" Ship Name: "+ 
								d.getShpName()+" Ship class: "+ d.getShpClass()+" Ship Crew:"+d.getShpCrew());
		}
	}

}
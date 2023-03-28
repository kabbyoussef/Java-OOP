package Youssef.FACTORY;



import java.util.ArrayList;

import Youssef.ISD.Imperial_I;
import Youssef.ISD.StarDestroyer;


public class ISD1_Factory extends ISDFactory {

	
	
	public ISD1_Factory(String name) {
		super(name);
		setBuildType("Imperial I");
		 setDryDock(new ArrayList<>());
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean buildISDs(int count) {
		// TODO Auto-generated method stub
		int ind=83;
		for (int i=1;i<=count;i++) {
			String b = String.format("%03d", i);
			Imperial_I imp = new Imperial_I("ISD-"+ind,"SD-"+b+"_I");
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
			d.displayInfo();
			
			
		}
	}

}

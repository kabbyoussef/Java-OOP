package TieClasses;

import java.util.Random;

import TieSopportingClasses.Location;



public class TieFactory extends TieFactoryAcademic {



public TieFactory(String name, Location loc) {
		super(name, loc);
		// TODO Auto-generated constructor stub
	}

public TieFighter_H Build_HModel() {
	Random r= new Random();
	
	String id="TFH-"+(r.nextInt(1000));
	TieFighter_H h= new TieFighter_H(id,trainPilot());
	return h;
	}
public TieFighter_S Build_SModel() {
	Random r= new Random();
	String id="TFS-"+(r.nextInt(1000));
	TieFighter_S S= new TieFighter_S(id, trainPilot());
	return S;
	}
public TieFighter [] BuildTieFighter(int count_S,int count_H) {
	TieFighter []T=new TieFighter[count_S + count_H];
	for(int i=0;i<count_S;i++) {
		T[i]=Build_SModel();
	}
	for(int i=count_S;i<count_S+count_H;i++) {
		T[i]=Build_HModel();
	}
	return T;
	
			}
}

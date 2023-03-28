package Youssef.FACTORY;

import java.sql.*;
import java.util.ArrayList;

import Youssef.COMPONENTS.*;
import Youssef.DBSPT.DBconnect;
import Youssef.ENUMS.*;
import Youssef.MATERIALS.*;

public class AsteroidAssembler {
	public static ArrayList<Registry> buildRegistrys() throws ClassNotFoundException, SQLException{
		ArrayList<Registry> arr=new ArrayList<Registry>();
		
		DBconnect db= new DBconnect("Asteroids", "3307", "root", "data");
		Connection c = db.getConnection();
		db.executeUseQuery(c);
		
		String qr="Select * from registry ";
		ResultSet r = db.executeSelectQuery(qr, c);
		
		Atype A=null;
		Country B=null;

		
		
		while (r.next()) {
		
			
			if (r.getString("AType").equals("Carboneous")) {
				A=Atype.Carboneous;
			}
			if (r.getString("AType").equals("Metallic")) {
				A=Atype.Metallic;
			}
			if (r.getString("AType").equals("Silicaceous")) {
				A=Atype.Silicaceous;
			}
			if (r.getString("Country").equals("US")) {
				B=Country.US;
			}
			if (r.getString("Country").equals("UK")) {
				B=Country.UK;
			}
			if (r.getString("Country").equals("CHINA")) {
				B=Country.CHINA;
			}
			if (r.getString("Country").equals("RUSSIA")) {
				B=Country.RUSSIA;
			}
		
			
			Registry rg = new Registry(r.getString("Designation"), A,B, r.getString("DDate"));
		arr.add(rg);
			
		}
		
		return arr;
	}
public static Registry buildRegistry(String des) throws ClassNotFoundException, SQLException{
	
	
	DBconnect db= new DBconnect("Asteroids", "3307", "root", "data");
	Connection c = db.getConnection();
	db.executeUseQuery(c);
	String qr="Select * from registry where designation='"+ des+"'";
	ResultSet r = db.executeSelectQuery(qr, c);
	
	Atype A=null;
	Country B=null;
	while (r.next()) {
		if (r.getString("AType").equals("Carboneous")) {
			A=Atype.Carboneous;
		}
		if (r.getString("AType").equals("Metallic")) {
			A=Atype.Metallic;
		}
		if (r.getString("AType").equals("Silicaceous")) {
			A=Atype.Silicaceous;
		}
		if (r.getString("Country").equals("US")) {
			B=Country.US;
		}
		if (r.getString("Country").equals("UK")) {
			B=Country.UK;
		}
		if (r.getString("Country").equals("CHINA")) {
			B=Country.CHINA;
		}
		if (r.getString("Country").equals("RUSSIA")) {
			B=Country.RUSSIA;
		}
		
		Registry rg = new Registry(des, A,B, r.getString("DDate"));
		return rg;
	}
	return null;
}
public static Orbit buildOrbit(String des) throws ClassNotFoundException, SQLException{
	
	
	DBconnect db= new DBconnect("Asteroids", "3307", "root", "data");
	Connection c = db.getConnection();
	db.executeUseQuery(c);
	String qr="Select * from orbit where designation='"+ des+"'";
	ResultSet r = db.executeSelectQuery(qr, c);

	while (r.next()) {
			
		Orbit orb = new Orbit(des, r.getDouble("Aphelion"),r.getDouble("Perihelion"), r.getDouble("Eccentricity"), r.getDouble("Period_Orbit"), r.getDouble("Radius_Orbit"));
		return orb;
	}
	return null;
}
public static SpatialCoord buildSpatialCoord(String des) throws ClassNotFoundException, SQLException{

	
	DBconnect db= new DBconnect("Asteroids", "3307", "root", "data");
	Connection c = db.getConnection();
	db.executeUseQuery(c);
	String qr="Select * from SpatialCoord where designation='"+ des+"'";
	ResultSet r = db.executeSelectQuery(qr, c);

	while (r.next()) {
			
		SpatialCoord lcl = new SpatialCoord(des, r.getDouble("X"), r.getDouble("Y"), r.getDouble("Z"));
		return lcl;
		
	}
	return null;
}
public static Specification  buildSpecification(String des) throws ClassNotFoundException, SQLException{

	
	DBconnect db= new DBconnect("Asteroids", "3307", "root", "data");
	Connection c = db.getConnection();
	db.executeUseQuery(c);
	String qr="Select * from specifications where designation='"+ des+"'";
	ResultSet r = db.executeSelectQuery(qr, c);

	while (r.next()) {
			
		Specification s = new Specification(des, r.getDouble("Diameter"), r.getDouble("Mass"), 
				r.getDouble("Density"),r.getDouble("Inclination"),r.getDouble("Rotation"));
		return s;
		
	}
	return null;
}
public static SimpleComposition buildSimpleComposition(String des) throws ClassNotFoundException, SQLException{
	
	
	DBconnect db= new DBconnect("Asteroids", "3307", "root", "data");
	Connection c = db.getConnection();
	db.executeUseQuery(c);
	String qr="Select * from composition_simple where designation='"+ des+"'";
	ResultSet r = db.executeSelectQuery(qr, c);

	while (r.next()) {
			
		SimpleComposition sc = new SimpleComposition(des,r.getDouble("Content_Rock"), r.getDouble("Content_Metal"));
		
		return sc;
	}
	return null;
}
public static CommonComposition buildCommonComposition(String des) throws ClassNotFoundException, SQLException{
	
	
	DBconnect db= new DBconnect("Asteroids", "3307", "root", "data");
	Connection c = db.getConnection();
	db.executeUseQuery(c);
	String qr="Select * from composition_common where designation='"+ des+"'";
	ResultSet r = db.executeSelectQuery(qr, c);

	while (r.next()) {
			
		CommonComposition cc = new CommonComposition(des,r.getDouble("Nickel"), r.getDouble("Molybdenum"), r.getDouble("Iron"), r.getDouble("Zinc"));
		
		return cc;
	}
	return null;
}
public static PreciousComposition buildPreciousComposition(String des) throws ClassNotFoundException, SQLException{
	
	
	DBconnect db= new DBconnect("Asteroids", "3307", "root", "data");
	Connection c = db.getConnection();
	db.executeUseQuery(c);
	String qr="Select * from composition_precious where designation='"+ des+"'";
	ResultSet r = db.executeSelectQuery(qr, c);

	while (r.next()) {
			
		PreciousComposition pc = new PreciousComposition(des,r.getDouble("Gold"), r.getDouble("Silver"), r.getDouble("Platinum"), 
				r.getDouble("Palladium"),r.getDouble("Rhodium"),r.getDouble("Ruthenium"),r.getDouble("Iridium"),r.getDouble("Osmium"));
		
		return pc;
	}
	return null;
}
public static StrategicComposition buildStrategicComposition(String des) throws ClassNotFoundException, SQLException{

	
	DBconnect db= new DBconnect("Asteroids", "3307", "root", "data");
	Connection c = db.getConnection();
	db.executeUseQuery(c);
	String qr="Select * from composition_strategic where designation='"+ des+"'";
	ResultSet r = db.executeSelectQuery(qr, c);

	while (r.next()) {
			
		StrategicComposition sc = new StrategicComposition(des,r.getDouble("Chromium"), r.getDouble("Cobalt"), r.getDouble("Tungsten"), 
				r.getDouble("Uranium"));
		
		return sc;
	}
	return null;
}

}

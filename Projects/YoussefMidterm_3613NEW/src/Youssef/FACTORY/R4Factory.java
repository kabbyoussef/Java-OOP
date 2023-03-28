
package Youssef.FACTORY;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DBconnection.DBconnect;
import Youssef.DROID.*;
import Youssef.ENUMS.Status;

public class R4Factory extends DroidFactory {

    public R4Factory(String factoryID) {
        super(factoryID);
        this.setDroidStorage(new ArrayList<>());
    }

    @Override
    public void displayAllDroids() {
    	System.out.println("|  SerialN  | Type | Status |");
		for (AstromechDroid dr: getDroidStorage()) {
			R4 d=(R4)dr;
			System.out.println("| "+ d.getSerialNumber()+" | R4 | "+ d.getR4Status()+" |");
							
		}
    }



	@Override
	public void buildStoreDroids(int count) throws ClassNotFoundException, SQLException {
		this.buildDroids(count);
    	DBconnect db= new DBconnect("astros", "3306", "root", "data");
    	Connection c = db.getConnection();
    	db.executeUseQuery(c);
    	for (AstromechDroid d: this.getDroidStorage()) {
    		R4 r=(R4)d;
    	String query ="insert into droids values('"+r.getSerialNumber()+"','R4','"+r.getR4Status()+"','UCEF')";
    	db.executeInsertQuery(query, c);
    	}
    	System.out.printf(count+" Astrom has been created R4");
		
	}

	@Override
	public boolean buildDroids(int count) {
		  for(int i = 0; i <count; i++) {
	    	   R4 dr4 = new R4("R4-000"+i);
	    	    	   this.getDroidStorage().add(dr4);
	       }
	               return true;
		
	}

	@Override
	public void retrivebuildStoreDroids() throws ClassNotFoundException, SQLException {
		DBconnect db= new DBconnect("astros", "3306", "root", "data");
    	Connection c = db.getConnection();
    	
    	db.executeUseQuery(c);
    	String query ="SELECT * FROM droids WHERE Dtype='R4'";
    	ResultSet r = db.executeSelectQuery(query, c);
    
    	while(r.next()) {
    		R4 dr =new R4(r.getString(1));
    		dr.setR4Status(Status.OFFLINE);
    		 	getDroidStorage().add(dr);
		
    		}
    	}



}

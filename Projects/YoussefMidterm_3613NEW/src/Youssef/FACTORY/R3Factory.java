
package Youssef.FACTORY;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DBconnection.DBconnect;
import Youssef.DROID.AstromechDroid;
import Youssef.DROID.R3;
import Youssef.ENUMS.Status;


public class R3Factory extends DroidFactory {
	
	private int buildCredits;
	public static int R3COST = 1100;

    public R3Factory(String factoryID) {
        super(factoryID);
        this.setDroidStorage(new ArrayList<>());
        this.buildCredits = 10000;
    }    
    
    @Override
    public boolean buildDroids(int count) {
    	
       for(int i = 0; i <count; i++) {
    	   R3 dr3 = new R3("R3-000"+i);
    	    	   this.getDroidStorage().add(dr3);
       }
               return true;
    }
    
    public void buildStoreDroids(int count) throws ClassNotFoundException, SQLException {
    	this.buildDroids(count);
    	DBconnect db= new DBconnect("astros", "3306", "root", "data");
    	Connection c = db.getConnection();
    	db.executeUseQuery(c);
    	for (AstromechDroid d: this.getDroidStorage()) {
    		R3 r=(R3)d;
    	String query ="insert into droids values('"+r.getSerialNumber()+"','R3','"+r.getR3Status()+"','UCEF')";
    	db.executeInsertQuery(query, c);
    	}
    	System.out.printf(count+" Astrom has been created");
    }
    
    
    public void retrivebuildStoreDroids() throws ClassNotFoundException, SQLException{
    	DBconnect db= new DBconnect("astros", "3306", "root", "data");
    	Connection c = db.getConnection();
    	
    	db.executeUseQuery(c);
    	String query ="SELECT * FROM droids WHERE Dtype='R3'";
    	ResultSet r = db.executeSelectQuery(query, c);
    
    	while(r.next()) {
    		R3 dr =new R3(r.getString(1));
    		dr.setR3Status(Status.ONLINE);
    		 	getDroidStorage().add(dr);
    		
       	}
    	
    }

			
		
			
			public void checkStatus() {
				// TODO Auto-generated method stub
				
			}
		   			
    

    
    @Override
    public void displayAllDroids() {
    	System.out.println("|  SerialN  | Type | Status |");
		for (AstromechDroid dr: getDroidStorage()) {
			R3 d=(R3)dr;
			System.out.println("| "+ d.getSerialNumber()+" | R3 | "+ d.getR3Status()+" |");
							
		}
    }

	
    
}

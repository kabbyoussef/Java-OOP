package Youssef.MAIN;

import java.sql.SQLException;

import Youssef.ENUMS.Status;
import Youssef.FACTORY.*;

public class MAIN {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		R3Factory R3F = new R3Factory("R3FAC");
       // R3F.buildStoreDroids(100);
		R4Factory R4F = new R4Factory("R4FAC");
	   // R4F.buildStoreDroids(100);
		System.out.println("----------R3----------");
		R3F.retrivebuildStoreDroids();
		R3F.displayAllDroids();
		System.out.println("----------R4----------");
		R4F.retrivebuildStoreDroids();
		R4F.displayAllDroids();
		
			}

}

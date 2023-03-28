package Youssef.MAIN;

import java.awt.HeadlessException;
import java.sql.SQLException;

import Youssef.GUI.YoussefGUI;

public class Kabbouch {

	public static void main(String[] args) throws HeadlessException, ClassNotFoundException, SQLException {
		int limit=5;
		
		for(int x=1;x<=limit;x++) {
			for(int col=1;col<=limit;col++) 
			if (x>=col)
				System.out.print(col);
			
			else
				System.out.print("*");
			System.out.println();
		
	}

}
}
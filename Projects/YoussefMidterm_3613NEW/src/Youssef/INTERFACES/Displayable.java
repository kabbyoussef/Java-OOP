
package Youssef.INTERFACES;

import java.sql.SQLException;

public interface Displayable {
    
    public abstract void displayAllDroids();
	public abstract void buildStoreDroids(int count) throws ClassNotFoundException, SQLException;
	public abstract boolean buildDroids(int count);
	public abstract void retrivebuildStoreDroids() throws ClassNotFoundException, SQLException;
	
}

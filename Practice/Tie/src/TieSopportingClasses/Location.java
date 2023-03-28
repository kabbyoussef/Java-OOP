package TieSopportingClasses;

public class Location {
	private int X;
	private  int Y;
	private int Z;
	
	public Location(int x, int y, int z) {
		
		this.X = x;
		this.Y = y;
		this.Z = z;
	}
	public String toString() {
		String local="Location [X:"+X+";Y:"+Y+";Z:"+Z+"]";
		return local;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public int getZ() {
		return Z;
	}
	public void setZ(int z) {
		Z = z;
	}
}

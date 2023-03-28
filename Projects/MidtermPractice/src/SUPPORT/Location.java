package SUPPORT;

public class Location {
	private String name;
	private int X;
	private int Y;
	
	public Location(String name, int x, int y) {
		this.name = name;
		X = x;
		Y = y;
	}

	public double euclideanDistance(Location L) {
		double d;
		d=Math.sqrt(Math.pow(L.X-X, 2)+Math.pow(L.Y-Y, 2));
		return d;
		}
	
	public String toString() {
		return "name:"+name+", X:"+X+", Y:"+Y;
		
	}
}

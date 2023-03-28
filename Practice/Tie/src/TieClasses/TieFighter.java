package TieClasses;

import TieSopportingClasses.*;
import TieInterfaces.*;


public abstract class TieFighter implements Maneuvering,Scanning  {
	private String manufacturer;
	private String IDNumber;
	private String model;
	private TieWeapon [] wpns;
	private TiePilot pilot;
	private String fighterClass;
	private double length;
	private double width;
	private double height;
	private int fuelCapacity;
	private int maxSpeed;
	private boolean isLanded;
	private boolean isSpaceborne;
	private Location currentLocation;
	public TieFighter(String iDNumber, TiePilot pilot) {
		this.IDNumber = iDNumber;
		this.pilot = pilot;
	}
	//Start Setters and getters
	
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public TieWeapon[] getWpns() {
		return wpns;
	}
	public void setWpns(TieWeapon[] wpns) {
		this.wpns = wpns;
	}
	public TiePilot getPilot() {
		return pilot;
	}
	public void setPilot(TiePilot pilot) {
		this.pilot = pilot;
	}
	public String getFighterClass() {
		return fighterClass;
	}
	public void setFighterClass(String fighterClass) {
		this.fighterClass = fighterClass;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public boolean isLanded() {
		return isLanded;
	}
	public void setLanded(boolean isLanded) {
		this.isLanded = isLanded;
	}
	public boolean isSpaceborne() {
		return isSpaceborne;
	}
	public void setSpaceborne(boolean isSpaceborne) {
		this.isSpaceborne = isSpaceborne;
	}
	public Location getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}
	//End Setters and getters
	
	public void displayFighterData() {
		System.out.println("Model: "+ this.model);
		System.out.println("ID Number: "+ this.IDNumber);
		System.out.println("PILOT ID Number: "+ this.pilot.getIDNumber());
		System.out.println("PILOT Rank:"+ pilot.getRank());
	}
	public abstract void FiresCannons();

}

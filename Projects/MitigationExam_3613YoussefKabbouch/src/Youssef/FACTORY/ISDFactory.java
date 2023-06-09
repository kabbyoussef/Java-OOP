package Youssef.FACTORY;

import java.util.ArrayList;

import Youssef.ISD.StarDestroyer;

public abstract class ISDFactory {
	
	private String name;
	private String buildType;
	private ArrayList<StarDestroyer> dryDock;
	
	public ISDFactory(String name) {
			this.name = name;
	}
	public abstract  boolean buildISDs (int count);
	public abstract  void displayISDs(int count);
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getBuildType() {
		return buildType;
	}
	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}
	public ArrayList<StarDestroyer> getDryDock() {
		return dryDock;
	}
	public void setDryDock(ArrayList<StarDestroyer> dryDock) {
		this.dryDock = dryDock;
	}
	
	
}

package Youssef.DROID;

import Youssef.ARMS.*;
import Youssef.COMPONENT.*;
import Youssef.ENUMS.*;


public class R5 extends AstromechDroid {
	
	private Status R5Status;
    private Battery R5Battery;
    private Radar R5Radar;   

	public R5(String serialNumber) {
		super(serialNumber);
		
		this.R5Status = Status.ONLINE;
		this.R5Battery = Battery.R5;
		this.R5Radar = Radar.R5R;
		
		this.setDome(new SensorDome(this.getSerialNumber()));
		this.getDome().setHeight(4);
		this.getDome().setWeight(150);
		
		this.setChasis(new Chasis(this.getSerialNumber()));
		this.getChasis().setHeight(10);
		this.getChasis().setWeight(350);		
		
		this.setLeftArm(new LeftArm(this.getSerialNumber()));
		
		this.setRightArm(new RightArm(this.getSerialNumber()));
		
		this.setHeight(this.getDome().getHeight() + this.getChasis().getHeight());
		this.setWeight(this.getDome().getWeight() + this.getChasis().getWeight());	
		
	}
	
	

	public Status getR5Status() {
		return R5Status;
	}

	public void setR5Status(Status r5Status) {
		R5Status = r5Status;
	}

	public Battery getR5Battery() {
		return R5Battery;
	}

	public void setR5Battery(Battery r5Battery) {
		R5Battery = r5Battery;
	}

	public Radar getR5Radar() {
		return R5Radar;
	}

	public void setR5Radar(Radar r5Radar) {
		R5Radar = r5Radar;
	}

	@Override
	public void displayDroid() {
		
		
	}

	@Override
	public void checkStatus() {
		
		
	}

}

package Youssef.COMPONENTS;

import Youssef.ENUMS.*;

public class Registry {
	private String Designation;
	private Atype atype;
	private Country country;
	private String DDate;
	public Registry(String designation, Atype atype, Country country, String dDate) {

		this.Designation = designation;
		this.atype = atype;
		this.country = country;
		this.DDate = dDate;
	}

	
	public String getDesignation() {
		return Designation;
	}


	public void setDesignation(String designation) {
		Designation = designation;
	}


	public Atype getAtype() {
		return atype;
	}


	public void setAtype(Atype atype) {
		this.atype = atype;
	}


	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}


	public String getDDate() {
		return DDate;
	}


	public void setDDate(String dDate) {
		DDate = dDate;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
	
		return "Type:"+this.atype.toString()+" , Country: "+this.country.toString()+", Date: "+ this.DDate;
	}
	
	
	
	
	
}

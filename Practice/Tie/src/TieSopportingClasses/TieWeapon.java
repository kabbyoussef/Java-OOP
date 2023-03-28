package TieSopportingClasses;

public abstract  class TieWeapon {
	
	private String Model;

	public TieWeapon(String model) {
		
		Model = model;
	}

	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	
	public abstract void Fire();
	}

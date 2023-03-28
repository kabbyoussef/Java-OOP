package Youssef.HULL;
public class Hull {
	private String  IDNumber;
	private FwdHullSection SectionFWD;
	private AftHullSection SectionAFT;
	
	public Hull(String iDNumber, String StarDestroyerType) {
		
		
			this.IDNumber = iDNumber;		
	
		SectionFWD =new FwdHullSection(StarDestroyerType);
		SectionAFT =new AftHullSection(StarDestroyerType);
	}

	
	public String getIDNumber() {
		return IDNumber;
	}


	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}


	public FwdHullSection getSectionFWD() {
		return SectionFWD;
	}


	public void setSectionFWD(FwdHullSection sectionFWD) {
		SectionFWD = sectionFWD;
	}


	public AftHullSection getSectionAFT() {
		return SectionAFT;
	}


	public void setSectionAFT(AftHullSection sectionAFT) {
		SectionAFT = sectionAFT;
	}


	public void displayHullSpecs() {
		System.out.println("------------Hull Specifications-----------");
			System.out.println("Hull:"+IDNumber);
		System.out.printf("Forward hull: Hull Type: %s  Length: %d  Height: %d  Width: %d  Weight: %d",	getSectionFWD().getHullType(),
				getSectionFWD().getLength(),getSectionFWD().getHeight(),getSectionFWD().getWidth(),getSectionFWD().getWeight());
		System.out.println();
		System.out.printf("Aft hull: Hull Type: %s  Length: %d  Height: %d  Width: %d  Weight: %d",	getSectionAFT().getHullType(),
				getSectionAFT().getLength(),getSectionAFT().getHeight(),getSectionAFT().getWidth(),getSectionAFT().getWeight());
		System.out.println();
	}
}

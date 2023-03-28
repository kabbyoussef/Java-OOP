
package Youssef.ENUMS;

public enum Radar {
    
    R4R("Doppler",500),
    R5R("Microwave",500);

    private String type;
    private int range;
        
    
    private Radar(String type, int range){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
    
    
        
    
    
}

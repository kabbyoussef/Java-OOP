
package Youssef.PAD;

import Youssef.ENUMS.Side;

public abstract class FootPad {
    
    private String serialNumber;
    private Side side;
    private double height;
    private double weight;

    public FootPad(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }    

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public abstract boolean padCheck();
    
    

    
}

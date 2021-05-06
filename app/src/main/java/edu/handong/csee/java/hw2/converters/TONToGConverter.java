package edu.handong.csee.java.hw2.converters;
/** converts TON value to G. uses methods from Convertible interface */
public class TONToGConverter implements Convertible {
    private double ton;
    private double g;

    /** method that set parameter as the value to be converted 
    @param fromValue input value*/
    public void setFromValue (double fromValue) {
        ton = fromValue;
    }

    /** method that converts the value */
    public void convert () {
        g = ton * 1000000;
    }

    /** method that returns the converted value */
    public double getConvertedValue () {
        return g;
    }
}
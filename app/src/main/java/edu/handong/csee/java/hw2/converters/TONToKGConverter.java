package edu.handong.csee.java.hw2.converters;
/** converts TON value to KG. uses methods from Convertible interface */
public class TONToKGConverter implements Convertible {
    private double ton;
    private double kg;

    /** method that set parameter as the value to be converted 
    @param fromValue input value*/
    public void setFromValue (double fromValue) {
        ton = fromValue;
    }

    /** method that converts the value */
    public void convert () {
        kg = ton * 1000;
    }

    /** method that returns the converted value */
    public double getConvertedValue () {
        return kg;
    }
}
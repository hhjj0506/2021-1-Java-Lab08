package edu.handong.csee.java.hw2.converters;
/** converts MILE value to KM. uses methods from Convertible interface */
public class MILEToKMConverter implements Convertible {
    private double mile;
    private double km;

    /** method that set parameter as the value to be converted 
    @param fromValue input value*/
    public void setFromValue (double fromValue) {
        mile = fromValue;
    }

    /** method that converts the value */
    public void convert () {
        km = mile * 1.6;
    }

    /** method that returns the converted value */
    public double getConvertedValue () {
        return km;
    }
}
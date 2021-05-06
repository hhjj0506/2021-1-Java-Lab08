package edu.handong.csee.java.hw2.converters;
/** converts KM value to MILE. uses methods from Convertible interface */
public class KMToMILEConverter implements Convertible {
    private double mile;
    private double km;

    /** method that set parameter as the value to be converted 
    @param fromValue input value*/
    public void setFromValue (double fromValue) {
        km = fromValue;
    }

    /** method that converts the value */
    public void convert () {
        mile = km / 1.6;
    }

    /** method that returns the converted value */
    public double getConvertedValue () {
        return mile;
    }
}
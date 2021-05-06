package edu.handong.csee.java.hw2.converters;
/** converts KM value to Meter. uses methods from Convertible interface */
public class KMToMConverter implements Convertible {
    private double meter;
    private double km;

    /** method that set parameter as the value to be converted 
    @param fromValue input value*/
    public void setFromValue (double fromValue) {
        km = fromValue;
    }

    /** method that converts the value */
    public void convert () {
        meter = km * 1000;
    }

    /** method that returns the converted value */
    public double getConvertedValue () {
        return meter;
    }
}
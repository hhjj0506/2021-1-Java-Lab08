package edu.handong.csee.java.hw2.converters;

/** interface used to make other converters. contains methods needed to convert value */
public interface Convertible {
    /** method that sets parameter as the value */
    public void setFromValue(double fromValue);
    /** method that gets converted value */
    public double getConvertedValue();
    /** method that converts the set value*/
    public void convert();

}
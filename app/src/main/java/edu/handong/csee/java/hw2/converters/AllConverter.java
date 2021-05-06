package edu.handong.csee.java.hw2.converters;
/** class that converts the input value to all possible converted values */
public class AllConverter {
    private double input;
    private double con1;
    private double con2;
    private String measure;

    /** set value from paramter as the value to be converted 
    @param fromValue input value*/
    public AllConverter setFromValue (double fromValue) {
        input = fromValue;
        /** use this code to enable method chaining */
        return this;
    }

    /** set value from parameter as the original measure 
    @param originalMeasure input value*/
    public AllConverter setOriginalMeasure (String originalMeasure) {
        /** only set the measure as parameter if it's TON or KM. Other measures cannot be converted */
        if (originalMeasure.equals("TON") || originalMeasure.equals("KM")) {
            measure = originalMeasure;
        } else {
            /** if the measure is not in range print out following */
            System.out.println("AllConverter cannot support the measure!");
            /** exit program */
            System.exit(0);
        }
        /** for method chaining */
        return this;
    }

    /** converts the value and prints it out */
    public AllConverter convertAndPrintOut () {
        /** if the measure is TON, convert it to KG & G and print */
        if (measure.equals("TON")) {
            con1 = input * 1000;
            con2 = input * 1000000;
            System.out.println(input + " " + measure + " to " + con1 + " KG");
            System.out.println(input + " " + measure + " to " + con2 + " G");
        }
        /** if the measure is KM, convert it to Meter & MILE and print */ 
        else if (measure.equals("KM")) {
            con1 = input * 1000;
            con2 = input / 1.6;
            System.out.println(input + " " + measure + " to " + con1 + " M");
            System.out.println(input + " " + measure + " to " + con2 + " MILE");
        }
        /** for method chaining */
        return this;
    }
}
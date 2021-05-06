package edu.handong.csee.java.hw2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import edu.handong.csee.java.hw2.converters.*; // You will learn the import statement in L11.

/**
This program gets 3 input values : value to be converted, original measure and target measure from the command line arguments.
The program finds the right converter class from the input measures, converts the number and prints it out.
*/
public class IntegratedConverter {

    private double fromValue;

    /**
    main method to run the program
    @param args gets command line arguments
    */
    public static void main(String[] args) {
        /** `
        constructor
        */
        IntegratedConverter myConverter = new IntegratedConverter();
        /** 
        runs the program using run method
        */
        myConverter.run(args);

    }

    /** 
    run method    
    */
    private void run(String[] args) {
        /** input value to be converted*/
        fromValue = Double.parseDouble(args[0]);
        /** input string value to set original measure */
        String originalMeasure = Util.getUppercaseString(args[1]);
        /** input string value to set target measure */
        String targetMeasure = Util.getUppercaseString(args[2]);

        /** if target measure is not ALL (only convert to one other measure) */
        if(!targetMeasure.equals("ALL")) {
            /** string value to find the right converter class */
            String converterName = "edu.handong.csee.java.hw2.converters." + originalMeasure + "To" + targetMeasure + "Converter";

            // You will learn about the try-catch block and Exception in L19
            try {

                // Advanced Java feature: Reflection (it lets us use classes with their String class names.)
                // (JC does not teach this topic as it is advanced one but you can study by yourself!!)
                // https://www.oracle.com/technical-resources/articles/java/javareflection.html
                /** gets the right converter class name*/
                Class<?> converterClass = (Class<?>) Class.forName(converterName);
                /** gets constructor of class */
                Constructor<?> constructor = (Constructor<?>) converterClass.getConstructor();
                /** create instance */
                Convertible myConverter = (Convertible) constructor.newInstance();
                /** set input value as the value to convert */
                myConverter.setFromValue(fromValue);
                /** convert the value */
                myConverter.convert();
                /** print out the result */
                System.out.println(fromValue + " " + originalMeasure + " is " + myConverter.getConvertedValue() + " " + targetMeasure + "!");

            } catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                /** print out the following when the converter class is not found */
                System.out.println("The converter (" + converterName + ") for " + originalMeasure + " to " + targetMeasure + " does not exist!!");
            }

        } else {
            /** constructor for AllConverter */
            AllConverter myAllConverter = new AllConverter();
            // When your method returns `this' in methods of AllConverter, you can call them in this way (method chaining).
            // Think/understand how and why this work. Study and search for Method chaining
            // https://stackoverflow.com/questions/21180269/how-to-achieve-method-chaining-in-java
            // https://www.geeksforgeeks.org/method-chaining-in-java-with-examples/#:~:text=Method%20Chaining%20is%20the%20practice,with%20a%20(dot.).
            /** using method chaining, print out the results */
            myAllConverter.setFromValue(fromValue).setOriginalMeasure(originalMeasure).convertAndPrintOut();
        }
    }
}


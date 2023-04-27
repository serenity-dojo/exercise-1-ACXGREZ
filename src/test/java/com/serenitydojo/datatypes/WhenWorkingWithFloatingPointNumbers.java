package com.serenitydojo.datatypes;

import org.junit.Test;

public class WhenWorkingWithFloatingPointNumbers {

    @Test
    public void workingWithFloatingPointNumbers() {

        double celsiusTemp = 21.80;
        double kiloWeight = 65.50;


        System.out.println("Fahrenheit temp = " + (celsiusTemp * 1.8 + 32));
        System.out.println("Weight in pounds = " + kiloWeight * 2.20462);
    }
}

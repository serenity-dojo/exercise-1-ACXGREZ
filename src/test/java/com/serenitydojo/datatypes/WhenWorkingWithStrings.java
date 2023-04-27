package com.serenitydojo.datatypes;

import org.junit.Test;

public class WhenWorkingWithStrings {

    @Test
    public void workingWithStrings() {

        String name = "John Jacob Jingleheimer Schmidt";
        String lowerCaseName = name.toLowerCase();
        String upperCaseName = name.toUpperCase();
        String trimExtraSpace = name.trim();
        int nameLength = name.length();
        String newName = name.replace("John", "Jim");



        System.out.println(lowerCaseName);
        System.out.println(upperCaseName);
        System.out.println(trimExtraSpace);
        System.out.println(nameLength);
        System.out.println(newName);



    }
}

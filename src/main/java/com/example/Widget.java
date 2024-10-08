package com.example;

public interface Widget {
    // If I define any field, they are `public static final`
    // To be short, they are CONSTANTS
    String getHelpText(); // `public abstract` by default, for INTERFACES...

    // It can also have STATIC METHODS, since they do not have anything 
    // to do with polimorphism or inheritance...

    // We can also have DEFAULT methods... but this can
    // give problems, if a class implements
    // several interfaces with the same DEFAULT method...
}

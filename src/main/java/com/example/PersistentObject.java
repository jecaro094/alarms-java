package com.example;

public interface PersistentObject {
    // If I define any field, they are `public static final`
    // To be short, they are CONSTANTS
    void save(); // `public abstract` by default, for INTERFACES...

    // It can also have STATIC METHODS, since they do not have anything 
    // to do with polimorphism or inheritance...
}

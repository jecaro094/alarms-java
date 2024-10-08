package com.example;

import java.time.LocalDateTime;
import java.awt.Color;

public abstract class Alarm implements Widget, PersistentObject {
    
    // They are basically global constants.
    // Better use global CONSTANTS (final) rather than global VARIABLES (without final)
    // In order to avoid having bugs in the code.
    // For convention purposes, we use UPPERCASE for these constants:
    public static final String DOCUMENTATION = "Some default documentation instructions about `Alarm`";
    public static String DOC;


    // Static initializers
    // Because static are bounded to class, and not objects, the static initializers
    // are only called the first time the class is used in the program, in any way...
    static {
        DOC = "Second documentation not final...";
    }


    // Initializers
    // Are only called before the constructor of this class, when instantiating this class
    // or, which is the same, when creating any object using this class...
    {

    }

    protected boolean active;
    protected final String message; // 'final' Cannot be changed once that it is set
    private LocalDateTime snoozeUntil; // 'private' can only be changed in subclasses or the same package (com.example)

    public Alarm(String message){
        this.message = message;
        stopSnoozing();
    }
    
    public abstract Color getColor();

    @Override
    public String getHelpText(){
        return "I'm an alarm. You can turn me on or off and snooze me.";
    }

    @Override
    public void save(){
        System.out.println("Saving...");
    }

    public void snooze(){
        if(active)
            snoozeUntil = LocalDateTime.now().plusMinutes(5);
    }

    private void stopSnoozing(){
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }

    public boolean isSnoozing(){
        return snoozeUntil.isAfter(LocalDateTime.now());
    }

    public String getMessage(){
        return message;
    }

    public void turnOn(){
        this.active = true;
        stopSnoozing();
    }

    public void turnOff(){
        this.active = false;
        stopSnoozing();
    }

    public boolean getActive(){
        return this.active;
    }

    public String getReport(){
        return getReport(false);
    }

    public String getReport(boolean uppercase){
        if(active && !isSnoozing()){
            if(uppercase)
                return message.toUpperCase();
            else
                return message;
        } else
            return "";

    }

    public void sendReport(){
        System.out.println(getReport(active));
    }

    @Override
    public String toString(){
        return getReport();
    }

}
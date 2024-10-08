package com.example;

import java.awt.Color;

public class HighVisibilityAlarm extends Alarm{
    
    public HighVisibilityAlarm(String message){
        super(message);
    }

    @Override
    public Color getColor(){
        return Color.ORANGE;
    }

    @Override
    public String getReport(boolean uppercase){
        String report = super.getReport(uppercase);
        if (report.isEmpty())
            return report;
        return report + "!";
    }

}

package com.example;

public class Main {
    public static void main(String[] args) {
        interfaceExample();
    }


    private static void interfaceExample(){
        HighVisibilityAlarm alarm = new HighVisibilityAlarm("HV Message");
        activate(alarm); // We upcast here. Upcast to abstract class 'Alarm'
        printHelpText(alarm); // We upcast here. Upcast to interface class 'Widget'
        saveItTwice(alarm); // We upcast here. Upcast to interface class 'Persistent Object'
    }

    private static void activate(Alarm alarm){
        alarm.turnOn();
    }

    private static void printHelpText(Widget widget){
        System.out.println(widget.getHelpText());
    }

    private static void saveItTwice(PersistentObject persistentObject){
        persistentObject.save();
        persistentObject.save();
    }

    private static void colorExample2(){
        Dashboard dashboard = new Dashboard();

        Alarm alarm = new PrioritizedAlarm("HV Alarm message", 34);
        System.out.println(alarm.getColor());

    }

    private static void colorExample1(){
        Dashboard dashboard = new Dashboard();

        Alarm alarm = new HighVisibilityAlarm("HV Alarm message");
        System.out.println(alarm.getColor());

    }

    private static void polimorphismExample(){
        Dashboard dashboard = new Dashboard();

        dashboard.add(new PrioritizedAlarm("Prioritized Alarm message", 2));
        dashboard.add(new HighVisibilityAlarm("HV Alarm message"));
        // dashboard.add(new TimeSensitiveAlarm("Time Sensitive Alarm message"));
        dashboard.printBigReport();

    }

    private static void downcastingExample(){
        Alarm alarm = new PrioritizedAlarm("HV Alarm message", 32);

        if (alarm instanceof PrioritizedAlarm){
            PrioritizedAlarm prioritizedAlarm = (PrioritizedAlarm) alarm;
            System.out.println(prioritizedAlarm.getPriority());
        } 
        else if (alarm instanceof HighVisibilityAlarm){
            HighVisibilityAlarm prioritizedAlarm = (HighVisibilityAlarm) alarm;
            System.out.println(prioritizedAlarm);

        }
    }

    private static void upcastingExample(){
        String message = "Some example message...";
        HighVisibilityAlarm alarm = new HighVisibilityAlarm(message);
        alarm.turnOn();
        String report = alarm.getReport(); // uses the overriden method from `HighVisibilityAlarm`
        System.out.println(report);
        alarm.sendReport(); // uses the overriden method from `HighVisibilityAlarm`

    }

    private static void exampleHighVisibilityAlarm(){
        String message = "Some example message...";
        HighVisibilityAlarm alarm = new HighVisibilityAlarm(message);
        alarm.turnOn();
        alarm.sendReport();

    }


    private static void examplePrioritizedAlarm(){
        String message = "Some example message...";
        PrioritizedAlarm alarm = new PrioritizedAlarm(message, 42);
    }

    // private static void exampleAlarm2(){
    //     Alarm alarm = new Alarm("Some message...");
    //     alarm.turnOn();
    //     alarm.snooze();
    //     alarm.sendReport();
    // }

    // private static void exampleAlarm(){
    //     Alarm alarm = new Alarm("Temperature too high");
    //     System.out.println("Alarm activated: " + alarm.getActive());
    //     alarm.turnOn();
    //     System.out.println("Alarm activated: " + alarm.getActive());
    // }
}
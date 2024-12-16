package org.designpattern.practice.BehavioralPatterns.CommandPatternService;

public class LightService {
    private Command turnOnCommand;
    private Command turnOffCommand;

    public LightService() {
        // Initialize commands with concrete command objects
        this.turnOnCommand = new TurnOnCommand(new Light());
        this.turnOffCommand = new TurnOffCommand(new Light());
    }

    public void turnOn() {
        turnOnCommand.execute();  // Executes the turn on command
    }

    public void turnOff() {
        turnOffCommand.execute();  // Executes the turn off command
    }
}

interface Command {
    void execute();  // Method to execute the command
}

class TurnOnCommand implements Command {
    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();  // Calls the actual action on the receiver (Light)
    }
}

class TurnOffCommand implements Command {
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();  // Calls the actual action on the receiver (Light)
    }
}

class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

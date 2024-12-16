//package org.designpattern.practice.BehavioralPatterns.CommandPatternService;
//
//interface Command {
//    void execute();
//}
//
//class Light {
//    public void turnOn() {
//        System.out.println("Light is ON");
//    }
//
//    public void turnOff() {
//        System.out.println("Light is OFF");
//    }
//}
//
//class TurnOnLightCommand implements Command {
//    private Light light;
//
//    public TurnOnLightCommand(Light light) {
//        this.light = light;
//    }
//
//    public void execute() {
//        light.turnOn();
//    }
//}
//
//class TurnOffLightCommand implements Command {
//    private Light light;
//
//    public TurnOffLightCommand(Light light) {
//        this.light = light;
//    }
//
//    public void execute() {
//        light.turnOff();
//    }
//}

package org.designpattern.practice;

import org.designpattern.practice.BehavioralPatterns.ChainofResponsibilityPatternService.LoggerService;
import org.designpattern.practice.BehavioralPatterns.CommandPatternService.LightService;
import org.designpattern.practice.StructuralPatterns.DecoratorPatternService.CoffeeService;
import org.designpattern.practice.BehavioralPatterns.MediatorPatternService.ChatService;
import org.designpattern.practice.StructuralPatterns.ProxyPatternService.InternetService;
import org.designpattern.practice.CreationalPatterns.FactoryPatternService.NotificationService;
import org.designpattern.practice.CreationalPatterns.SingletonPatternService.SingletonService;
import org.designpattern.practice.BehavioralPatterns.StatePatternService.PlayerService;
import org.designpattern.practice.BehavioralPatterns.TemplateMethodPatternService.GameService;
import org.designpattern.practice.BehavioralPatterns.VisitorPatternService.ShoppingCartService;

public class DesignPatternsController {
    public static void main(String[] args) {
        // Factory Pattern - Creates an object based on the input type
        System.out.println("Factory Pattern:");
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("SMS");  // This will create and send an SMS Notification

        // Singleton Pattern - Ensures a class has only one instance
        System.out.println("\nSingleton Pattern:");
        SingletonService singletonService = SingletonService.getInstance();
        singletonService.showMessage();  // Only one instance of SingletonService will be created

        // Decorator Pattern - Adds new functionalities to an object dynamically
        System.out.println("\nDecorator Pattern:");
        CoffeeService coffeeService = new CoffeeService();
        coffeeService.prepareCoffee();  // Adding Milk and Sugar to the coffee dynamically

        // Proxy Pattern - Controls access to another object (like an internet connection)
        System.out.println("\nProxy Pattern:");
        InternetService internetService = new InternetService();
        internetService.connectTo("example.com");  // Checks if the connection is allowed (e.g., banning sites)

        // Command Pattern - Encapsulates a request as an object to decouple sender and receiver
        System.out.println("\nCommand Pattern:");
        LightService lightService = new LightService();
        lightService.turnOn();  // Command to turn the light on
        lightService.turnOff(); // Command to turn the light off

        // Chain of Responsibility Pattern - Passes requests along a chain of handlers
        System.out.println("\nChain of Responsibility Pattern:");
        LoggerService loggerService = new LoggerService();
        loggerService.logMessage(LoggerService.INFO, "This is an information log.");
        loggerService.logMessage(LoggerService.ERROR, "This is an error log.");

        // Template Method Pattern - Defines the skeleton of an algorithm and allows subclasses to fill in specific steps
        System.out.println("\nTemplate Method Pattern:");
        GameService gameService = new GameService();
        gameService.playGame("Cricket");  // Template method plays the game (common steps defined)
        gameService.playGame("Football");

        // State Pattern - Changes the behavior of an object based on its internal state
        System.out.println("\nState Pattern:");
        PlayerService playerService = new PlayerService();
        playerService.play("Start"); // Change state to Start
        playerService.play("Stop");  // Change state to Stop

        // Mediator Pattern - Ensures that objects communicate through a mediator, reducing dependencies
        System.out.println("\nMediator Pattern:");
        ChatService chatService = new ChatService();
        chatService.chat("Alice", "Hello, Everyone!");  // Mediator handles user communication

        // Visitor Pattern - Allows adding new operations to objects without modifying their classes
        System.out.println("\nVisitor Pattern:");
        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.addItems();  // Adds items and performs operations without changing item classes
    }
}


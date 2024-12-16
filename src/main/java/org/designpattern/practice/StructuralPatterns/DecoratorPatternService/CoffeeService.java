package org.designpattern.practice.StructuralPatterns.DecoratorPatternService;

public class CoffeeService {
    public void prepareCoffee() {
        // Start with a basic coffee, then dynamically add milk and sugar
        Coffee basicCoffee = new BasicCoffee();
        basicCoffee = new MilkDecorator(basicCoffee);  // Add milk
        basicCoffee = new SugarDecorator(basicCoffee); // Add sugar
        System.out.println(basicCoffee.getDescription() + " -> $" + basicCoffee.getCost());
    }
}

interface Coffee {
    String getDescription();
    double getCost();
}

class BasicCoffee implements Coffee {
    public String getDescription() {
        return "Basic Coffee";
    }

    public double getCost() {
        return 5.0;  // Base cost for basic coffee
    }
}

// Decorator class that adds features to coffee dynamically
class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public double getCost() {
        return coffee.getCost();
    }
}

// Concrete decorator classes that add specific features
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public double getCost() {
        return coffee.getCost() + 2.0;
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    public double getCost() {
        return coffee.getCost() + 1.0;
    }
}

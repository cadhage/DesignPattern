package org.designpattern.practice.BehavioralPatterns.VisitorPatternService;

public class ShoppingCartService {
    public void addItems() {
        Book book = new Book("Java Programming", 30);
        Fruit fruit = new Fruit("Apple", 1.5);

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        book.accept(visitor);  // Accept the visitor for Book
        fruit.accept(visitor); // Accept the visitor for Fruit
    }
}

interface ShoppingCartVisitor {
    void visit(Book book);
    void visit(Fruit fruit);
}

class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    public void visit(Book book) {
        System.out.println("Book: " + book.getName() + " costs $" + book.getPrice());
    }

    public void visit(Fruit fruit) {
        System.out.println("Fruit: " + fruit.getName() + " weighs " + fruit.getWeight() + "kg");
    }
}

interface Item {
    void accept(ShoppingCartVisitor visitor);
}

class Book implements Item {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void accept(ShoppingCartVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Fruit implements Item {
    private String name;
    private double weight;

    public Fruit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void accept(ShoppingCartVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}

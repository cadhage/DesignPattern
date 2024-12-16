package org.designpattern.practice.CreationalPatterns.Prototype;

// Prototype Interface
abstract class Prototype implements Cloneable {
    private String type;

    public Prototype(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Prototype clone() {
        try {
            return (Prototype) super.clone(); // Shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

// Concrete Prototype
class ConcretePrototype extends Prototype {
    public ConcretePrototype(String type) {
        super(type);
    }

    @Override
    public String toString() {
        return "Prototype Type: " + getType();
    }
}

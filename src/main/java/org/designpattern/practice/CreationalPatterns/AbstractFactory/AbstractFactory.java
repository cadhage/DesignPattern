package org.designpattern.practice.CreationalPatterns.AbstractFactory;
// Abstract Factory
interface AbstractFactory {
    Shape createShape();
}

// Concrete Factories
class CircleFactory implements AbstractFactory {
    public Shape createShape() {
        return new Circle();
    }
}

class RectangleFactory implements AbstractFactory {
    public Shape createShape() {
        return new Rectangle();
    }
}

// Factory Producer
class FactoryProducer {
    public static AbstractFactory getFactory(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new CircleFactory();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RectangleFactory();
        }
        return null;
    }
}

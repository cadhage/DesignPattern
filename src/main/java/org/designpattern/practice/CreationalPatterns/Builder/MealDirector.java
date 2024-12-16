package org.designpattern.practice.CreationalPatterns.Builder;

import java.util.ArrayList;
import java.util.List;

// Product Class
class Meal {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public String toString() {
        return "Meal includes: " + items;
    }
}

// Builder Interface
interface MealBuilder {
    Meal prepareMeal();
}

// Concrete Builder
class VegMealBuilder implements MealBuilder {
    public Meal prepareMeal() {
        Meal meal = new Meal();
        meal.addItem("Veg Burger");
        meal.addItem("Coke");
        return meal;
    }
}

// Director
class MealDirector {
    public Meal constructMeal(MealBuilder builder) {
        return builder.prepareMeal();
    }
}

package ru.job4j.oop.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String EXTRA_CHEESE = "ExtraCheese";

    @Override
    public String name() {
        return super.name() + " " + EXTRA_CHEESE;
    }
}

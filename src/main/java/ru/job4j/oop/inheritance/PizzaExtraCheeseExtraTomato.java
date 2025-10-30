package ru.job4j.oop.inheritance;

public class PizzaExtraCheeseExtraTomato extends Pizza {
    private static final String EXTRA_TOMATO = "ExtraTomato";

    @Override
    public String name() {
        return super.name() + " " + EXTRA_TOMATO;
    }

}

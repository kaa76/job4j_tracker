package ru.job4j.oop.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat1();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        Cat1.staticInvoke();

        cat.staticInvoke();
        Animal other = null;
        other.staticInvoke();
        Cat1 kitty = new Cat1();
        kitty.staticInvoke();
    }
}

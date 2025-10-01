package ru.job4j.oop;

public class Student {

    public void music(String lyrics) {
        System.out.println("I can sing a song : " + lyrics);
    }

    public void sing() {
        System.out.println("I want to believe");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "Tra la la";
        petya.music(song);
        petya.music(song);
        petya.music(song);
        petya.sing();
        petya.sing();
    }
}
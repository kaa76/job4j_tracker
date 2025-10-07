package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        int tmp = Max.max(middle, right);
        return left > tmp ? left : tmp;
    }

    public static int max(int one, int two, int three, int four) {
        int tmp = Max.max(two, three, four);
        return one > tmp ? one : tmp;
    }

    public static int summation(int first, int second) {
        return first + second;
    }
}
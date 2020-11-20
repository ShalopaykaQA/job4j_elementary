package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("So many rubles is " + euro + " euro");
        int doll = Converter.rubleToDollar(1200);
        System.out.println("So many rubles is " + doll + " doll");

    }
}




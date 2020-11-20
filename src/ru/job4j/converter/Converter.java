package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2.  Test result : " + passed);
        int in1 = 1200;
        int expected1 = 20;
        int out1 = Converter.rubleToDollar(in1);
        boolean passed1 = out1 == expected1;
        System.out.println("1200 rubles are 20.  Test result : " + passed1);

    }
}




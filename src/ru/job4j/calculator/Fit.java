package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double manHeight) {

        return (manHeight - 100) * 1.15;
    }

    public static double womanWeight(double womanHeight) {

        return (womanHeight - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight (187);
        System.out.println("This person's ideal weight is up to " + man + " kg");
       double woman = Fit.womanWeight (157);
        System.out.println("This person's ideal weight is up to " + woman + " kg");
    }

}

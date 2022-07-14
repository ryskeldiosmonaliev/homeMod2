package com.company;

public class Curcle {
    public static final double PI=3.14d;
    public static double radius;

    static double area(){
        double area = PI*(Math.pow(radius,2));
        return area;
    }
    static double curcumferense(){
        double curcumferense = 2*PI*radius;
        return curcumferense;

    }
}

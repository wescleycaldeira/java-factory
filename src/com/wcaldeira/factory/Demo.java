package com.wcaldeira.factory;

public class Demo {

    public static void main(String[] args) {
        final Point polarPoint = Point.Factory.newPolarPoint(1, 2);
        final Point cartesianPoint = Point.Factory.newCartesianPoint(2, 3);

        System.out.println(polarPoint);
        System.out.println(cartesianPoint);
    }
}

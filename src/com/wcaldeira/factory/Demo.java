package com.wcaldeira.factory;

public class Demo {

    public static void main(String[] args) {
        final Point polarPoint = Point.Factory.newPolarPoint(1, 2);
        final Point cartesianPoint = Point.Factory.newCartesianPoint(2, 3);

        System.out.println(polarPoint);
        System.out.println(cartesianPoint);

        final Point cartesianFactory = PointFactory.newCartesian(4, 5);
        final Point polarFactory = PointFactory.newPolarPoint(4, 5);

        System.out.println("---------------------");
        System.out.println(cartesianFactory);
        System.out.println(polarFactory);
    }
}

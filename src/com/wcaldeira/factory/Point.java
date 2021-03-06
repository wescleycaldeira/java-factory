package com.wcaldeira.factory;

public class Point {

    private double x;
    private double y;

    protected Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static class Factory{
        public static Point newCartesianPoint(double x, double y){
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta){
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

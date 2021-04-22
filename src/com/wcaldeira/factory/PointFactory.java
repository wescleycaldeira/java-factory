package com.wcaldeira.factory;

public class PointFactory {

    public static Point newCartesian(double x, double y){
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta){
        return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
    }
}

package com.example.model;

/**
 * Created by krzychol99 on 2016-12-27.
 */
public class Point {
    private double coordinateX;
    private double coordinateY;

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }
    public Point(){}

    public Point(double coordinateX, double coordinateY){
        this.setCoordinateX(coordinateX);
        this.setCoordinateY(coordinateY);
    }
}

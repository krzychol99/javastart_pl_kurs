package com.example.controller;

import com.example.model.Point;

/**
 * Created by krzychol99 on 2016-12-27.
 */
public class PointController {
    public void addX(Point p){
        p.setCoordinateX(p.getCoordinateX() + 1);
    }
    public void minusX(Point p){
        p.setCoordinateX(p.getCoordinateX() - 1);
    }
    public void addY(Point p){
        p.setCoordinateY(p.getCoordinateY() + 1);
    }
    public void minusY(Point p){
        p.setCoordinateY(p.getCoordinateY() - 1);
    }
}

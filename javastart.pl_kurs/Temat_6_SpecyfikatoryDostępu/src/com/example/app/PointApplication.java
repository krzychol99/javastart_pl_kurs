package com.example.app;

import com.example.controller.PointController;
import com.example.model.Point;
import java.util.Scanner;

/**
 * Created by krzychol99 on 2016-12-27.
 */
public class PointApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter points X and Y");
        System.out.println("Enter point X: ");
        double pX = scanner.nextDouble();

        System.out.println("Enter point Y: ");
        double pY = scanner.nextDouble();

        scanner.nextLine();
        scanner.close();

        Point point = new Point(pX,pY);
        PointController pointControl = new PointController();

            System.out.println("Points: (" + point.getCoordinateX() +";"+point.getCoordinateY()+")");
            pointControl.addX(point);
            System.out.println("Points addX: (" + point.getCoordinateX() +";"+point.getCoordinateY()+")");
            pointControl.addY(point);
            System.out.println("Points addY: (" + point.getCoordinateX() +";"+point.getCoordinateY()+")");
            pointControl.minusX(point);
            System.out.println("Points minusX: (" + point.getCoordinateX() +";"+point.getCoordinateY()+")");
            pointControl.minusY(point);
            System.out.println("Points minusY: (" + point.getCoordinateX() +";"+point.getCoordinateY()+")");

    }
}

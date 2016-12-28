package com.example.app;

import com.example.controller.PointController;
import com.example.model.Point;
import java.util.Scanner;

/**
 * Created by krzychol99 on 2016-12-27.
 */
public class PointApplication {
    public static final int ADD_X = 0;
    public static final int ADD_Y = 1;
    public static final int MINUS_X = 2;
    public static final int MINUS_Y = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter points X and Y");
        System.out.println("Enter point X: ");
        double pX = scanner.nextDouble();

        System.out.println("Enter point Y: ");
        double pY = scanner.nextDouble();

        scanner.nextLine();

        Point point = new Point(pX,pY);
        PointController pointControl = new PointController();

            System.out.println("Points: (" + point.getCoordinateX() +";"+point.getCoordinateY()+")");
        System.out.println("Belowe point control options. Please, select one option:\n"
                            + ADD_X + " - Points addX,\n"
                            + ADD_Y + " - Points addY,\n"
                            + MINUS_X + " - Points minusX,\n"
                            + MINUS_Y + " - Points minusY.");
        int option = scanner.nextInt();

        switch (option){
            case ADD_X:
                pointControl.addX(point);
                System.out.println("Points addX: (" + point.getCoordinateX() +";"+point.getCoordinateY()+")");
                break;
            case ADD_Y:
                pointControl.addY(point);
                System.out.println("Points addY: (" + point.getCoordinateX() +";"+point.getCoordinateY()+")");
                break;
            case MINUS_X:
                pointControl.minusX(point);
                System.out.println("Points minusX: (" + point.getCoordinateX() +";"+point.getCoordinateY()+")");
                break;
            case MINUS_Y:
                pointControl.minusY(point);
                System.out.println("Points minusY: (" + point.getCoordinateX() +";"+point.getCoordinateY()+")");
                break;
            default:
                System.out.println("Incorrect type of data, please try again.");
        }
        scanner.close();

    }
}

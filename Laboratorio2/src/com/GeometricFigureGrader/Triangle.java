package com.GeometricFigureGrader;

import java.util.*;

public class Triangle implements geometricFigures {

    public Triangle() {
        Scanner inMeasure = new Scanner (System.in);
        System.out.print("\u001B[30m" + "Ingrese la unidad de medida: ");
        UnitOfMeasurement = inMeasure.nextLine ();
        
        Scanner side1 = new Scanner (System.in);
        System.out.print("Ingrese el lado 1 en " + UnitOfMeasurement.toLowerCase() + " : ");
        Side1 = side1.nextInt();
        
        Scanner side2 = new Scanner (System.in);
        System.out.print("Ingrese el lado 2 en " + UnitOfMeasurement.toLowerCase() + " : ");
        Side2 = side1.nextInt();
        
        Scanner side3 = new Scanner (System.in);
        System.out.print("Ingrese el lado 3 en " + UnitOfMeasurement.toLowerCase() + " : ");
        Side3 = side3.nextInt();
        
        this.calculateArea(Side1);
        this.calculatePerimeter(Side1);
        System.out.println("Coordenada punto 1: " + Side1);
        System.out.println("Coordenada punto 2: " + Side2);
        System.out.println("Coordenada punto 3: " + Side3);
    }

    public double Side1;
    public double Side2;
    public double Side3;
    public String UnitOfMeasurement;
    public String ColorArea;
    public String MarginColor;

    public void calculateArea(double area) {
        area = (Side1 * Side2) / 2;
        System.out.println("El area del triangulo es: " + area);
    }

    public void calculatePerimeter(double perimeter) {
        perimeter = Side1 + Side2 + Side3;
        System.out.println("El perimetro del triangulo es: " + perimeter);
    }

    public void graderFigure() {
        // TODO implement here
//        return null;
    }

    public void setFigure() {
        // TODO implement here
    }

}
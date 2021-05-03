package com.GeometricFigureGrader;

import java.util.*;

public class Circle implements geometricFigures {

    public Circle() {
        
        Scanner inMeasure = new Scanner (System.in);
        System.out.print("Ingrese la unidad de medida: ");
        UnitOfMeasurement = inMeasure.nextLine ();
        
        Scanner Measure = new Scanner (System.in);
        System.out.print("Ingrese el radio en " + UnitOfMeasurement.toLowerCase() + " : ");
        radius = Measure.nextInt();
        
        this.calculateArea(radius);
        this.calculatePerimeter(radius);
    }

    private double radius;
    private double pi = 3.141594;
    public String UnitOfMeasurement;
    public String ColorArea;
    public String MarginColor;

    public void calculateArea(double area) {
        area = pi * (radius*radius);
        System.out.println("El area del circulo es: " + area);
    }

    public void calculatePerimeter(double perimeter) {
        perimeter = 2 * pi * radius;
        System.out.println("El perimetro del circulo es: " + perimeter);
    }

    public void graderFigure() {
        // TODO implement here
//        return null;
    }

    public void setFigure() {
        // TODO implement here
    }

}
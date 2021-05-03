package com.GeometricFigureGrader;

import java.util.*;

public class Square implements geometricFigures {

    public Square() {
        Scanner inMeasure = new Scanner (System.in);
        System.out.print("Ingrese la unidad de medida: ");
        UnitOfMeasurement = inMeasure.nextLine ();
        
        Scanner Medida = new Scanner (System.in);
        System.out.print("Ingrese el tamaño de los lados en " + UnitOfMeasurement.toLowerCase() + " : ");
        Side = Medida.nextInt();
        
        this.calculateArea(Side);
        this.calculatePerimeter(Side);
        this.graderFigure();
    }

    public double Side;
    public String UnitOfMeasurement;
    public String ColorArea;
    public String MarginColor;

    public void calculateArea(double area) {
        area = Side * Side;
        System.out.println("El area del cuadrado es: " + area);
    }

    public void calculatePerimeter(double perimeter) {
        perimeter = Side * 4;
        System.out.println("El perimetro del cuadrado es: " + perimeter);
    }

    public void graderFigure() {
        String colorBorde="";
        String colorFondo="";
        
        Scanner borderColor = new Scanner (System.in);
        System.out.print("Ingrese el color de bordes: ");
        MarginColor = borderColor.nextLine ();
        
        switch(MarginColor.toLowerCase()){
            case "negro": colorBorde = "\u001B[30m"; break;
            case "rojo": colorBorde = "\u001B[31m"; break;
            case "verde": colorBorde = "\u001B[32m"; break;
            case "amarillo": colorBorde = "\u001B[33m"; break;
            case "azul": colorBorde = "\u001B[34m"; break;
            case "morado": colorBorde = "\u001B[35m"; break;
            case "cyan": colorBorde = "\u001B[36m"; break;
        }
        
        Scanner fontColor = new Scanner (System.in);
        System.out.print("Ingrese el color de fondo: ");
        ColorArea = fontColor.nextLine ();
        
        switch(ColorArea.toLowerCase()){
            case "negro": colorFondo = "\u001B[30m"; break;
            case "rojo": colorFondo = "\u001B[31m"; break;
            case "verde": colorFondo = "\u001B[32m"; break;
            case "amarillo": colorFondo = "\u001B[33m"; break;
            case "azul": colorFondo = "\u001B[34m"; break;
            case "morado": colorFondo = "\u001B[35m"; break;
            case "cyan": colorFondo = "\u001B[36m"; break;
        }
        
        for(int superior=0; superior<6; superior++){
           System.out.print(colorBorde + "*");
        }
        System.out.print(colorBorde + "*\n");
        
        for(int lados=0; lados<2; lados++){
            System.out.print(colorBorde + "*");
            System.out.print(colorFondo + "#####");
            System.out.print(colorBorde + "*\n");
        }
       
        for(int inferior=0; inferior<7; inferior++){
            System.out.print(colorBorde + "*");
        }
    }

    public void setFigure() {
        // TODO implement here
    }

}
package com.GeometricFigureGrader;

import java.util.*;

public class Figures {

    public Figures() {
    }

    public static void main(String[] args) {
        // TODO implement here
        GraderFigureFactory gradeFigure = new GraderFigureFactory();
        
        //1- Círculo con radio 25cm
        System.out.println("---Circulo con radio de 25cm---");
        geometricFigures geometricCircle = gradeFigure.getFigure("CIRCLE");
        geometricCircle.setFigure();
        System.out.println("\n\n");
        
        //2- Imprimir cuadrado de lado 3cm borde color rojo y fondo azul
        System.out.println("---Imprimir cuadrado de lado 3cm borde color rojo y fondo azul---");
        geometricFigures geometricSquare = gradeFigure.getFigure("SQUARE");
        geometricSquare.setFigure();
        System.out.println("\n\n");

        //3- Exportar las coordenadas de un cuadrado con lados 100cm, 76cm y 25cm
        System.out.println("---Exportar las coordenadas de un triangulo con lados 100cm, 76cm y 25cm---");
        geometricFigures geometricTriangle = gradeFigure.getFigure("Triangle");
        geometricTriangle.setFigure();
    }

}
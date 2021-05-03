package com.GeometricFigureGrader;

import java.util.*;

public class GraderFigureFactory {

    public GraderFigureFactory() {
    }

    public geometricFigures getFigure(String typeFigure) {
        // TODO implement here
        switch(typeFigure.toUpperCase()){
            case "CIRCLE": return new Circle();
            case "SQUARE": return new Square();
            case "TRIANGLE": return new Triangle();
            case "RECTANGLE": return new Rectangle();
                
        }
        return null;
    }

}
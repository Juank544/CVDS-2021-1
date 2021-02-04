package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Triangle implements Shape{
    public Triangle(){
        super();
    }

    public int getNumberOfEdges(){
        return 3;
    }
}
    
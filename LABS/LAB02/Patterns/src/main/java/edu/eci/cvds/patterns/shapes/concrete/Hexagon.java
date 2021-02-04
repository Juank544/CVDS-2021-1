package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Hexagon implements Shape{
    public Hexagon(){
        super();
    }

    public int getNumberOfEdges(){
        return 6;
    }
}

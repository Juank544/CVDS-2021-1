package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Quadrilateral implements Shape{
    public Quadrilateral(){
        super();
    }
    
    public int getNumberOfEdges(){
        return 4;
    }
}

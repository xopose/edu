package org.lazer.resources;

public class Box {
    public double width;
    public double height;
    public double depth;
    public Box(double width, double height, double depth){
        this.width=width;
        this.height = height;
        this.depth = depth;
    }
    public Box(double a){
        width = height = depth = a;
    }

    public Box(){
        width = height = depth = -1;

    }

    public double vol(){
        return width * height * depth;
    }
}



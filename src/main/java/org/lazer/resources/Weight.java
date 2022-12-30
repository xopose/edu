package org.lazer.resources;

import org.lazer.resources.Box;

public class Weight extends Box {
    private double weight;

    public Weight(double width, double height, double depth, double weight){
        super(width, height, depth);
        this.weight = weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public void print(){
        System.out.print(width + " " + height + " " + depth + " " + getWeight());
    }
}
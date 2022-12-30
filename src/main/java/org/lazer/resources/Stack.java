package org.lazer.resources;

public class Stack implements IntStack {
    private int[] stck;
    private int counter = -1;

    public Stack(int stck){
        this.stck = new int[stck];
    }

    public void push(int i){
        if(counter==9) System.out.println("overflow");
        else {
            stck[++counter] = i;
        }
    }

    public int pop(){
        if(counter<0){
            System.out.println("free");
            return 0;
        }
        else {
            return stck[counter--];
        }

    }
}

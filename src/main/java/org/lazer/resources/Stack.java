package org.lazer.resources;

public class Stack {
    public int[] stck = new int[10];
    int counter = -1;

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

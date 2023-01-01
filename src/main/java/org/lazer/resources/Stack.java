package org.lazer.resources;

public class Stack implements IntStack {
    private int[] stck;
    private int counter = -1;

    public Stack(int stck){
        this.stck = new int[stck];
    }

    public int getLenght(){
        return stck.length;
    }
    public void push(int i){
        if(counter==stck.length-1){
            int[] buff = new int[stck.length*2];
            for(int a = 0; a< stck.length; a++){
                buff[a]=stck[a];
            }
            stck=buff;
            stck[++counter] = i;
        }
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

    public void clear(){
        for(int a = 0; a< stck.length; a++){
            stck[a]= 0;
        }
        counter=-1;
    }
}

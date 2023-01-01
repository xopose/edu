package org.lazer.resources;

public interface IntStack {
    void push(int i);
    int pop();
    default void clear(){
        System.out.println("метод не реализован");
    }
}

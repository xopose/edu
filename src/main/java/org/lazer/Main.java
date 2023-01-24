package org.lazer;

import org.lazer.resources.*;

import static org.lazer.GetMethDemo.isIn;

class GetMethDemo<T extends Comparable<T>> implements UniInterface<T>{
    private double arg;
    <T extends Number> GetMethDemo(T arg){
        this.arg = arg.doubleValue();
    }
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for (int i=0; i<y.length; i++){
            if (y[i] == x) return true;

        }
        return false;
    }

    @Override
    public T min() {
        return null;
    }

    @Override
    public T max() {
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(isIn(5, arr));
    }
}
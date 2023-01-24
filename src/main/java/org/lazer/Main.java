package org.lazer;

import org.lazer.resources.*;

interface MyNumber<T extends Number>{
    T getValue();
}


public class Main {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println(myNum.getValue());
        myNum = () -> 123L;
        System.out.println(myNum.getValue());
    }
}
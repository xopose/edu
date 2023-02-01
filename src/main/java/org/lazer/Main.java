package org.lazer;

import org.jetbrains.annotations.NotNull;
import org.lazer.resources.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

interface MyFunc<T>{
    MyClass<T> func(T n);
}
class MyClass<T>{
    private T val;
    MyClass(T v) {val = v;}
    T getVal(){ return val;}
}

public class Main {
    public static void main(String[] args){
        MyFunc<Integer> myClass = MyClass<Integer>::new;
        MyClass<Integer> mc = myClass.func(100);
        System.out.println(mc.getVal());
    }
}

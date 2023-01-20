package org.lazer;

import org.lazer.resources.*;

import java.io.*;

class Gen<T extends Number>{
    T ob;
    Gen(T o){
        ob = o;
    }
    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println("ob является типом" + ob.getClass().getName());
    }
}
public class Main {
    public static void main(String[] args){
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
//        Gen<String> sOb;
//        sOb = new Gen<>("sdadadadadgszb");
//        sOb.showType();
    }
}
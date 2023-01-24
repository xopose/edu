package org.lazer;

import org.jetbrains.annotations.NotNull;
import org.lazer.resources.*;

interface MyFunc<T>{
    int func(T[] vals, T v);
}

class MyArrayOps{
    static <T> int countMathing(T[] vals, T v){
        int count = 0;
        for (int i = 0; i<vals.length; i++){
            if(vals[i] == v)
                count++;
        }
        return count;
    };
}

public class Main {
    static <T> int myOp(MyFunc<T> f, T vals[], T v){
        return f.func(vals, v);
    };
    public static void main(String[] args){
        Integer[] vals = {1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 4, 5, 3, 5, 9, 8, 7, 0, 0, 0, 0, 4, 4, 4};
        String[] str = {"one", "two", "three", "two"};
        int count;
        count = myOp(MyArrayOps::<Integer>countMathing, vals, 4);
        System.out.println(count);

        count = myOp(MyArrayOps::<String>countMathing, str, "two");
        System.out.println(count);
    }
}

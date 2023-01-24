package org.lazer;

import org.jetbrains.annotations.NotNull;
import org.lazer.resources.*;

interface StringFunc{
    String func(String n);
}

class MyStringOps{
    String strReverce(String s){
        String result = "";
        for (int i = s.length()-1; i>=0; i--){
            result += s.charAt(i);
        }
        return result;
    }
}

public class Main {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }
    public static void main(String[] args){
        String inStr = "Lambdas add power to Java";
        String outStr;

        MyStringOps myStringOps= new MyStringOps();
        outStr = stringOp(myStringOps::strReverce, inStr);
        System.out.println(outStr);
    }
}

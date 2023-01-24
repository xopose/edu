package org.lazer;

import org.lazer.resources.*;

interface StringFunc{
    String func(String n);
}


public class Main {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        System.out.println("Исходная строка " + inStr);
        outStr = stringOp((str) -> (str.toUpperCase()), inStr);
        System.out.println("строка в верхнем регистре   " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            for (int i=0; i<=str.length()-1; i++){
                if (str.charAt(i)!=' '){
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);
        System.out.println(outStr);


    }
}
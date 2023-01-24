package org.lazer;

import org.lazer.resources.*;

interface Test<T>{
    T test(T n);
}


public class Main {
    public static void main(String[] args) {
        Test<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1; i>=0; i--){
                result +=str.charAt(i);
            }
            return result;
        };
        System.out.println(reverse.test("lambda"));

        Test<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i<=n; i++){
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.test(5));
    }
}
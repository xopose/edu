package org.lazer;

import org.lazer.resources.*;

interface NumericTest{
    boolean test(int n, int d);
}


public class Main {
    public static void main(String[] args) {
        NumericTest isEven = (n, d) -> (n%d)==0;
        if (isEven.test(10, 2)) System.out.println("2 является множителем 10");
        if (isEven.test(9,2)) System.out.println("2 не является множителем 9");
        if (isEven.test(9,3)) System.out.println("3 является множителем 9");
    }
}
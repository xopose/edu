package org.lazer;

import org.lazer.resources.*;

interface DoubleNumericArrayFunc{
    double func(double[] n) throws EmptyArrayExeption;
}


public class Main {
    public static void main(String[] args) throws EmptyArrayExeption {
        double[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        DoubleNumericArrayFunc avg = (n) -> {
            double sum=0;
            if (n.length==0) throw new EmptyArrayExeption();
            for (int i=0; i<n.length; i++){
                sum += n[i];
            }
            return sum / n.length;
        };
        System.out.println(avg.func(values));
        System.out.println(avg.func(new double[0]));
    }
}

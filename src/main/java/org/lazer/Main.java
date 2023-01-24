package org.lazer;

import org.jetbrains.annotations.NotNull;
import org.lazer.resources.*;

interface MyFunc<T>{
    boolean func(T v1, T v2);
}

class HighTemp{
    private int hTemp;
    HighTemp(int hTemp){
        this.hTemp = hTemp;
    }

    boolean sameTemp(HighTemp ht2){
        return hTemp == ht2.hTemp;
    }

    boolean lessThenTemp(HighTemp ht2){
        return hTemp < ht2.hTemp;
    }
}

public class Main {
    /** массив, ссылка на MyFunc, искомое значение
     */
    static <T> int counter(T vals[], MyFunc<T> f, T v){
        int count = 0;
        for (int i = 0; i<vals.length; i++)
            if (f.func(vals[i], v))
                count++;

        return count;
    };
    public static void main(String[] args){
        int count;

        HighTemp[] weekDayHigh = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83)
        };
        count = counter(weekDayHigh, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count);

        HighTemp[] weekDayHigh2 = {
                new HighTemp(34), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13)
        };
        count = counter(weekDayHigh2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println(count);
        count = counter(weekDayHigh, HighTemp::lessThenTemp, new HighTemp(89));
        System.out.println(count);
        count = counter(weekDayHigh2, HighTemp::lessThenTemp, new HighTemp(19));
        System.out.println(count);

    }
}

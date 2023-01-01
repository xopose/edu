package org.lazer;

import org.lazer.resources.*;

public class Main {
    public static void main(String[] args) {
        var myThread_1 = new CurrentThread_2("one");
        var myThread_2 = new CurrentThread_2("two");
        var myThread_3 = new CurrentThread_2("three");
        myThread_1.t.start();
        myThread_2.t.start();
        myThread_3.t.start();
    }
}
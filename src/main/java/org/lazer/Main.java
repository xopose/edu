package org.lazer;

import org.lazer.resources.*;

public class Main {
    public static void main(String[] args) {
        var myThread = new CurrentTread();
        var myThread_2 = new CurrentThread_2();
        myThread_2.NewThread();
        myThread_2.t.start();

        myThread.CurTread();
    }
}
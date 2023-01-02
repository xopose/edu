package org.lazer;

import org.lazer.resources.*;

public class Main {
    public static void main(String[] args) {
        ResumeSuspend ob1 = new ResumeSuspend("one");
        ResumeSuspend ob2 = new ResumeSuspend("two");

        ob1.t.start();
        ob2.t.start();
        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Приостановка потока one");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Возобновление потока one");
            ob2.mySuspend();
            System.out.println("Приостановка потока two");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Возобновление потока two");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
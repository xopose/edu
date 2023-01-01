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

        System.out.println("Поток   " + myThread_1.getName() + "   " + myThread_1.t.isAlive());
        System.out.println("Поток   " + myThread_2.getName() + "   " + myThread_2.t.isAlive());
        System.out.println("Поток   " + myThread_3.getName() + "   " + myThread_3.t.isAlive());

        try{
            System.out.println("Ожидание завершения потоков");
            myThread_1.t.join();
            myThread_2.t.join();
            myThread_3.t.join();
        }
        catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Поток   " + myThread_1.getName() + "   " + myThread_1.t.isAlive());
        System.out.println("Поток   " + myThread_2.getName() + "   " + myThread_2.t.isAlive());
        System.out.println("Поток   " + myThread_3.getName() + "   " + myThread_3.t.isAlive());
        System.out.println("Завершение главного потока");

    }
}
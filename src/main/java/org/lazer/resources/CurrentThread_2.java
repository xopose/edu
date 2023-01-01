package org.lazer.resources;

public class CurrentThread_2 extends Thread{
    public CurrentThread_2(){
        super("Demo Thread");
        System.out.println("Дочерний поток: " + this);

    }
    public void run(){
        try{
            for (int i = 5; i>0; i--){
                System.out.println("Дочерний поток:     " + i);
                Thread.sleep(500);

            }
        }
        catch (InterruptedException e){
            System.out.println("Поток прерван");
        }
        System.out.println("Завершение дочернего потока");

    }
}

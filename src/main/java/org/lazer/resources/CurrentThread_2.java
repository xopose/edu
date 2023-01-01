package org.lazer.resources;

public class CurrentThread_2 implements Runnable{
    public Thread t;
    String name;
    public CurrentThread_2(String name){
        this.name = name;
        t = new Thread(this, name);
        System.out.println("Дочерний поток: " + t);

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

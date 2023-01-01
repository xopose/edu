package org.lazer.resources;

public class CurrentTread {
    public void CurTread(){
        Thread t = Thread.currentThread();
        t.setName("Thread_1");
        System.out.println("Главный поток:      " + t);
        try{
            for (int i = 5; i>0; i--){
                System.out.println("Главный поток:      " + i);
                Thread.sleep(1000);
            }

        }
        catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
    }

}

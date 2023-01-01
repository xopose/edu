package org.lazer.resources;

public class CurrentTread {
    public void CurTread(){
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток:  " + t);
        t.setName("Thread_1");
        System.out.println("Новое имя:      " + t);
        try{
            for (int i = 5; i>0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }

        }
        catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
    }

}

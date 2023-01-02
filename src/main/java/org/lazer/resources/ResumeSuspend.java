package org.lazer.resources;

public class ResumeSuspend implements Runnable {
    String name;
    public Thread t;
    boolean flag;
    public ResumeSuspend(String name){
        this.name = name;
        t = new Thread(this, name);
        System.out.println("Новый поток:    " + t);
        flag = false;
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i>0; i--){
                System.out.println(name + "  " + i);
                Thread.sleep(200);
                synchronized (this){
                    while (flag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " Прерван"+ e);
        }
        System.out.println(name + " завершается.");

    }
    public synchronized void mySuspend(){
        flag = true;
    }
    public synchronized void myResume(){
        flag = false;
        notify();
    }

}

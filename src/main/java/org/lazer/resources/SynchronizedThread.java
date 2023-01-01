package org.lazer.resources;

class Callme{
    void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println("Прерван");
        }
        System.out.println("]");
    }

}

class Caller implements Runnable{
    String msg;
    final Callme target;
    Thread t;
    Caller(Callme target, String msg){
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
    }
    public void run(){
        synchronized (target){
            target.call(msg);
        }
    }
}

class SynchronizedThread {
    public static void main(String[] args){
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "world");

        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        try{
            System.out.println("Ожидание завершения потоков");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Завершение главного потока");
    }
}

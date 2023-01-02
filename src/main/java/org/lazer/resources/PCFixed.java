package org.lazer.resources;

class Q{
    int n;
    boolean valueSet = false;
    synchronized void get(){
        while (!valueSet){
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Получено:   " + n);
        valueSet = false;
        notify();
    }

    synchronized void put(int n){
        while (valueSet){
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Отправлено:    " + n);
        notify();
    }
}

class Producer implements Runnable{
    Q q;
    Thread t;
    Producer(Q q){
        this.q = q;
        t = new Thread(this, "Производитель");
    }

    @Override
    public void run() {
        int i = 0;
        while (i<101){
            q.put(i++);
        }
    }
}

class Consumer implements Runnable{
    Q q;
    Thread t;
    Consumer(Q q){
        this.q = q;
        t = new Thread(this, "Потребитель");
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}

/**
 * Тут мы реализовали синхронную очередь
 * между производителем и получателем<p>
 *
 */
public class PCFixed {
    public static void main(String[] args){
        Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);

        producer.t.start();
        consumer.t.start();
    }
}

package Experiment4;

class T1Class implements Runnable{
    long click = 0;
    Thread t;
    private volatile boolean running = true;

    public T1Class(int p){
        t = new Thread(this);
        t.setPriority(p);
    }

    public void run() {
        while (running){
            click++;
        }
    }

    public void stop(){
        running = false;
    }

    public void start(){
        t.start();
    }
}

public class Driver {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        T1Class t1 = new T1Class(Thread.NORM_PRIORITY + 2);
        T1Class t2 = new T1Class(Thread.NORM_PRIORITY - 2);
        T1Class t3 = new T1Class(Thread.NORM_PRIORITY + 3);
        T1Class t4 = new T1Class(Thread.NORM_PRIORITY - 3);
        T1Class t5 = new T1Class(Thread.NORM_PRIORITY + 4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println("T1 Alive Status: " + t1.t.isAlive());
        System.out.println("T2 Alive Status: " + t2.t.isAlive());
        System.out.println("T3 Alive Status: " + t3.t.isAlive());
        System.out.println("T4 Alive Status: " + t4.t.isAlive());
        System.out.println("T5 Alive Status: " + t5.t.isAlive());

        try {
            t5.t.sleep(200);
            t3.t.sleep(200);
        } catch (Exception e) {
            System.out.println("Main Thread Interrupted");
        }

        t1.stop();
        t2.stop();
        t3.stop();
        t4.stop();
        t5.stop();

        try {
            System.out.println("Waiting for Threads to Finish");
            t1.t.join();
            t2.t.join();
            t3.t.join();
            t4.t.join();
            t5.t.join();
        }catch (Exception e){
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("Priority of T1: " + t1.t.getPriority());
        System.out.println("Priority of T2: " + t2.t.getPriority());
        System.out.println("Priority of T3: " + t3.t.getPriority());
        System.out.println("Priority of T4: " + t4.t.getPriority());
        System.out.println("Priority of T5: " + t5.t.getPriority());

        System.out.println("T1 Alive Status: " + t1.t.isAlive());
        System.out.println("T2 Alive Status: " + t2.t.isAlive());
        System.out.println("T3 Alive Status: " + t3.t.isAlive());
        System.out.println("T4 Alive Status: " + t4.t.isAlive());
        System.out.println("T5 Alive Status: " + t5.t.isAlive());

        System.out.println("Main Thread Exiting");
    }
}

package Experiment1;

class Base{
    Base(){
        System.out.println("Base Class is Extended here");
    }
}

class ThreadExtend extends Thread{
    ThreadExtend(){
        System.out.println("ThreadExtend constructed");
    }
    public void run()
    {
        System.out.println("Run method executed by child Thread of ThreadExtend Class");
    }
}

class RunImplement extends Base implements Runnable{
    RunImplement(){
        super();
        System.out.println("RunImplement constructed");
    }
    public void run()
    {

        System.out.println("Run method executed by child Thread of RunImplement Class");
    }
}

public class Driver {
    public static void main(String[] args) {
        ThreadExtend te = new ThreadExtend();
        te.start();
        RunImplement ri = new RunImplement();
        Thread t2 = new Thread(ri);
        t2.start();
    }
}

package Experiment2;

class Odd extends Thread{
    Odd(){
        Thread t = new Thread(this);
        start();
    }

    public void run() {
        try{
            for (int i = 1; i < 10; i+=2){
                System.out.println("Odd Thread: " + i);
            }
            Thread.sleep(100);
        }catch (Exception e){
            System.out.println("Thread Interrupted");
        }
    }
}

class Even extends Thread{
    Even(){
        Thread t = new Thread(this);
        start();
    }

    public void run() {
        try{
            for (int i = 0; i < 10; i+=2){
                System.out.println("Even Thread: " + i);
            }
            Thread.sleep(100);
        }catch (Exception e){
            System.out.println("Thread Interrupted");
        }
    }
}

public class Driver {
    public static void main(String[] args) {
        Even e = new Even();
        Odd o = new Odd();
    }

}

package Experiment3;

abstract class Worker {
    String name;
    float rate;
    Worker(String name, float rate){
        this.name = name;
        this.rate = rate;
    }
    void printDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Rate: " + rate);
    }
}

class DailyWorker extends Worker{
    DailyWorker(String name, float rate){
        super(name, rate);
    }
    public void comPay(int hours){
        printDetails();
        System.out.println("Salary:" + rate * hours);
    }
}

class SalariedWorker extends Worker {
    private int hours = 40;
    SalariedWorker(String name, float rate){
        super(name, rate);
    }
    public void comPay(){
        printDetails();
        System.out.println("Salary:" + rate*hours);
    }
}
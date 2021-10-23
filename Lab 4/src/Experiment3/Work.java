package Experiment3;

public class Work {
    public static void main(String[] args) {
        DailyWorker d = new DailyWorker("Daily worker", 75);
        SalariedWorker s = new SalariedWorker("Salaried worker", 130);
        d.comPay(45);
        s.comPay();
    }
}

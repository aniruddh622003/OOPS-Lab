package Experiment2.Balance;

public class Account {
    private int accountBalance = 0;
    public Account(int balance){
        this.accountBalance = balance;
    }
    public void Display_Balance(){
        System.out.println("Account Balance is " + this.accountBalance);
    }
}

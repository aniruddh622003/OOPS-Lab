package Experiment2;

import Experiment2.Balance.Account;

public class Main {
    public static void main(String[] args) {
        System.out.println("Created new account with balance 600");
        Account ac = new Account(600);
        ac.Display_Balance();
    }
}

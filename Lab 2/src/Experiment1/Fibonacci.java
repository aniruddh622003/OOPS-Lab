package Experiment1;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        System.out.println("Prints fibonacci series till 12 terms");
        for (int i = 0; i < 10; i++){
            System.out.print(n1 + " ");
            int temp = n2;
            n2 = n1 + n2;
            n1 = temp;
        }
    }
}



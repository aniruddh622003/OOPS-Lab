package Experiment4;

import java.util.Scanner;

public class Main implements Operations {
    @Override
    public int division(int a, int b) {
        return a/b;
    }

    @Override
    public int modulus(int a, int b) {
        return a%b;
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter a big number: ");
        int a = in.nextInt();
        System.out.print("Enter a small number: ");
        int b = in.nextInt();
        Operations op = new Main();
        System.out.println(a + "/" + b + ":-");
        System.out.println("Dividend: " + op.division(a, b));
        System.out.println("Remainder: " + op.modulus(a, b));
    }
}

package Experiment5;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Calc {
    static long power(final int n, final int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        return (long)pow(n, p);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = in.nextInt();
        System.out.print("Enter power: ");
        int b = in.nextInt();
        try {
           System.out.println("Result = " + Calc.power(a,b));
        }catch (Exception e){System.out.println(e);}
    }
}

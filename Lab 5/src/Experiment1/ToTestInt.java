package Experiment1;

import java.util.Scanner;

public class ToTestInt {
    public static void main(String[] args) {
        test t = new Arithmetic();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = in.nextInt();
        System.out.println("Square of entered number: " + t.square(a));
    }
}




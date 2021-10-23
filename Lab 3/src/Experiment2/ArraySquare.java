package Experiment2;

import java.util.Scanner;

public class ArraySquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Enter numbers: ");
        for(int i=0 ; i < 10 ; i++)
        {
            num[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Element- " + num[i] + ", Square- " + num[i] * num[i]);
        }
    }
}

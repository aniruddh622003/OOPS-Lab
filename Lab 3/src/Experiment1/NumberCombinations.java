package Experiment1;

import java.util.Scanner;

public class NumberCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        System.out.println("Enter numbers: ");
        for(int i=0 ; i<3 ; i++)
        {

            num[i] = sc.nextInt();
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    if (i != j && j != k && k != i) {
                        System.out.println(num[i] + "" + num[j] + "" + num[k]);
                    }
                }
            }
        }
    }
}




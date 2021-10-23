package Experiment3;

import java.util.Scanner;

public class NumToMonth {
    public static void main(String[] args) {
        String[] MonthArr = {"January", "February", "March",
                "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println(MonthArr[num - 1]);
    }
}




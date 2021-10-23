package Experiment3;

import java.util.Scanner;

class LessThan500 extends Exception{
    LessThan500(){
        super("Number entered is less than 500");
    }
}

public class LessThan500Exception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int num = in.nextInt();
            if (num < 500) throw new LessThan500();
            System.out.println("Everything is completely fine");
        }catch (LessThan500 e){System.out.println(e);}
    }
}

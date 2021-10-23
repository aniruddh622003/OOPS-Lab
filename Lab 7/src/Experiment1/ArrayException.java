package Experiment1;

import java.util.Scanner;

class StudentInfo {
    int roll_no[] = new int[10];
    String names[] = new String[10];

    StudentInfo(){
        for (int i = 0; i < 10; i++){
            roll_no[i] = 1000+i+1;
            names[i] = "Student " + (i+1);
        }
    }

    void displayGivenRows(int rows) throws ArrayIndexOutOfBoundsException {
        System.out.println("--------------------");
        System.out.println("STUDENT INFO");
        System.out.println("--------------------");
        System.out.println("Roll No.\tStudent Name");
        for (int i = 0; i < rows; i++){
            System.out.println(roll_no[i] + "\t\t" + names[i]);
        }
    }
}

public class ArrayException {
    public static void main(String[] args) {
        StudentInfo si = new StudentInfo();
        try {
            System.out.print("Enter number of rows to be displayed: ");
            Scanner in = new Scanner(System.in);
            int row = in.nextInt();
            si.displayGivenRows(row);
        }
        catch (ArrayIndexOutOfBoundsException a){System.out.println("Only 10 student records are present");}
        catch (Exception e){System.out.println("Error e");}
    }
}

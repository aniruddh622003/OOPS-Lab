package Experiment5;

import java.util.Scanner;

public class Organisation {
    public static void main(String[] args) {
        System.out.println("--------");

        Employee e = new Employee("Employee", 101, 1000);
        System.out.println("Name: " + e.getName());
        System.out.println("Salary before increment: " + e.getSalary());
        System.out.print("Enter increment percent: ");
        Scanner in = new Scanner(System.in);
        float inc = in.nextFloat();
        e.increaseSalary(inc);
        System.out.println("Salary after increment: " + e.getSalary());

        System.out.println("--------");

        Manager m = new Manager("Manager", 201, 2000, "HR");
        System.out.println("Name: " + m.getName());
        System.out.println("Salary: " + m.getSalary());
        System.out.println("Department: " + m.getDepartment());
    }
}

package Experiment5;

import Experiment3.Work;

class Employee {
    String name;
    int empid;
    float salary;

    Employee(String name, int empid, float salary){
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
    String getName(){
        return this.name;
    }

    float getSalary(){
        return this.salary;
    }

    void increaseSalary(float percent){
        float increment = salary * (percent / 100);
        this.salary += increment;
    }
}



class Manager extends Employee{
    String department;
    Manager(String name, int empid, float salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }
    String getDepartment(){
        return this.department;
    }
}

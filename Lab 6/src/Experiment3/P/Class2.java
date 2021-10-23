package Experiment3.P;

public class Class2 {
    public static void main(String[] args) {
        System.out.println("Running from Class 2");
        Class1 c1 = new Class1();
        c1.defaultMethod();
        c1.protectedMethod();
        c1.publicMethod();
    }
}

package Experiment3.P;

public class Class1 {
    public static void main(String[] args) {
        System.out.println("Running from Class 1");
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }

    private static void privateMethod(){
        System.out.println("I am private method");
    }

    static void defaultMethod(){
        System.out.println("I am default method");
    }

    protected static void protectedMethod(){
        System.out.println("I am protected method");
    }

    public static void publicMethod() {
        System.out.println("I am public method");
    }
}

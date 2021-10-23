package Experiment2;

public class MyClass implements A{
    public void meth1(){
        System.out.println("Method 1 invoked");
    }
    public void meth2(){
        System.out.println("Method 2 invoked");
    }

    public static void main(String[] args) {
        A a = new MyClass();
        a.meth1();
        a.meth2();
    }
}


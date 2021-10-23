package Experiment5;

public class Main implements StackInterface{
    @Override
    public int pop() {
        System.out.println("Pop Method invoked");
        return 0;
    }

    @Override
    public void push(int a) {
        System.out.println("Pushed " + a + " to Stack");
    }

    @Override
    public void display() {
        System.out.println("Dummy Print Method");
    }

    public static void main(String[] args) {
        StackInterface si = new Main();
        si.pop();
        si.push(1);
        si.display();
    }
}

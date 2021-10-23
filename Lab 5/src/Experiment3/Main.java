package Experiment3;

public class Main implements MyConstants{

    float areaOfCircle(float radius){
        return pi * (radius * radius);
    }

    boolean checkGoldenRatio(float height, float width){
        float ratio = height/width;
        if (ratio == goldRatio) return true;
        if (1/ratio == goldRatio) return true;
        return false;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println();
        System.out.println("Area of circle with radius 5 is " + m.areaOfCircle(5));
        System.out.println();
        System.out.println("Width : 1, Height: 1.6");
        System.out.println("Golden ratio condition met: " + m.checkGoldenRatio(1, 1.6f));
    }
}

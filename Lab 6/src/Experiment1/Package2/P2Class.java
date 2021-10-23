package Experiment1.Package2;

import Experiment1.Package1.P1Class;

public class P2Class {
    public static void main(String[] args) {
        System.out.println("Executed from package 2");
        P1Class p1 = new P1Class();
    }
}

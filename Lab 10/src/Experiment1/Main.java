package Experiment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        Iterator<String> it = arrl.iterator();
        System.out.println("Printing all elements in order");
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Original List -> " + arrl);
        ArrayList arrlclon = (ArrayList)arrl.clone();
        System.out.println("Duplicate List -> " + arrlclon);
        Collections.reverse(arrl);
        System.out.println(" ");
        System.out.println("Reverse List -> " + arrl);
    }
}

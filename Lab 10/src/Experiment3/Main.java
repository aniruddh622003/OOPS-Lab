package Experiment3;

import java.util.HashSet;
import java.util.Objects;

class HsObject{
    private int x;
    public HsObject(int x){
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HsObject hsObject = (HsObject) o;
        return x == hsObject.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }

    @Override
    public String toString() {
        return "HsObject{" +
                "x=" + x +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("First");
        hs1.add("Second");
        System.out.println("Hash Set 1: " + hs1);
        HashSet<String> hs2 = new HashSet<String>();
        hs2.add("s1");
        hs2.add("s2");
        System.out.println("Hash Set 2: " + hs2);
        hs1.addAll(hs2);
        System.out.println("Hash Set 1 after adding another Collection: " + hs1);
        System.out.println(" ");

        HashSet<HsObject> hsObjects = new HashSet<HsObject>();
        hsObjects.add(new HsObject(1));
        hsObjects.add(new HsObject(2));
        hsObjects.add(new HsObject(3));
        System.out.println(hsObjects);
        HsObject check = new HsObject(2);
        System.out.println("Does set contain key: " + hsObjects.contains(check));
        System.out.println(" ");

        System.out.println("Clearing HsObject Set..");
        hsObjects.clear();
        System.out.println("Set after clearing: " + hsObjects);

    }
}

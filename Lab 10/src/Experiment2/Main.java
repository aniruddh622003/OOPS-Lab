package Experiment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(null, "Null");
        System.out.println("Hash Map: " + map);
        int keytoCheck = 2;
        System.out.println("Does key " + keytoCheck + " exist: " + map.containsKey(keytoCheck));
        String valuetoCheck = "Null";
        System.out.println("Does value " + valuetoCheck + " exist: " + map.containsValue(valuetoCheck));
        Set<Integer> keys = map.keySet();
        System.out.print("Keys: ");
        for (Integer key : keys){
            System.out.print(key + " ");
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("");
        System.out.print("Key Values: ");
        for (Map.Entry<Integer, String> ent: entries){
            System.out.print(ent + " ");
        }
    }
}

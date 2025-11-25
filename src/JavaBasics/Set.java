package JavaBasics;

import java.util.HashMap;

public class Set {
    public static void main(String[] args) {
                /*
        A HashMap stores key-value pairs, which are great when you want to store values and find them by a key
         */
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("HashMap data :" + map);
        System.out.println("HashSet data :" + map.get(1));
        map.put(4, "Four");
        map.remove(2);
        System.out.println("HashMap data :" + map);
    }
}


package Basics;

import java.util.HashMap;

public class HashMapDemo {
    public static <string, integer> void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Nikita", 90);
        map.put("Ishwari", 98);

        System.out.println(map.get("Ishwari"));
        System.out.println("Contains key Nikita: " + map.containsKey("Nikita"));
        System.out.println("Contains value 100: " + map.containsValue(100));
        System.out.println("size of HashMap : " + map.size());
        System.out.println(map.remove("Nikita"));
        System.out.println("All Pairs: " + map.entrySet());
        map.put("Nisha", 90);
        System.out.println("All keys: " + map.keySet());
        System.out.println("All Values : "+map.values());
        System.out.println("IS Empty ?"+ map.isEmpty());
        map.remove("Nisha");
        map.remove("Ishwari");
        System.out.println("Is Empty after using remove method: "+map.isEmpty());
    }
}
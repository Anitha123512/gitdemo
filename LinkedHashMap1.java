import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
        lmap.put("one", 1);
        lmap.put("two", 2);
        lmap.put("three", 3);
        System.out.println(lmap);
//        add one more key value pair
        lmap.put("four", 4);
        System.out.println(lmap);
//        change the value of the key two
        lmap.put("two", 22);
        System.out.println(lmap);
//        size of the map
        System.out.println(lmap.size());
//        get value from key
        System.out.println(lmap.get("one"));
//        get key from value
        Integer value = 4;
        for (Map.Entry<String, Integer> m : lmap.entrySet()) {
            if (m.getValue().equals(value)) {
                System.out.println(m.getKey());
            }
        }
//remove an elementS
        System.out.println(lmap.remove("three"));
System.out.println(lmap);
System.out.println(lmap.replace("one",11));
System.out.println(lmap.containsKey("one"));
System.out.println(lmap.containsKey("five"));
System.out.println(lmap.containsValue(4));
System.out.println(lmap.containsValue(10));
System.out.println(lmap.isEmpty());
System.out.println(lmap.clone());
lmap.clear();

    }
}
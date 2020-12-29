import com.sun.jmx.remote.util.OrderClassLoaders;

import java.util.LinkedHashMap;

public class LinkedHashMap2 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
        lmap.put("one", 1);
        lmap.put("two", 2);
        lmap.put("three", 3);
        System.out.println(lmap);

        LinkedHashMap<String, Integer> lmap1 = new LinkedHashMap<>(5);
        lmap1.put("four", 4);
        lmap1.put("five", 5);
        lmap1.put("six", 6);
        System.out.println(lmap1);

        LinkedHashMap<String, Integer> lmap2 = new LinkedHashMap<>(2,0.25f);
        lmap2.put("ten", 10);
        lmap2.put("eleven", 11);
        lmap2.put("twelve", 12);
        System.out.println(lmap2);

        LinkedHashMap<String, Integer> lmap3 = new LinkedHashMap<>(5,0.45f,true);
        lmap3.put("one", 1);
        lmap3.put("two", 2);
        lmap3.put("three", 3);
        System.out.println(lmap3);

        LinkedHashMap<String, Integer> lmap4 = new LinkedHashMap<>(lmap2);
        System.out.println(lmap4);

        LinkedHashMap<String, Integer> lmap5 = new LinkedHashMap<>(5,0.45f,false);
        lmap5.put("one", 1);
        lmap5.put("two", 2);
        lmap5.put("three", 3);
        lmap5.put("ten", 10);
        lmap5.put("eleven", 11);
        lmap5.put("twelve", 12);
        System.out.println(lmap5);

    }
}

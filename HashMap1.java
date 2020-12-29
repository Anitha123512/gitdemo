import java.awt.*;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("1","null");
        map.put("2","null");
        map.put(null,"null");
        System.out.println(map);
        HashMap<Integer,String> map1=new HashMap<>(5);
        map1.put(10,"Anji");
        map1.put(20,"Reddi");
        map1.put(30,"Sekhar");
        System.out.println(map1);
        HashMap<String,String> map2=new HashMap<>(3,0.5f);
        map2.put("Ani","23");
        map2.put("Anu","25");
        System.out.println(map2);
        map2.put("Reddi","26");
        map2.put("Sekhar","30");
        System.out.println(map2);
        Map<Integer,String> map3=new HashMap<>();
        map3.put(1,"one");
        map3.put(2,"two");
        System.out.println(map3);
    }
}

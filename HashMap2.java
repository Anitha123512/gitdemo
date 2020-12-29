import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "null");
        map.put(2, "Ani");
        map.put(3, "anitha");
        System.out.println(map);
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(5,"Reddi");
        map1.putAll(map);
        System.out.println(map1);
    }
}

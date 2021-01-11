import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {
    public static void main(String[] arg)
    {
        Map<Integer,String>myMap = new HashMap<Integer,String>();

        // enter name/url pair
        myMap.put(1, "India");
        myMap.put(2, "Nepal");
        myMap.put(3, "Maldives");
        myMap.put(4, "SriLanka");

        System.out.println("\tSAARC Member Countries\t");
        System.out.println("\tKEY" + "  " + "\tCOUNTRY" );

        // using iterators
        Iterator<Map.Entry<Integer, String>> map_itr = myMap.entrySet().iterator();

        while(map_itr.hasNext())
        {
            Map.Entry<Integer, String>map_entry = map_itr.next();
            System.out.println("\t" + map_entry.getKey() +
                    "\t" + map_entry.getValue());
        }
    }
}

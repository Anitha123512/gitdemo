import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("Ani");
        list.add("Anitha");
        list.add("Anu");
        Iterator<String>  it=list.iterator();
        System.out.println(it.next());

        ArrayList<String> list1=new ArrayList<>();
        list1.add("Ani");
        list1.add("Anitha");
        list1.add("Anu");
        Iterator<String>  it1=list1.iterator();
        System.out.println(it1.hasNext());

         }
}

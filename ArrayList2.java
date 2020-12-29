import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Ani");
        list.add("Anitha");
        list.add("Anu");
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

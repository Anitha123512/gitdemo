import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ani");
        list.add("Anitha");
        list.add("Anu");
        list.add("reddi");
       // list.add("gowthami");
        //list.add("Ayyappa");

        Iterator<String> it=list.iterator();

        System.out.println(it.hasNext());

        System.out.println(it.next());

        it.remove();

       /* String str = "";
        while (it.hasNext()) {
            str = (String) it.next();
            if (str.equals("reddi")) {
                it.remove();
                //System.out.println("\nThe element Orange is removed");
                break;
            }
        }
*/
        while (it.hasNext()){
        System.out.println(it.next()+ " ");


    }
    }
}

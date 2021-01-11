import com.sun.javafx.scene.control.ReadOnlyUnbackedObservableList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {

    public static void main(String args[])
    {
        List<Integer> numlist = new ArrayList<Integer>();

        // Add Elements to ArrayList
        numlist.add(1);
        numlist.add(3);
        numlist.add(5);
        numlist.add(9);

        // Creatinge a ListIterator
        ListIterator<Integer> list_it = numlist.listIterator();

        System.out.println(list_it.next());

        System.out.println(list_it.hasNext());

        System.out.println(list_it.nextIndex());

        list_it.set(10);

        list_it.add(15);

        System.out.println("Output using forward iteration:");
        while (list_it.hasNext())
            System.out.print(list_it.next()+" ") ;

        System.out.print("\n\nOutput using backward iteration:\n") ;
        while (list_it.hasPrevious())
            System.out.print(list_it.previous()+" ");
    }
}

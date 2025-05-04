package problems.solutions.collectionsApis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    void list() {
        //List, Set, Map
        // ArrayList - Ordered, resizable array, can contain duplicates
        // we can append elements to the list, iterate etc
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(300);
        list.add(0, 200);
        list.addFirst(450);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        for (Integer it : list) {
            System.out.println(it);
        }
        // Iterator method, has methods next, hasNext, remove
        Iterator<Integer> it = list.iterator();
        int value = it.next();
        System.out.println(value);
    }
}

package problems.solutions.collectionsApis;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListExample le = new ListExample();
        le.list();

        //Sets - interface
        Set<ListExample> set = new TreeSet<>();
        for (ListExample value : set) {
            System.out.println(value);
        }

    }
}

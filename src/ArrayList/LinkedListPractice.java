package ArrayList;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("x");
        list.add("y");
        list.add("z");
        System.out.println(list);

        list.add(2,"t");
        System.out.println(list);

        list.remove("t");
        System.out.println(list);

        /*
        Output
        [x, y, z]
        [x, y, t, z]
        [x, y, z]
         */

        Practice2 p3 = new Practice2();
        LinkedList list1 = new LinkedList<>();

    }
}

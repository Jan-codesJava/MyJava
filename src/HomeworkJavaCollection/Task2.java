package HomeworkJavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Task2 {

    /* Create one method takes one int array.
   These methods need to print all unique element from array in descending order.
    Input: [2,3,4,4,7,2,1]
    Output: 7, 4, 3, 2, 1
    */

    public static void UniqueElementsDescOrder(int[] array){
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:array){
            set.add(num);
        }
        System.out.println( set.descendingSet());

        //System.out.println(set);
        ArrayList<Integer> al = new ArrayList<>();
        al.addAll(set);
        set.clear();
        Collections.reverse(al);
        //System.out.println(al);
        for(int i:al){
            System.out.print(" "+i);
        }





    }
    public static void main(String[] args) {
        int [] array = {2,3,4,4,7,2,1};
        UniqueElementsDescOrder(array);

    }

}

package HomeworkJavaCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class Task1 {

    /*
  Create one method takes one int array. These methods need to print all unique elements from array ascending order.
    Input: [2,3,4,4,7,2,1]
    Output: 1, 2, 3, 4, 7
   */
    public static void uniqueElementsAscOrder(int[] array){

        TreeSet<Integer> set = new TreeSet<>();// create new object with TreeSet class
        for(int num:array){
            set.add(num);

        }
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            //System.out.println();
            System.out.print(it.next()+" ");
        }


    }

    public static void main(String[] args) {
        int [] array = {2,3,4,4,7,2,1};
        uniqueElementsAscOrder(array);
    }

}




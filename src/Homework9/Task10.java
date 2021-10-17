package Homework9;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {

        /*
        Create the following array size of 13 and store the following number
        { 4, 4, 5, 12, 6, 7,12 7,1, 1, 2, 2, 3 }
        Print all unique values from UNSORTED array.
        Output:
          3 5 6
        Description
         */

        int arr[] = {4, 4, 5, 12, 6, 7,12, 7,1, 1, 2, 2, 3};

                ArrayList<Integer> uniqueArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {

            int k = 0;
            if (!uniqueArr.contains(arr[i])) {
                uniqueArr.add(arr[i]);
                k++;

                for (int j = i; j < args.length; j++) {
                    if (arr[i] == arr[j]) {
                        k++;
                    }
                }

                System.out.println(arr[i]);
                System.out.println(k);
            }

        }
    }
}


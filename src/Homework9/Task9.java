package Homework9;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {

        /*
        Create the following array size of 13 and store the following number
        {4, 4, 5, 12, 6, 7,12 7,1, 1, 2, 2, 3}
           Print all unique values from this array.
            Output:
            3 5 6
            Description
         */

        int[] arr = {4, 4, 5, 12, 6, 7, 12, 7, 1, 1, 2, 2, 3};
        String repeatedNum = "";
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeatedNum += arr[i];
                    break;
                }
            }
            if (!repeatedNum.contains(arr[i] + "")) {
                System.out.println("unique value is " + arr[i]);
            }

        }
    }
}



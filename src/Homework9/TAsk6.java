package Homework9;

import java.util.Arrays;

public class TAsk6 {
    public static void main(String[] args) {

        /*
        You have an array of 6 int numbers and get the square of each number from the array.
         */

        int[] array = {2,3,4,5,6,7};
        int[] result = array;
        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length; j++) {
            result[j] = array[j] * array[j];
        }
        System.out.println(Arrays.toString(result));
    }
}



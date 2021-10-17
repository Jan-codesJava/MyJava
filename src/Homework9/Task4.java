package Homework9;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        /*
        Write the application to find the second largest value from given array.
        Example:
        Given array value: 3,2,8,9,1,5,4,3,7,8,5,9,9
        Output: 8
         */

        int[] array = {3, 2, 8, 9, 1, 5, 4, 3, 7, 8, 5, 9, 9};
        int biggest = array[0];
        int secondBiggest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
            if (array[i] < biggest && array[i] > secondBiggest) {
                secondBiggest = array[i];
            }
        }
        System.out.println(biggest);
        System.out.println(secondBiggest);
        System.out.println(Arrays.toString(array));
    }
    }


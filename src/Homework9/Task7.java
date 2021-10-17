package Homework9;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        /*
        Create an int array with 6 elements and print a multiplication table for each element from an array.
         */

        int[] array = {1, 2, 3, 4, 5, 6};
        int i = 0;
        int j;
        System.out.println(Arrays.toString(array));
        for (; i < array.length; i++) {
            System.out.println(array[i]);

            for (j = 1; j <= 10; j++) {

                int result = array[i] * j;

                System.out.println(array[i] + "*" + j + "=" + result);
            }

        }
    }
}

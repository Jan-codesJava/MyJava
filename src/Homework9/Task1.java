package Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

      /*  Create the int array with given numbers 10,4,3,55,32,145,443,234,98,32
        Using scanner user to provide any number from given array, then remove the value from array and put 0 instead of that.
                Example:
        Given Number:
        234
        Output:
        10, 4, 3, 55, 32, 145, 443, 0, 98, 32

       */

        int[] arr = {10, 4, 3, 55, 32, 145, 443, 234, 98, 32};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number which you want replace by 0 from a given array:");
        int number = scan.nextInt();

        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
          //  System.out.println(arr[i]);
            if (arr[i] == number) {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }
}

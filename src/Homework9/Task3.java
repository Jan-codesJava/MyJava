package Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /*
        Create one int array with size of 10 without any value.
        Using scanner ask user to provide the int value until you filled out the array with given numbers.
        Then print the array with all numbers.
        Int [] numbers=new int[10];
        Example:
        Please enter the int number. You have 10 space in array:
        11
        Please enter the int number. You have 9 space in array:
        43
        Please enter the int number. You have 8 space in array:
        77
        .. keep continue to ask user until you don't have any space in the array.
         */

        int[] arr = new int[10];
        int count = arr.length;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            if (i <= arr.length) {
                System.out.println("PLease enter an int number. You have " + count + " spaces in array:");
                count--;
                arr[i] = scan.nextInt();
            }
        }
        for (int x : arr) ;
        System.out.println(Arrays.toString(arr));
    }
    }


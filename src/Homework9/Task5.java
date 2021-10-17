package Homework9;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        /*
        You have an array of weather conditions withFahrenheit numbers.
        The size of the array will be 6. Print the Celcius value of each array element.
         */

        int[] arr = {2, 89, 60, 18, 32, 100};
        int[] Celsius = arr;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] - 32) * 5 / 9; }   //The formula

        System.out.println(Arrays.toString(Celsius));
    }
    }


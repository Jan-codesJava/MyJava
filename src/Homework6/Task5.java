package Homework6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        /*
        Write a Java program that takes a year from user and print whether that year is a leap year or not.
Input the year: 2016
Output :2016 is a leap year
         */

        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        year = scan.nextInt();
        scan.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");


    }
}

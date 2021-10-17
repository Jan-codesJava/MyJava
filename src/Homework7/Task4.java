package Homework7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /*
        Using the scanner ask the user to provide String value.
         Then replace all the char of the String with 'a' using loop and print in every step.
For example:
Input: Success
Output:
"auccess"
"aaccess"
“aaacess”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a statement");
        String x = scan.nextLine();
        for (int i = 0; i < x.length(); i++) {

            // use replace
            //'s''a'
            //letters++

            System.out.print(x.charAt(i));


        }
    }
}
package Homework6;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        /*
        Using scanner ask user to enter any String value.
        If this String has the color like red or blue with lower case print the red or blue.

EXAMPLE-1:
Input: "xxredyy"
Output: red
EXAMPLE-2:
Input: "xbxltue"
Output: blue
         */


        Scanner object = new Scanner(System.in);
        System.out.println("Please enter a String value");
        String value = object.nextLine();

            String string = "xxredyy";
            string.toLowerCase();


            string = string.toLowerCase();
            String a = "" + string.charAt(2);
            String b = "" + string.charAt(3);
            String c = "" + string.charAt(4);
            System.out.println(a + b + c);


            /* String string = "xbxltue";
        string.toLowerCase();

        string = string.toLowerCase();
        String a = "" + string.charAt(1);
        String b = "" + string.charAt(3);
        String c = "" + string.charAt(5);
        String d = "" + string.charAt(6);

        System.out.println(a + b + c + d);

        */
    }
}

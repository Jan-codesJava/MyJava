package Homework6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /* Using scanner ask user to enter to String value and concatenate them together then print the result.
        If both String length is not same then omit chars from the longer string so it is the same length as
         the shorter string.After making both string same length then concatenate it.
                EXAMPLE-1:
        String 1: "Cell"
        String 2: "Phone"
        Output: "CellPhone"
        EXAMPLE-2:
        String 1: "Cable"
        String 2: "Mic"
        Output: "CabMic"
        */

        String str1, str2;
        Scanner word = new Scanner(System.in);
        System.out.println("Please enter the first string");
        str1 = word.nextLine();
        System.out.println("Please enter the second string");
        str2 = word.nextLine();
        System.out.println("Concatenated String is ");
        System.out.println(str1.concat(str2));

        //(str1.length() == str2.length());


    }
}

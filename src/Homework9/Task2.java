package Homework9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
        Using Scanner ask user to provide any string value and index number from the array.
        Using for loop update value from array.
        Example:
        [ Liam, Emma, Noah, Olivia, William ]
        Please enter String:
        Lucas
        Please enter index number:
        3
        Output:
        [ Liam, Emma, Noah, Lucas, William ]
         */

        String[] text = {"Liam", "Emma", "Noah", "Olivia", "William"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter string name:");
        String name = scan.nextLine();
        System.out.println("Please enter index number of array:");
        int number = scan.nextInt();

        for (int i = 0; i < text.length; i++) {
            if (i == number) {
                text[i] = name;
            }
            System.out.println(text[i]);
        }

    }
}

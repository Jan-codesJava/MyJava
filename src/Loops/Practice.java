package Loops;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

       /* create a new practice class
        get a positive integer from user which less than 10

        print out the numbers starting from that given number to 10 is included

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive integer less than 10");

        int number = input.nextInt();

        for ( ; number<= 10; number++ ){
            System.out.println("User number" +number);
        }

    }
}

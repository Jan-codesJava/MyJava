package Loops;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        //Ask user to give a number
        //create a multiplication table from 1 to 10 from that given number
        //5 >> 5*1=5
        //      5*2=10
        //      5*3=15
        //.......

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number");
        int number = input.nextInt();

        int multiplier = 1;
        while (multiplier<=10) {
            System.out.println(number + " * " + 1 + " = " + number * multiplier);
            multiplier++;


        }
    }
}
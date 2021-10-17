package Homework8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int num=0;
        int reversenum =0;
        System.out.println("Enter your number: ");

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println("The number in reverse order is: "+reversenum);



    }
}

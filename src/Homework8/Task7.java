package Homework8;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter line number");
        int count = scanner.nextInt();
        //int count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.println(" ");
            }
            for (int k = 1; k <= i; k++, count++)
                System.out.print(count + " ");
            System.out.println();
        }

    }

}




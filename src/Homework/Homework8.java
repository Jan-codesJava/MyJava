package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

    }
}

        //Task1
     /*  int num, i, s=0, sum=0;
        System.out.println("Enter number of terms");
        num=new Scanner(System.in).nextInt();
        for(i = 1; i<=num; i ++){
            s=s*10+1;
            System.out.println(s+" ");
            sum=sum+s;
        }
        System.out.println("The Sum of the Series ="+sum);



// Task2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Number");
        int start = sc.nextInt();
        System.out.println("Enter End Number");
        int end = sc.nextInt();
        System.out.println("Perfect Numbers between " + start + " and " + end + " are :");
        for (int i = start; i <= end; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) sum = sum + j;
            }
            if (i == sum) System.out.print(i + "\t");
         }

        // Task 3


        int num = 153;
        int temp = num;
        int r, sum = 0;

        while (num > 0) {
            r = num % 10;
            num = num / 10;
            sum = sum + r * r * r;
        }

        if (temp == sum)
            System.out.println("It is an ArmStrong number");
        else
            System.out.println("It is not an Armstrong number");



        // Task4


       int i = 0;
        int num = 0;
        //Empty String
        String primeNumbers = "";

        for (i = 1; i <= 50; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 50 are :");
        System.out.println(primeNumbers);
    }





        // Task 5


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




//Task6


       String str = "CIVIC";

        int start = 0;
        int end = str.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(" is Palindrome");

        } else {
            System.out.println(" is NOT a Palindrome");
            }



        // Task 7

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





      */



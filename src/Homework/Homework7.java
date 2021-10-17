package Homework;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {

        /*Using Scanner ask user to provide any int number and print multiplication table of given number
        Input number: 5
        Output :
        5 * 1 = 5
        5 * 2 = 10
        5 * 3 = 15
...
...
        5*10 = 50

        */
       /* int number = 5;

        for (int a = 1; a <= 10; a++) {
            System.out.println(number + " * " + a + " = " + number * a);

        }

        */


       /* Using a scanner ask the user to provide starting and ending numbers.
       Print the numbers divisible by 3 and 5 between given number AND print count of those numbers which is divisible by 3 and 5.
        EXAMPLE:
        First number: 5
        Second number: 65
        Output:
        15
        30
        45
        60
        Total number that divisible by 3 and 5 is 4.

        */



       /* String divisibleByThreeAndFive="";
        for(int i= 1; i<=100;++i ){
            if(i%5==0 && i%3==0){
                divisibleByThreeAndFive = divisibleByThreeAndFive + i +" , ";
            }
        }
        System.out.println(" Divisible by 3 and 5: \n"+ divisibleByThreeAndFive);

        */


       /* Using scanner ask user to provide the string value. Print "dad" if the given string contains the "dad",
        but where the middle 'a' char can be any char.
                Example:
        Input the year: testdadtest
        Output :dad
        Input the year: testd7dtest
        Output :dad
        Input the year: testdodtest
        Output :dad
        Input the year: testDudtest
        Output :dad
        */

        //need help in this task
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String value");
        int String = input.nextInt();

        String name = "testdadtest";
        System.out.println(name.indexOf("dad"));
        System.out.println( name.charAt(4));
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(6));

         */

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
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a statement");
        String x = scan.nextLine();
        for (int i = 0; i < x.length(); i++) {

            // use replace
            //'s''a'
            //letters++

                System.out.print(x.charAt(i));

 */


        /*
        Using a scanner enter the number of eggs in the box. Then ask the user, how many eggs are eaten at the end of the day and keep asking the same question until your number ofeggs is equaled to 0 in the box.
Example:
Input: 13
How many eggs did you eat today?
2
There are 11 eggs left
How many eggs did you eat today?
5
There are 6 eggs left
How many eggs did you eat today?
6
You have finished all the eggs
Description
         */

       /* Scanner input = new Scanner(System.in);

        double numberOfEggs = 13;

        System.out.println("How many eggs did you eat today?");
        double eggs1 = input.nextInt();
        System.out.println("How many eggs did you eat today?");
        double eggs2 = input.nextInt();
        System.out.println("How many eggs did you eat today?");
        double eggs3 = input.nextInt();
        double total = (numberOfEggs-eggs1-eggs2-eggs3);

        System.out.println("You have finished all the eggs "+ (total - numberOfEggs));

        */


    }
}











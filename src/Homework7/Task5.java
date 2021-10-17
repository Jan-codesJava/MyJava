package Homework7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

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

        Scanner input = new Scanner(System.in);

        double numberOfEggs = 13;

        System.out.println("How many eggs did you eat today?");
        double eggs1 = input.nextInt();
        System.out.println("How many eggs did you eat today?");
        double eggs2 = input.nextInt();
        System.out.println("How many eggs did you eat today?");
        double eggs3 = input.nextInt();
        double total = (numberOfEggs-eggs1-eggs2-eggs3);

        System.out.println("You have finished all the eggs "+ (total - numberOfEggs));




    }
}

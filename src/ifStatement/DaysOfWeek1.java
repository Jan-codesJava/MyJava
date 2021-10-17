package ifStatement;

import java.util.Scanner;

public class DaysOfWeek1 {
    public static void main(String[] args) {
        /*
        ask user to enter first letter of the day
        print:
        M --> It is Monday
        T --> It is Tuesday or Thursday
        W --> It is Wednesday
        F --> It is Friday
        S --> It is  Saturday or Sunday

         */

        Scanner object = new Scanner(System.in);

        System.out.println("Please enter a first letter of the day you want to see: ");

        String letter = object.nextLine();

        if (letter.equalsIgnoreCase("M")){
            System.out.println("It is Monday");
        }
        if (letter.equalsIgnoreCase("T")){
            System.out.println("It is Tuesday or Thursday");
        }
        if (letter.equalsIgnoreCase("W")){
            System.out.println("It is Wednesday");
        }
        if (letter.equalsIgnoreCase("F")){
            System.out.println("It is Friday");
        }
        if (letter.equalsIgnoreCase("S")){
            System.out.println("It is either Saturday || Sunday");

        }
        else {
            System.out.println("Your entry is not valid, there is no day starting with that char");
        }
    }
}

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class    Task1 {
    public static void main(String[] args) {


        /*
        ask user how many names of people they want to store
        -get names from user to save
        -store those names in an String array
        -if the name has 5 or more letters ; save it to an array named as longNames
        if the name has less than 5 letters save it to an array as named as sortNames
        -print out those longNames and shortNames arrays by using toString() method
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("How many names of people they want to store?");
        int size = scanner.nextInt();
        // scanner.nextLine();

        String longNames[] = new String[size];
        String[] shortNames = new String[size];

        for (int i = 0; i<size; i ++){

            System.out.println("Please enter a name");
            String name = scanner.next();
            if (name.length()>=5) {
                longNames[i] = name;
            }else{
                shortNames[i] =name;
        }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));



        }
}

package Project;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringJoiner;

public class Project5 {
    public static void main(String[] args) {

        /*Reverse a given String and return it, if they have
        space in the beginning and at the end then remove it.
        Example:
        " Job" -> "boJ"
                * " Happy " -> "yppaH"
                * "Sun " -> "nuS"
                * " Dream Job!" -> "!boJ maerD"
         */

      /*  String r = reverse("Job");
        System.out.println(r);

    }

    public static String reverse(String s) {
        char[] letters = new char[s.length()];

        int letterIndex = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            letters[letterIndex] = s.charAt(i);
            letterIndex++;

        }
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverse = reverse + letters[i];

        }
        return reverse;
    }
}

       */
//Task 2
       /* Using the scanner asks the user to input the min and max number.
        Write a java code that will calculate the sum of numbers between the range of min and max
        and those that can only be divided by 2 and 7.(min and max numbers are included)
        */


/*
                Scanner input = new Scanner(System.in).useLocale(Locale.US);

                System.out.print("Input 1st integer: ");
                int num1 = input.nextInt();

                System.out.print("Input 2nd integer: ");
                int num2 = input.nextInt();

                System.out.println("Input 3d integer: ");
                int num3 = input.nextInt();

                System.out.println("Sum of two integers: " + (num1 + num2 + num3));
               // System.out.println("Difference of two integers: " + (num1 - num2));
               // System.out.println("Product of two integers: " + (num1 * num2));
                System.out.printf("Average of three integers: %.2f", ((num1 + num2 + num3) / (double) 2));


                System.out.printf("Average of three integers: %.7f", ((num1 + num2 + num3) / (double) 7));
                //System.out.println("Distance of two integers: " + Math.abs(num1-num2));

                System.out.println("Max integer: " + Math.max( num1, num3));
                System.out.println("Min integer: " + Math.min( num1, num3));
            }

        }


        // Task3
       /* Using a scanner ask a user to provide one int number.
       if the number is a prime number then print "Prime Number"otherwise print it is not a prime number.

        NOTE:
        A prime number is a whole number greater than 1 whose only factors are 1 and itself.
        A factor is a whole number that can be divided evenly into another number. The first few prime numbers
        are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.

        */


/*
        int i = 0;
        int num = 0;
        //Empty String
        String primeNumbers = "";



        for (i = 1; i <= 100; i++) {
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
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}

 */
/*

//Task4
Ask the user to enter one number between 1 to 10 then,
Write the program to print the string in the following format:
 */
     /*   int i,j,n;

        System.out.print("Input number of n : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(i);
            System.out.println("");
        }
    }


      */


//Task 5

/*Ask the user to enter one in number between 1 to 10 then,
Write the program to print the string in the following format:

 */

       /* for (int i =6; i>=1; i--){ // i 5

            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


        */

       /*
       Task6
       Using the scanner ask the user to enter one string value and print only unique
       letters combined as String also without any space in the beginning and at the end.
Example -1 :
Given Value: "i am happy"
Output: i am hpy
Example-2:
Given Value: " contribute"
Output: contribue
Example-3:
Given Value: " i want cup of coffee "
Output: i want cup of e

        */

/*
      Scanner input = new Scanner(System.in);
        System.out.println("Please enter your line");
        String userInput = input.nextLine();

        userInput = userInput.trim();

        String[] letters;
        letters = userInput.split("");

        for (int i=0; i<letters.length; i++){
            for (int k=1; k<letters.length; k++){
                if(k>i && letters[k].equalsIgnoreCase(letters[i])&& (!letters[i].equals(""))){
                    if (letters[k].equals(" "))
                        continue;
                    letters[k] = "";
                }
            }
        }
        for (int i=0; i<letters.length; i++){
            if (!letters[i].equals("")){
                System.out.print(letters[i]);
            }
        }
    }
}

 */


    }
}
package Homework;

public class JavaProject2 {
    public static void main(String[] args) {

       /*/Task3

        I need to write a program that will take a given amount of money and return the
        number of dollars in quarters,
                dimes,nickels,and pennies that makeup that given amount
                Example1:
        Please enter your balance:2.36 $2.36 will make 9 quarters 1 dime 0 nickels and 1 pennies

         */

/*
        double givenAmount = 2.36;
        int balance1 =(int) (givenAmount*100);
        double quarters = balance1/ 25;
        balance1 = balance1 %25;
        double dime =balance1/ 10;
        balance1 = balance1%10;
        double nickels = balance1 / 5;
        balance1 = balance1 % 5;
        double pennies = balance1/ 1;
        System.out.println(balance1 + " will make");
        System.out.println(quarters + " quarters");
        System.out.println( dime + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
















        /*/

       /*Task4
       Write a program that will accept only 6 digit numbers like 578432
       and find multiplication(5*7*8*4*3*2)of all digits and sum(5+7+8+4+3+2)of all digits

           */

       /*


        int number = 578432;
        int n6 = number%10;
        number=number/10;
        int n5 = number%10;
        number=number/10;
        int n4 = number%10;
        number=number/10;
        int n3 = number%10;
        number=number/10;
        int n2 = number%10;
        number=number/10;
        int n1 = number%10;
        number=number/10;
        System.out.println( "Multiplication of all digits is " + n6*n5*n4*n3*n2*n1);
        System.out.println(  "The sum of all digits is " + (n6+n5+n4+n3+n2+n1));





        int num = 327695;
        int n_6 = number%10;
          number=number/10;
        int n_5 = number%10;
          number=number/10;
        int n_4 = number%10;
          number=number/10;
        int n_3 = number%10;
          number=number/10;
        int n_2 = number%10;
          number=number/10;
        int n_1 = number%10;
          number=number/10;
        System.out.println( "Multiplication of all digits is " + n_6*n_5*n_4*n_3*n_2*n_1);
        System.out.println( "The sum of all digits is " + ( n_6+n_5+n_4+n_3+n_2+n_1));





        // Task 5
        Write a program that will accept 5 digit number and will print reversed number at the end.
        */

       /* int num = 53876, reversed = 0;

        // run loop until num becomes 0
        while (num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }

        */

    /* int num1 = 97352, reversed = 0;

    // run loop until num becomes 0
    while(num1 != 0) {

        // get last digit from num
        int digit = num1 % 10;
        reversed = reversed * 10 + digit;

        // remove the last digit from num
        num1 /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
}


     */

    }
}
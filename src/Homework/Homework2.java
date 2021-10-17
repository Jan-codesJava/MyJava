package Homework;

public class Homework2 {
    public static void main(String[] args) {

        //Task 1

        char l1 = 'T';
        char l2 = 'E';
        char l3 = 'C';
        char l4 = 'H';
        char l5 = 'T';
        char l6 = 'O';
        char l7 = 'R';
        char l8 = 'I';
        char l9 = 'A';
        char l10= 'L';

        System.out.println(l1+" "+l2+" "+l3+" "+l4+" "+l5+" "+l6+" "+l7+" "+l8+" "+l9+" "+l10);

        /*System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);
        System.out.println(l7);
        System.out.println(l8);
        System.out.println(l9);
        System.out.println(l10);

         */


       // Task2


        int result=4*7+3-2*9%5/3-2;
        System.out.println(result);
         /*
         1) 4*7= 28
         2) 2*9 = 18
         3) 18%5 = 3
         4) 3/3 = 1
         5) 28 +3 = 31
         6) 31-1 =30
         7) 30 - 2 = 28


          */


        int result1= 12-3/3+4-2*2%4+12%3/3;
        System.out.println(result1);
        /*
        1) 3/3 = 1
        2) 2*2%4 = 0
        3) 12%3/3 = 0
        5) 12 - 1 = 11
        6) 11 + 4 = 15
        7) 15 + 0 = 15

         */

        //Task 3

       int first_num = 125;
       int second_num = 24;

       int Multiplication;
       int Division;
       int Sum;
       int Subtraction;
       int Modulus;

       Multiplication = first_num*second_num;
       System.out.println(" 125+24="+ Multiplication);
       Division = first_num/second_num;
       System.out.println(" 125/24="+ Division);
       Sum = first_num+second_num;
       System.out.println("125+24="+ Sum);
       Subtraction = first_num-second_num;
       System.out.println("125-24="+ Subtraction);
       Modulus = first_num%second_num;
       System.out.println("125 mod 24="+ Modulus);


       // Task 4

        double width = 5.5;
        double height = 8.5;
        double areaOfRectangle = width*height;
        System.out.println("Area is 5.5*8.5="+areaOfRectangle);
        double perimeterOfRectangle = 2*(width+height);
        System.out.println("The perimeter is 2*(5.5*8.5)="+perimeterOfRectangle);

       // Task 5

        int number = 8;
        int f0 = number * 1;
        System.out.println(number+"x1="+f0);
        int f1 = number * 2;
        System.out.println(number+"x2="+f1);
        int f2 = number * 3;
        System.out.println(number+"x3="+f2);
        int f3 = number * 4;
        System.out.println(number+"x4="+f3);
        int f4 = number * 5;
        System.out.println(number+"x5="+f4);
        int f5 = number * 6;
        System.out.println(number+"x6="+f5);
        int f6 = number * 7;
        System.out.println(number+"x7="+f6);
        int f7 = number * 8;
        System.out.println(number+"x8="+f7);
        int f8 = number * 9;
        System.out.println(number+"x9="+f8);
        int f9 = number * 10;
        System.out.println(number+"x10="+f9);

        //Task 6

        int salary = 200000;
        int halfSalary = (50*salary)/100;
        int bonusAmount = 5*halfSalary/100;
        System.out.println("5 percent bonus for 50 percent of the salary is "+bonusAmount);
        int hS1 = 30*salary/100;
        int bA1 = 8*hS1/100;
        System.out.println("8 percent bonus for 30 percent of the salary is "+bA1);
        int hS2 = 20*salary/100;
        int bA2 = 10*hS2/100;
        System.out.println("10 percent of bonus 20 percent of the salary is "+bA2);



    }
}

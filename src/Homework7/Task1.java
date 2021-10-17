package Homework7;

public class Task1 {

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
        int number = 5;

        for (int a = 1; a <= 10; a++) {
            System.out.println(number + " * " + a + " = " + number * a);

        }

    }
}
